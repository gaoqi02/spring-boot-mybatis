package com.ecbusiness.service;

import com.ecbusiness.domain.OrderInfoVo;
import com.ecbusiness.domain.OrderShippingVo;
import com.ecbusiness.mapper.*;
import com.ecbusiness.model.*;
import com.weejinfu.common.exception.BaseException;
import com.weejinfu.common.model.Order;
import com.weejinfu.common.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * {select p.PRODUCT_BRAND_ID as brandId,of.ORDER_STATE as orderState,of.paid_time as paidTime
 * ,of.order_id as orderId,oi.GOODS_SUM_FEE as orderPaidFee,oi.goods_name as goodsName,of.order_notes as orderNotes
 * ,of.receive_user as receiveUser,os.TO_MOBILE as toMobile,os.TO_ADDRESS as toAddress,os.ORDER_SHIPPING_NO as orderShippingNo,
 * of.LOGISTIC_COMPANY_ID as logisticsCompanyId,of.finish_time as finishTime,oi.ORDER_ITEM_ID as orderItemId,of.ORDER_STATE as orderState
 * from product p inner join goods g on g.PRODUCT_ID=p.PRODUCT_ID
 * inner JOIN order_item oi on oi.GOODS_ID=g.GOODS_ID inner JOIN
 * order_info of on oi.ORDER_ID=of.ORDER_ID left JOIN order_shipping os on os.ORDER_ITEM_ID=oi.ORDER_ITEM_ID }
 * 这个是查询orderInfoVo的baseSql 需要的where 的条件语句可以作为查询的参数传入。
 *
 * Created by gaoqi on 2016/1/20.
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Autowired
    private OrderShippingMapper orderShippingMapper;

    @Autowired
    private ProductBrandMapper productBrandMapper;

    @Autowired
    private ProductImgMapper productImgMapper;

    public List<OrderInfoVo> queryOrderList(int brandId, List<Integer> list,int offset,int limit) {
        List<OrderInfoVo> orderInfoVos = orderDao.queryOrderInfo(brandId, list,offset,limit);
        return orderInfoVos;
    }

    public List<OrderInfoVo> queryUnDeliveryOrders(int brandId) {
        List<OrderInfoVo> orderInfoVos = orderDao.queryUnDeliveryOrders(brandId);
        return orderInfoVos;
    }

    public int queryOrderAmount(int brandId) {
        List<OrderInfoVo> orderInfoVos = orderDao.queryOrderAmount(brandId);
        return orderInfoVos.size();
    }

    public int queryTodayOrderAmount(int brandId, Date date) {

        String dataStr = DateUtils.formatDD(date);
        List<OrderInfoVo> orderInfoVos =
                orderDao.queryCommonOrderInfo(
                        "where p.PRODUCT_BRAND_ID=" + brandId + " and of.finish_time>date_format(" + dataStr + "," +
                                " '%Y-%m-%d 00:00:00') and of.is_delete='N'");
        return orderInfoVos.size();
    }

    /**
     * 输入的是orderItemId 这是查询的最小单位
     * @param orderId
     * @return
     * @throws NullPointerException
     */
    public List<OrderInfoVo> getByOrderId(String orderId) throws NullPointerException {
        OrderInfoCriteria orderInfoCriteria = new OrderInfoCriteria();
        orderInfoCriteria.createCriteria().andOrderIdEqualTo(orderId);

        OrderInfo orderInfo = new OrderInfo();
        List<OrderInfo> orderInfos = orderInfoMapper.selectByExample(orderInfoCriteria);
        if (orderInfo != null && orderInfos.size() > 0) {
            orderInfo = orderInfos.get(0);
        } else {
            throw new BaseException(500, "无指定的订单");
        }

        OrderItemCriteria orderItemCriteria = new OrderItemCriteria();
        orderItemCriteria.createCriteria().andOrderIdEqualTo(orderId);
        List<OrderItem> orderItems = orderItemMapper.selectByExample(orderItemCriteria);

        List<OrderInfoVo> orderInfoVos = new ArrayList<>();

        //快递记录
        OrderShippingCriteria orderShippingCriteria = new OrderShippingCriteria();
        orderShippingCriteria.createCriteria().andOrderIdEqualTo(orderInfo.getOrderId());
        List<OrderShipping> orderShippings = orderShippingMapper.selectByExample(orderShippingCriteria);
        OrderShipping orderShipping = new OrderShipping();
        if (orderShippings != null && orderShippings.size() > 0) {
            orderShipping = orderShippings.get(0);
        }

        if (orderItems == null || orderItems.size() == 0) {
            return null;
        }
        for (OrderItem orderItem : orderItems) {
            //对应的goods和product
            Goods goods = goodsMapper.selectByPrimaryKey(orderItem.getGoodsId());
            Product product = productMapper.selectByPrimaryKey(goods.getProductId());
            ProductImgCriteria productImgCriteria = new ProductImgCriteria();
            productImgCriteria.createCriteria().andProductIdEqualTo(product.getProductId());
            ProductImg productImg = productImgMapper.selectByExample(productImgCriteria).get(0);
            //构建OrderInfoVo
            OrderInfoVo orderInfoVo = new OrderInfoVo();
            orderInfoVo.setBrandId(product.getProductBrandId());
            orderInfoVo.setGoodsName(goods.getGoodsName());
            orderInfoVo.setFinishTime(orderInfo.getFinishTime());
            orderInfoVo.setOrderPaidFee(orderInfo.getOrderPayFee());
            orderInfoVo.setLogisticsCompany(orderDao.getLogisticCompayById(orderInfo.getLogisticCompanyId()));
            orderInfoVo.setLogisticsCompanyId(orderInfo.getLogisticCompanyId() != null ? orderInfo.getLogisticCompanyId(): 0);
            orderInfoVo.setOrderId(orderInfo.getOrderId());
            orderInfoVo.setOrderItemId(orderItem.getOrderItemId());
            orderInfoVo.setOrderNotes(orderInfo.getOrderNotes());
            orderInfoVo.setToMobile(orderShipping.getToMobile());
            orderInfoVo.setToAddress(orderShipping.getToAddress());
            orderInfoVo.setOrderState(orderInfo.getOrderState());
            orderInfoVo.setFinishTime(orderInfo.getFinishTime());
            orderInfoVo.setOrderShippingNo(orderShipping.getOrderShippingNo());
            orderInfoVo.setOrderNotes(orderInfo.getOrderNotes());
            orderInfoVo.setReceiveUser(orderShipping.getToUser());
            orderInfoVo.setPaidTime(orderInfo.getPaidTime());
            orderInfoVo.setImgUrl(productImg.getProImageUrl());
            orderInfoVos.add(orderInfoVo);
        }


        return orderInfoVos;
    }

    /**
     * orderId 这是查询相关的items
     * @param orderId
     * @return
     * @throws NullPointerException
     */
    public List<OrderInfoVo> getByOrderItemId(String orderId, BrandMember member) throws NullPointerException {
        return
                orderDao.queryCommonOrderInfo
                        ("where oi.order_item_id = '"+ orderId +"' and p.product_brand_id="+member.getBrandId());
    }

    public List<OrderInfoVo> queryBusinessPaidOrders(int brandId, int paid) {
        List<OrderInfoVo> orderInfoVos =
                orderDao.queryCommonOrderInfo
                        ("where p.PRODUCT_BRAND_ID="+ brandId +" and oi.business_paid="+paid+" and of.is_delete='N'");
        return orderInfoVos;
    }

    /**
     * 新建订单的快递单号
     * 新建order_shipping对象
     * @param orderShippingVo
     * @return
     */
    public int createShippingOrder(OrderShippingVo orderShippingVo, BrandMember brandMember) {
        OrderShippingCriteria orderShippingCriteria = new OrderShippingCriteria();
        orderShippingCriteria.createCriteria().andOrderIdEqualTo(orderShippingVo.getOrderId());
        List<OrderShipping> orderShippings = orderShippingMapper.selectByExample(orderShippingCriteria);
        if (orderShippings != null && orderShippings.size() > 0) {
//            throw new BaseException(500, "此项物品已经发货，请去往详情区修改");
            return 500;
        }

        ProductBrand productBrand = productBrandMapper.selectByPrimaryKey(brandMember.getBrandId());

        OrderShipping orderShipping = new OrderShipping();
        orderShipping.setToMobile(orderShippingVo.getToMobile());
        orderShipping.setToUser(orderShippingVo.getReceiveUser());
        orderShipping.setToAddress(orderShippingVo.getToAddress());
        orderShipping.setOrderId(orderShippingVo.getOrderId());
        orderShipping.setAddUserId(brandMember.getId());
        orderShipping.setAddTime(DateUtils.formatSS(new Date()));
        orderShipping.setShippingTime(orderShipping.getAddTime());
        orderShipping.setFromAddress(productBrand.getProductBrandName());
        orderShipping.setFromCompany(productBrand.getProductBrandName());
        orderShipping.setFromUser(brandMember.getRealName());
        orderShipping.setOrderShippingNo(orderShippingVo.getOrderShippingNo());
        orderShipping.setLogisticCompanyId(orderShippingVo.getLogisticsCompanyId());

        return orderShippingMapper.insert(orderShipping);

    }

    public List<OrderItem> queryItemsByOrderId(String orderId) {
        OrderItemCriteria orderItemCriteria = new OrderItemCriteria();
        orderItemCriteria.createCriteria().andOrderIdEqualTo(orderId);

        return orderItemMapper.selectByExample(orderItemCriteria);

    }

    public int updateOrderStates2Delivery(String orderId) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(orderId);
        orderInfo.setOrderState(25); //已出库
        orderInfo.setOrderOutState(21); //已发货
        return orderInfoMapper.updateByPrimaryKeySelective(orderInfo);
    }

    public int countByBrandId(int brandId) {
        OrderInfoCriteria criteria = new OrderInfoCriteria();
        criteria.createCriteria().andBrandIdEqualTo(brandId);
        return orderInfoMapper.countByExample(criteria);
    }

}
