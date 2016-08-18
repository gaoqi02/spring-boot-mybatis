package com.ecbusiness.mapper;

import com.ecbusiness.model.OrderInfo;
import com.ecbusiness.model.OrderInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrderInfoMapper {
    int countByExample(OrderInfoCriteria example);

    int deleteByExample(OrderInfoCriteria example);

    int deleteByPrimaryKey(String orderId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    List<OrderInfo> selectByExampleWithRowbounds(OrderInfoCriteria example, RowBounds rowBounds);

    List<OrderInfo> selectByExample(OrderInfoCriteria example);

    OrderInfo selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoCriteria example);

    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoCriteria example);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}