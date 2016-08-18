package com.ecbusiness.controller;

import com.ecbusiness.domain.OrderInfoVo;
import com.ecbusiness.domain.OrderShippingVo;
import com.ecbusiness.enums.OrderOfflinePaidEnum;
import com.ecbusiness.enums.OrderStateEnum;
import com.ecbusiness.mapper.*;
import com.ecbusiness.model.*;
import com.ecbusiness.service.OrderService;
import com.ecbusiness.utils.DataUtil;
import com.weejinfu.common.exception.BaseException;
import com.weejinfu.common.message.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaoqi on 2016/1/20.
 */
@Controller
@RequestMapping(value = "/order")
public class OrderController {

	@Autowired
	private OrderInfoMapper orderInfoMapper;

	@Autowired
	private OrderService orderService;

	@Autowired
	private OrderShippingMapper orderShippingMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private ProductImgMapper productImgMapper;

	@Autowired
	private OrderDao orderDao;

	/**
	 * 订单首页 .....order.ftl
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String orderBusinessPaid(HttpSession session, Map<String, Object> model,
    		@RequestParam(value="offset",defaultValue="0") int offset,
    		@RequestParam(value="limit",defaultValue="10") int limit) throws ClassCastException {

		try {
			BrandMember brandMember = (BrandMember) session.getAttribute("brandMember");
			if (brandMember == null) {
//				throw new BaseException(500, "登录过期需要重新登录");
				return "/login";
			}
//			BrandMember brandMember = new BrandMember();
//			brandMember.setBrandId(9);
//			brandMember.setUserName("gaoqida");
			List<OrderInfoVo> orderInfoVos = orderService.queryOrderList(brandMember.getBrandId(),
					OrderStateEnum.getAllOrderState(),offset,limit);
			// 显示默认的快递公司是什么
			for (OrderInfoVo orderInfoVo : orderInfoVos) {
                //订单的状态
                orderInfoVo.setOrderStateString(orderInfoVo.getOrderState());
                List<OrderItem> orderItems = orderService.queryItemsByOrderId(orderInfoVo.getOrderId());
                orderInfoVo.setOrderItems(orderItems);
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
                if (orderInfoVo.getOrderShippingNo() != null && !orderInfoVo.getOrderShippingNo().equals("")) {
                    OrderShippingCriteria orderShippingCriteria = new OrderShippingCriteria();
                    orderShippingCriteria.createCriteria().andOrderShippingNoEqualTo(orderInfoVo.getOrderShippingNo());
                    OrderShipping orderShipping = orderShippingMapper.selectByExample(orderShippingCriteria).get(0);
                    orderInfoVo.setLogisticsTime(orderShipping.getShippingTime());
                }
			}

			//订单总数
			int totalOrderNum = orderService.countByBrandId(brandMember.getBrandId());
			int totalPage = totalOrderNum / 10 + 1;
			model.put("totalPage", totalPage);

			// 所有的订单 还未做分页
			model.put("orderInfos", orderInfoVos);
			// 用户名
			model.put("userName",
					brandMember.getRealName() == null ? brandMember.getUserName() : brandMember.getRealName());
			if (null == model.get("userName")) {
				model.put("userName", brandMember.getMobile());
			}
			// 未到账货款
			BigDecimal unReached = orderDao.queryReachedOrUnReachedPaid(brandMember.getBrandId(),
					OrderStateEnum.getUnconfirmBusinessPaidState());
			if (unReached == null)
				unReached = new BigDecimal(0);
			model.put("unReached", unReached);

			// 已到账货款
			BigDecimal reached = orderDao.queryReachedOrUnReachedPaid(brandMember.getBrandId(),
					OrderStateEnum.getConfirmBusinessPaidState());
			if (reached == null)
				reached = new BigDecimal(0);
			model.put("reached", reached);

			// 总货款
			model.put("sum", reached.add(unReached));

//			DataUtil.indexTestData(model);
		} catch (BaseException e) {
			e.printStackTrace();
		}

		return "/orderinfo";
	}

	/**
	 * 创建快递信息
	 * 
	 * @param session
	 * @return
	 * @throws ClassCastException
	 */
	@RequestMapping(value = "/shipping", method = RequestMethod.POST)
	@ResponseBody
	public JsonData saveShippingController(@RequestBody OrderShippingVo orderShipingVo, HttpSession session)
			throws ClassCastException {
		JsonData jsonData = new JsonData(true);

		try {
			BrandMember manager = (BrandMember) session.getAttribute("brandMember");
//            BrandMember manager = new BrandMember();
//            manager.setBrandId(9);
//            manager.setUserName("sd");
			if (manager == null) {
//				throw new BaseException(500, "超时了请重新登录");
				jsonData.setErrResult(500, "超时了请重新登录");
				return jsonData;
			}
			int createRst = orderService.createShippingOrder(orderShipingVo, manager);
			if (createRst < 1) {
//				throw new BaseException(500, "存储详情失败");
				jsonData.setErrResult(500, "存储详情失败");
				return jsonData;
			} else if (createRst == 500) {
				jsonData.setErrResult(500, "此项物品已经发货，请去往详情区修改");
				return jsonData;
			}
			if (orderService.updateOrderStates2Delivery(orderShipingVo.getOrderId()) < 0) {
				jsonData.setErrResult(500, "更新订单状态失败");
				return jsonData;
			}
            jsonData.put("success", true);

		} catch (BaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonData.setErrResult(e);
            jsonData.put("success", false);
		}

		return jsonData;

	}

