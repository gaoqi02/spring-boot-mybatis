package com.ecbusiness.mapper;

import com.ecbusiness.model.OrderItem;
import com.ecbusiness.model.OrderItemCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrderItemMapper {
    int countByExample(OrderItemCriteria example);

    int deleteByExample(OrderItemCriteria example);

    int deleteByPrimaryKey(Integer orderItemId);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    List<OrderItem> selectByExampleWithRowbounds(OrderItemCriteria example, RowBounds rowBounds);

    List<OrderItem> selectByExample(OrderItemCriteria example);

    OrderItem selectByPrimaryKey(Integer orderItemId);

    int updateByExampleSelective(@Param("record") OrderItem record, @Param("example") OrderItemCriteria example);

    int updateByExample(@Param("record") OrderItem record, @Param("example") OrderItemCriteria example);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}