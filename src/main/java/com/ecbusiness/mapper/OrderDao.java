package com.ecbusiness.mapper;

import com.ecbusiness.domain.OrderInfoVo;
import com.ecbusiness.model.OrderInfo;
import com.ecbusiness.sqlProvider.EcBusinessSqlProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by gaoqi on 2016/1/20.
 */
public interface OrderDao {

    @SelectProvider(type=EcBusinessSqlProvider.class,method="queryOrderInfo")
    List<OrderInfoVo> queryOrderInfo(@Param("brandId") int brandId, @Param("state") List<Integer> state,@Param("offset") int offset, @Param("limit") int limit);

    @SelectProvider(type=EcBusinessSqlProvider.class,method="queryUnDeliveryOrders")
    List<OrderInfoVo> queryUnDeliveryOrders(@Param("brandId") int brandId);

    @SelectProvider(type=EcBusinessSqlProvider.class,method="queryOrderAmount")
    List<OrderInfoVo> queryOrderAmount(@Param("brandId") int brandId);

    @SelectProvider(type=EcBusinessSqlProvider.class,method="getReachedOrUnReachedPaid")
    BigDecimal queryReachedOrUnReachedPaid(@Param("brandId") int brandId, @Param("state") List<Integer> state);

    @SelectProvider(type=EcBusinessSqlProvider.class,method="queryCommonOrderInfo")
    List<OrderInfoVo> queryCommonOrderInfo(@Param("sql") String sql);

    @SelectProvider(type=EcBusinessSqlProvider.class,method="getLogisticCompany")
    String getLogisticCompayById(@Param("logisticCompanyId") int logisticCompanyId);

}