	/**
	 * 更新快递信息
	 * 
	 * @param session
	 * @return
	 * @throws ClassCastException
	 */
	@RequestMapping(value = "/shipping", method = RequestMethod.PUT)
	@ResponseBody
	public JsonData updateShippingController(@RequestBody OrderShipping orderShipping, HttpSession session)
			throws ClassCastException {
		JsonData jsonData = new JsonData(true);

		try {
//			BrandMember manager = (BrandMember) session.getAttribute("brandMember");
            BrandMember manager = new BrandMember();
            manager.setBrandId(9);
            manager.setUserName("sd");
			if (manager == null) {
				throw new BaseException(500, "超时了请重新登录");
			}
			OrderShippingCriteria orderShippingCriteria = new OrderShippingCriteria();
			orderShippingCriteria.createCriteria().andOrderIdEqualTo(orderShipping.getOrderId());

			List<OrderShipping> orderShippings = orderShippingMapper.selectByExample(orderShippingCriteria);
			if (orderShippings == null || orderShippings.size() == 0) {
				throw new BaseException(500, "无相关的快递信息");
			}
			// 更新快递信息
			orderShipping.setOrderShippingId(orderShippings.get(0).getOrderShippingId());
			orderShippingMapper.updateByPrimaryKeySelective(orderShipping);
            jsonData.put("success", true);
		} catch (BaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonData.setErrResult(e);
            jsonData.put("success", false);
		}

		return jsonData;

	}

	/**
	 * 获取发货或者未发货的订单
	 * 
	 * @param flag
	 *            0:未发货 1:已发货
	 * @param session
	 * @return
	 * @throws ClassCastException
	 */
	@RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
	public JsonData getOrderByState(@RequestParam(value = "flag", defaultValue = "0") int flag, HttpSession session,
			@RequestParam(value = "offset", defaultValue = "0") int offset,
			@RequestParam(value = "limit", defaultValue = "10") int limit) throws ClassCastException {
		JsonData jsonData = new JsonData(true);

		try {
			BrandMember manager = (BrandMember) session.getAttribute("brandMember");
			// BrandMember manager = new BrandMember();
			// manager.setBrandId(1);
			if (manager == null) {
				throw new BaseException(500, "超时了请重新登录");
			}
			List<OrderInfoVo> orderInfoVos = new ArrayList<>();
			if (flag == 0) {
				orderInfoVos = orderService.queryOrderList(manager.getBrandId(),
						OrderStateEnum.getUnDeliverOrderState(), offset, limit);
			} else if (flag == 1) {
				// 注意！如果已经发货了那么就要去看order_shipping的运单id是否有值！不是再看订单的状态了！
				orderInfoVos = orderService.queryUnDeliveryOrders(manager.getBrandId());
			}
            jsonData.put("success", true);
			jsonData.put("orderInfos", orderInfoVos);

		} catch (BaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonData.setErrResult(e);
            jsonData.put("success", false);
		}

		return jsonData;

	}

