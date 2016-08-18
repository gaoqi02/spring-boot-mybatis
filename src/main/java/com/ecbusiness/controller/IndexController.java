package com.ecbusiness.controller;

import com.ecbusiness.domain.OrderInfoVo;
import com.ecbusiness.enums.OrderStateEnum;
import com.ecbusiness.mapper.GoodsMapper;
import com.ecbusiness.mapper.OrderDao;
import com.ecbusiness.mapper.OrderShippingMapper;
import com.ecbusiness.mapper.ProductImgMapper;
import com.ecbusiness.model.*;
import com.ecbusiness.service.OrderService;
import com.ecbusiness.utils.DataUtil;
import com.weejinfu.common.exception.BaseException;
import com.weejinfu.common.message.JsonData;
import com.weejinfu.common.util.DateUtils;
import com.weejinfu.common.util.JSONUtils;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * 厂家后台的首页面
 * Created by gaoqi on 2016/1/19.
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {

    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderShippingMapper orderShippingMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private ProductImgMapper productImgMapper;

    /**
     * 首页获取所有订单的信息
     * @param session
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String detail(HttpSession session,Map<String, Object> model,
    		@RequestParam(value="offset",defaultValue="0") int offset,
    		@RequestParam(value="limit",defaultValue="10") int limit){
        JsonData jsonData = new JsonData(true);

        try {
            BrandMember brandMember = (BrandMember)session.getAttribute("brandMember");
            if (brandMember == null) {
//                throw new BaseException(500, "登录过期需要重新登录");
                return "/login";
            }
//            BrandMember brandMember = new BrandMember();
//            brandMember.setBrandId(9);
//            brandMember.setUserName("gaoqida");
            List<OrderInfoVo> orderInfoVos =
                    orderService.queryOrderList(brandMember.getBrandId(), OrderStateEnum.getAllOrderState(),offset,limit);

            //显示默认的快递公司是什么
            for (OrderInfoVo orderInfoVo : orderInfoVos) {
                //订单的状态
                orderInfoVo.setOrderStateString(orderInfoVo.getOrderState());
                List<OrderItem> orderItems = orderService.queryItemsByOrderId(orderInfoVo.getOrderId());
                for (OrderItem orderItem : orderItems) {
                    Goods goods = goodsMapper.selectByPrimaryKey(orderItem.getGoodsId());
                    ProductImgCriteria productImgCriteria = new ProductImgCriteria();
                    productImgCriteria.createCriteria().andProductIdEqualTo(goods.getProductId());
                    List<ProductImg> productImgs = productImgMapper.selectByExample(productImgCriteria);
                    if (productImgs!=null && productImgs.size()>0) {
                        orderItem.setImgUrl(productImgs.get(0).getProImageUrl()+"_small"+productImgs.get(0).getImageOrign());
                    } else {
                        orderItem.setImgUrl("");
                    }
                }
                orderInfoVo.setOrderItems(orderItems);

            }

            //订单总数
            int totalOrderNum = orderService.countByBrandId(brandMember.getBrandId());
            int totalPage = totalOrderNum / 10 + 1;
            model.put("totalPage", totalPage);

            //所有的订单 还未做分页
            model.put("orderInfos", orderInfoVos);
            //用户名
            model.put("userName", brandMember.getRealName() == null? brandMember.getUserName():brandMember.getRealName());
            if (null == model.get("userName")) {
                model.put("userName", brandMember.getMobile());
            }
            //今日新单
            String dataStr = DateUtils.formatDD(new Date());
            int todayOrder = 0;
            for (OrderInfoVo orderInfoVo : orderInfoVos) {
                if (orderInfoVo.getFinishTime().compareTo(dataStr) > 0) {
                    todayOrder++;
                }
            }
            model.put("todayNewOrderAmount", todayOrder);
//            model.put("todayNewOrderAmount", orderService.queryTodayOrderAmount(brandMember.getBrandId(), new Date()));
            //总订单
            model.put("orderAmount", orderInfoVos.size());

//            DataUtil.indexTestData(model);

        } catch (BaseException e) {
            jsonData.setErrResult(e);
        }

        return "/index2";
    }

    /**
     * 对order进行过滤
     * 相同orderinfo_id的放在一起处理
     * @param orderInfoVos
     * @return
     */
    private HashMap<String, List<OrderInfoVo>> filterOrderInfoVos(List<OrderInfoVo> orderInfoVos) {
        HashMap<String, List<OrderInfoVo>> hashMap = new HashMap<>();

        //显示默认的快递公司是什么
        for (OrderInfoVo orderInfoVo : orderInfoVos) {
            //相同order_Info_id放在一起处理
            if (!hashMap.containsKey(orderInfoVo.getOrderId())) {
                List<OrderInfoVo> list = new ArrayList<>();
                list.add(orderInfoVo);
                hashMap.put(orderInfoVo.getOrderId(), list);
            } else {
                hashMap.get(orderInfoVo.getOrderId()).add(orderInfoVo);
            }
        }

        return hashMap;
    }
}
