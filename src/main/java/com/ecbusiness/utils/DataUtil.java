package com.ecbusiness.utils;

import com.ecbusiness.domain.OrderInfoVo;
import com.ecbusiness.domain.OrderItemVo;
import com.ecbusiness.model.OrderItem;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Jason on 16/3/24.
 */
public class DataUtil {

    public static Map<String, Object> indexTestData(Map<String, Object> model) {
//        Map<String, Object> model = new HashMap<>();
    	
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        OrderInfoVo orderInfoVo1 = new OrderInfoVo();
        orderInfoVo1.setBrandId(26);
        orderInfoVo1.setFinishTime(String.valueOf(new Date()));
        orderInfoVo1.setGoodsName("test goods");
        orderInfoVo1.setGoodsAmount(new BigDecimal(1));
        orderInfoVo1.setLogisticsCompany("顺丰快递");;
        orderInfoVo1.setLogisticsCompanyId(1);
        orderInfoVo1.setOrderId("test order id 1");
        orderInfoVo1.setOrderItemId(1);
        orderInfoVo1.setOrderNotes("test notes 1");
        orderInfoVo1.setOrderPaidFee(new BigDecimal(150));
        orderInfoVo1.setOrderShippingNo("123456");
        orderInfoVo1.setOrderState(1);	// 状态吗
        orderInfoVo1.setOrderStateString(1);	// 状态描述
        orderInfoVo1.setReceiveUser("test user 1");
        orderInfoVo1.setToAddress("test to address 1");
        orderInfoVo1.setToMobile("11111111111");
        orderInfoVo1.setPaidTime(simpleDateFormat.format(new Date()));
        orderInfoVo1.setImgUrl("http://123.57.23.176:8080/ec-web/product/110111-0.html");

        OrderInfoVo orderInfoVo2 = new OrderInfoVo();
        orderInfoVo2.setBrandId(26);
        orderInfoVo2.setFinishTime(String.valueOf(new Date()));
        orderInfoVo2.setGoodsName("test goods");
        orderInfoVo2.setGoodsAmount(new BigDecimal(2));
        orderInfoVo2.setLogisticsCompany("圆通快递");;
        orderInfoVo2.setLogisticsCompanyId(2);
        orderInfoVo2.setOrderId("test order id 2");
        orderInfoVo2.setOrderItemId(2);
        orderInfoVo2.setOrderNotes("test notes 2");
        orderInfoVo2.setOrderPaidFee(new BigDecimal(200));
        orderInfoVo2.setOrderShippingNo("123456");
        orderInfoVo2.setOrderState(2);
        orderInfoVo2.setOrderStateString(2);
        orderInfoVo2.setReceiveUser("test user 2");
        orderInfoVo2.setToAddress("test to address 2");
        orderInfoVo2.setToMobile("22222222222");
        orderInfoVo2.setPaidTime(simpleDateFormat.format(new Date()));
        orderInfoVo2.setImgUrl("http://123.57.23.176:8080/ec-web/product/110111-0.html");

        List<OrderInfoVo> orderList = new ArrayList<>();
        orderList.add(orderInfoVo1);
        orderList.add(orderInfoVo1);
        orderList.add(orderInfoVo2);

        model.put("orderInfos", mergeOrders(orderList));

        model.put("userName", "testUserName");

        model.put("todayNewOrderAmount", 1);

        model.put("orderAmount", 2);
        
        model.put("unReached", new BigDecimal(10000));

        model.put("reached", new BigDecimal(88889));
        
        model.put("sum", new BigDecimal(98889));

        return model;
    }

    public static List<Map<String, Object>> mergeOrders(List<OrderInfoVo> orderInfoVos) {
        List<Map<String, Object>> result = new ArrayList<>();

        Map<String, List<OrderInfoVo>> mergeOrders = new HashMap<>();
        // merge order items by order id
        for (OrderInfoVo orderInfoVo : orderInfoVos) {
            if (mergeOrders.keySet().contains(orderInfoVo.getOrderId())) {
                mergeOrders.get(orderInfoVo.getOrderId()).add(orderInfoVo);
            } else {
                List<OrderInfoVo> orders = new ArrayList<>();
                orders.add(orderInfoVo);
                mergeOrders.put(orderInfoVo.getOrderId(), orders);
            }
        }

        for (List<OrderInfoVo> list : mergeOrders.values()) {
            result.add(constructMap(list));
        }
        return result;
    }

    private static Map<String, Object> constructMap(List<OrderInfoVo> orderItems) {
        Map<String, Object> result = new HashMap<>();
        OrderInfoVo firstItem = orderItems.get(0);
        result.put("paidTime", firstItem.getPaidTime());
        result.put("orderId", firstItem.getOrderId());
        result.put("toAddress", firstItem.getToAddress());
        result.put("receiveUser", firstItem.getReceiveUser());
        result.put("toMobile", firstItem.getToMobile());
        result.put("orderNotes", firstItem.getOrderNotes());
        BigDecimal totalPaidFee = new BigDecimal(0);
        List<OrderItemVo> items = new ArrayList<OrderItemVo>();
        result.put("orderItemList", items);
        for (OrderInfoVo orderInfoVo : orderItems) {
            OrderItemVo oiv = new OrderItemVo();
            oiv.setImgUrl(orderInfoVo.getImgUrl());
            oiv.setGoodsAmount(orderInfoVo.getGoodsAmount());
            oiv.setGoodsName(orderInfoVo.getGoodsName());
            items.add(oiv);
            totalPaidFee = totalPaidFee.add(orderInfoVo.getOrderPaidFee());
        }
        result.put("orderPaidFee", totalPaidFee);

        return result;
    }

}