	/**
	 * 根据订单id获取orderinfo详情 因为orderItem是最小的快递单位 所以按照这个来查询
	 * 
	 * @param id
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getOrderId(@PathVariable("id") String id, HttpSession session, Map<String, Object> model)
			throws ClassCastException {
		JsonData jsonData = new JsonData(true);

		try {
			BrandMember brandMember = (BrandMember) session.getAttribute("brandMember");
			if (brandMember == null) {
				throw new BaseException(500, "登录过期需要重新登录");
			}
			// BrandMember brandMember = new BrandMember();
			// brandMember.setBrandId(1);
			// brandMember.setUserName("sd");
			List<OrderInfoVo> orderInfoVos = orderService.getByOrderId(id);
			if (orderInfoVos != null) {
				if (orderInfoVos.get(0).getBrandId() != brandMember.getBrandId()) {
					throw new BaseException(500, "您无权查看非本门店的订单");
				}
				model.put("orderInfo", orderInfoVos);
				if (orderInfoVos.get(0).getOrderShippingNo() == null) {
					model.put("orderShippingInfo", null);
				} else {
					OrderShippingCriteria criteria = new OrderShippingCriteria();
					criteria.createCriteria().andOrderShippingNoEqualTo(orderInfoVos.get(0).getOrderShippingNo())
							.andIsDeleteEqualTo("N");
					List<OrderShipping> shippings = orderShippingMapper.selectByExample(criteria);
					model.put("orderShippingInfo",
							(shippings == null || shippings.size() == 0) ? null : shippings.get(0));
				}
			} else {
				model.put("orderInfo", null);
				model.put("orderShippingInfo", null);
			}

		} catch (BaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonData.setErrResult(e);
			return "error/error";
		}

		return "/orderinfo";

	}

	/**
	 * 根据订单id获取相关orderItem详情
	 * 
	 * @param id
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/orderItem/{id}", method = RequestMethod.GET)
	public String getOrderyId(@PathVariable("id") String id, HttpSession session, Map<String, Object> model)
			throws ClassCastException {
		JsonData jsonData = new JsonData(true);

		try {
			BrandMember brandMember = (BrandMember) session.getAttribute("brandMember");
			if (brandMember == null) {
				throw new BaseException(500, "登录过期需要重新登录");
			}
			// BrandMember brandMember = new BrandMember();
			// brandMember.setBrandId(1);
			// brandMember.setUserName("sd");
			List<OrderInfoVo> orderInfoVos = orderService.getByOrderItemId(id, brandMember);
			model.put("orderInfo", orderInfoVos);

		} catch (BaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonData.setErrResult(e);
			return "error/error";
		}

		return "/orderinfo";

	}

	/**
	 * 厂家筛选买线网线下打款的单子
	 * 
	 * @param paid
	 *            0:未打款 1:打款中 2:打款成功已到账 9:打款失败
	 * @param session
	 * @return
	 * @throws ClassCastException
	 */
	@RequestMapping(value = "/business_paid", method = RequestMethod.POST)
    @ResponseBody
	public JsonData getBussinessPaidOrders(@RequestParam("paid") int paid, HttpSession session)
			throws ClassCastException {
		JsonData jsonData = new JsonData(true);

		try {
			BrandMember manager = (BrandMember) session.getAttribute("brandMember");

			if (manager == null) {
				throw new BaseException(500, "超时了请重新登录");
			}
			// BrandMember manager = new BrandMember();
			// manager.setBrandId(1);

			jsonData.put("orderInfos", orderService.queryBusinessPaidOrders(manager.getBrandId(), paid));
            jsonData.put("success", true);
		} catch (BaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonData.setErrResult(e);
            jsonData.put("success", false);
		}

		return jsonData;

	}

	/**
	 * 商家确认收到买线网打款
	 * @param orderId
	 * @param session
	 * @return
	 * @throws ClassCastException
	 */
	@RequestMapping(value = "/business_paid/confirm/{orderId}", method = RequestMethod.POST)
	@ResponseBody
	public JsonData confirmBusinessPaid(@PathVariable("orderId") String orderId, HttpSession session)
			throws ClassCastException {
		JsonData jsonData = new JsonData(true);

		try {
			BrandMember manager = (BrandMember) session.getAttribute("brandMember");
//            BrandMember manager = new BrandMember();
//            manager.setBrandId(9);
//            manager.setUserName("sd");
			if (manager == null) {
//				throw new BaseException(500, "超时了请重新登录");
				jsonData.setErrResult(500, "超时了请重新登录");
				return jsonData;
			}
			OrderInfo orderInfo = new OrderInfo();
			orderInfo.setOrderId(orderId);
			orderInfo.setOrderState(OrderStateEnum.CONFIRM_RECEIPT.getCode());
			int confirmRst = orderInfoMapper.updateByPrimaryKeySelective(orderInfo);
			if (confirmRst < 1) {
//				throw new BaseException(500, "存储详情失败");
				jsonData.setErrResult(500, "确认收款失败");
				return jsonData;
			}
			jsonData.put("success", true);

		} catch (BaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonData.setErrResult(e);
			jsonData.put("success", false);
		}

		return jsonData;

	}


}
