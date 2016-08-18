package com.ecbusiness.sqlProvider;


import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

/**
 *
 * {select p.PRODUCT_BRAND_ID as brandId,of.ORDER_STATE as orderState,of.paid_time as paidTime
 ,of.order_id as orderId,oi.GOODS_SUM_FEE as orderPaidFee,oi.goods_name as goodsName,of.order_notes as orderNotes
 ,of.receive_user as receiveUser,os.TO_MOBILE as toMobile,os.TO_ADDRESS as toAddress,os.ORDER_SHIPPING_NO as orderShippingNo,
 of.LOGISTIC_COMPANY_ID as logisticsCompanyId,of.commit_time as finishTime,oi.ORDER_ITEM_ID as orderItemId,of.ORDER_STATE as orderState
 from product p inner join goods g on g.PRODUCT_ID=p.PRODUCT_ID
 inner JOIN order_item oi on oi.GOODS_ID=g.GOODS_ID inner JOIN
 order_info of on oi.ORDER_ID=of.ORDER_ID left JOIN order_shipping os on of.ORDER_ID=os.ORDER_ID }
 这个是查询orderInfoVo的baseSql 需要的where 的条件语句可以作为查询的参数传入。
 * 拼装语句
 */
public class EcBusinessSqlProvider {
	
	/**
	 * 拼装出来
     * 这里查询了所有订单item，这些订单item需要和order_info这张表对应起来。
     * 如果不对应则没通过筛选。。
     * 我在给的测试数据库sql文件中 有些item没找到指定的Order_info_id。。
	 * @return
	 */
	public String queryOrderInfo(Map<String, Object> map) {
        List<Integer> state = (List<Integer>) map.get("state");

//		StringBuffer sql = new StringBuffer("select p.PRODUCT_ID as productId,p.PRODUCT_BRAND_ID as brandId,of.ORDER_STATE as orderState,of.paid_time as paidTime" +
//                ",of.order_id as orderId,oi.GOODS_SUM_FEE as orderPaidFee,oi.goods_name as goodsName,oi.GOODS_AMOUNT as goodsAmount,of.order_notes as orderNotes" +
//                ",of.receive_user as receiveUser,os.TO_MOBILE as toMobile,os.TO_ADDRESS as toAddress,os.ORDER_SHIPPING_NO as orderShippingNo, " +
//                "of.LOGISTIC_COMPANY_ID as logisticsCompanyId,of.finish_time as finishTime,oi.ORDER_ITEM_ID as orderItemId,of.ORDER_STATE as orderState" +
//                " from product p inner join goods g on g.PRODUCT_ID=p.PRODUCT_ID\n" +
//                " inner JOIN order_item oi on oi.GOODS_ID=g.GOODS_ID inner JOIN order_info of on oi.ORDER_ID=of.ORDER_ID left JOIN order_shipping os\n" +
//                " on of.ORDER_ID=os.ORDER_ID where p.PRODUCT_BRAND_ID=#{brandId} and of.order_state in (");
		StringBuffer sql = new StringBuffer("select of.BRAND_ID as brandId,of.ORDER_STATE as orderState,of.paid_time as paidTime" +
				",of.order_id as orderId,of.SKU_FEE as orderPaidFee,of.SKU_WEIGHTS as goodsAmount,of.order_notes as orderNotes" +
				",of.receive_user as receiveUser,of.RECEIVE_MOBILE as toMobile,of.RECEIVE_FULL_ADDRESS as toAddress,os.ORDER_SHIPPING_NO as orderShippingNo, " +
				" of.LOGISTIC_COMPANY_ID as logisticsCompanyId,lc.company_name as logisticsCompany,of.commit_time as finishTime,of.ORDER_STATE as orderState," +
				" os.SHIPPING_TIME as logisticsTime, of.business_paid_time as businessPaidTime, of.business_paid_voucher as businessPaidVoucher " +
                "from order_info of left join order_shipping os on of.order_id=os.order_id left join logistic_company lc on " +
                "of.logistic_company_id = lc.logistic_company_id where of.is_paid='Y' and of.is_delete='N' and of.brand_id=#{brandId}" +
                " and  of.order_state in (");
        System.out.print(sql.toString());
        MessageFormat mf = new MessageFormat("#'{'state[{0}]}");
        int len = state.size();
        int len1 = len - 1;
        for (int i = 0; i < len; i++) {
            sql.append(mf.format(new Object[]{i}));
            if (i < len1) {
                sql.append(",");
            }
        }
        sql.append(") ");
        sql.append("order by of.ADD_TIME desc limit #{offset},#{limit}");
        System.out.println(sql.toString());
        return sql.toString();  
	}

    public String queryCommonOrderInfo(Map<String, Object> map) {

        StringBuffer sql = new StringBuffer("select p.PRODUCT_ID as productId,p.PRODUCT_BRAND_ID as brandId,of.ORDER_STATE as orderState,of.paid_time as paidTime" +
                ",of.order_id as orderId,oi.GOODS_SUM_FEE as orderPaidFee,oi.goods_name as goodsName,oi.GOODS_AMOUNT as goodsAmount,of.order_notes as orderNotes" +
                ",of.receive_user as receiveUser,os.TO_MOBILE as toMobile,os.TO_ADDRESS as toAddress,os.ORDER_SHIPPING_NO as orderShippingNo, " +
                "of.LOGISTIC_COMPANY_ID as logisticsCompanyId,of.commit_time as finishTime,oi.ORDER_ITEM_ID as orderItemId,of.ORDER_STATE as orderState" +
                " from product p inner join goods g on g.PRODUCT_ID=p.PRODUCT_ID\n" +
                " inner JOIN order_item oi on oi.GOODS_ID=g.GOODS_ID inner JOIN order_info of on oi.ORDER_ID=of.ORDER_ID left JOIN order_shipping os\n" +
                " on of.ORDER_ID=os.ORDER_ID ");
        sql.append(map.get("sql"));
        System.out.println(sql.toString());
        return sql.toString();
    }

    public String queryUnDeliveryOrders() {

        StringBuffer sql = new StringBuffer("select p.PRODUCT_ID as productId, p.PRODUCT_BRAND_ID as brandId,of.ORDER_STATE as orderState,of.paid_time as paidTime,of.order_id as orderId,oi.GOODS_SUM_FEE as orderPaidFee,\n" +
                "oi.goods_name as goodsName,oi.GOODS_AMOUNT as goodsAmount,of.order_notes as orderNotes,os.TO_USER as receiveUser,\n" +
                "os.TO_MOBILE as toMobile,os.TO_ADDRESS as toAddress,os.ORDER_SHIPPING_NO as orderShippingNo,\n" +
                "of.LOGISTIC_COMPANY_ID as logisticsCompanyId,oi.ORDER_ITEM_ID as orderItemId,of.ORDER_STATE as orderState \n" +
                "from order_item oi LEFT JOIN order_info of on oi.order_id=of.order_id LEFT JOIN order_shipping os on of.ORDER_ID=os.ORDER_ID\n" +
                "left JOIN goods g on oi.goods_id=g.goods_id \n" +
                "INNER JOIN product p on g.PRODUCT_ID=p.PRODUCT_ID where p.PRODUCT_BRAND_ID=#{brandId}  and os.ORDER_SHIPPING_NO is  null");

//        System.out.println(sql.toString());
        return sql.toString();
    }

    public String queryOrderAmount() {
        String sql = "select p.PRODUCT_ID as productId,p.PRODUCT_BRAND_ID as brandId,of.ORDER_STATE as orderState,of.paid_time as paidTime" +
                ",of.order_id as orderId,oi.GOODS_SUM_FEE as orderPaidFee,oi.goods_name as goodsName,oi.GOODS_AMOUNT as goodsAmount,of.order_notes as orderNotes" +
                ",of.receive_user as receiveUser,os.TO_MOBILE as toMobile,os.TO_ADDRESS as toAddress,os.ORDER_SHIPPING_NO as orderShippingNo, " +
                "of.LOGISTIC_COMPANY_ID as logisticsCompanyId,oi.ORDER_ITEM_ID as orderItemId,of.ORDER_STATE as orderState from product p inner join goods g on g.PRODUCT_ID=p.PRODUCT_ID\n" +
                " inner JOIN order_item oi on oi.GOODS_ID=g.GOODS_ID inner JOIN order_info of on oi.ORDER_ID=of.ORDER_ID left JOIN order_shipping os\n" +
                " on of.ORDER_ID=os.ORDER_ID where p.PRODUCT_BRAND_ID=#{brandId} and of.is_delete='N' ";
        return sql;
    }


    public String getReachedOrUnReachedPaid(Map<String, Object> map) {
        List<Integer> state = (List<Integer>) map.get("state");

        StringBuffer sql = new StringBuffer("select sum(order_fee) from order_info where BRAND_ID=#{brandId} and IS_DELETE='N' and " +
                " is_paid='Y' and order_state in (");
        MessageFormat mf = new MessageFormat("#'{'state[{0}]}");
        int len = state.size();
        int len1 = len - 1;
        for (int i = 0; i < len; i++) {
            sql.append(mf.format(new Object[]{i}));
            if (i < len1) {
                sql.append(",");
            }
        }
        sql.append(") ");
        return sql.toString();
    }

    public String getLogisticCompany() {
        return "select COMPANY_NAME from logistic_company where LOGISTIC_COMPANY_ID = #{logisticCompanyId}";
    }

}
