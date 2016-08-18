package com.ecbusiness.mapper;

import com.ecbusiness.model.OrderShipping;
import com.ecbusiness.model.OrderShippingCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrderShippingMapper {
    int countByExample(OrderShippingCriteria example);

    int deleteByExample(OrderShippingCriteria example);

    int deleteByPrimaryKey(Integer orderShippingId);

    int insert(OrderShipping record);

    int insertSelective(OrderShipping record);

    List<OrderShipping> selectByExampleWithRowbounds(OrderShippingCriteria example, RowBounds rowBounds);

    List<OrderShipping> selectByExample(OrderShippingCriteria example);

    OrderShipping selectByPrimaryKey(Integer orderShippingId);

    int updateByExampleSelective(@Param("record") OrderShipping record, @Param("example") OrderShippingCriteria example);

    int updateByExample(@Param("record") OrderShipping record, @Param("example") OrderShippingCriteria example);

    int updateByPrimaryKeySelective(OrderShipping record);

    int updateByPrimaryKey(OrderShipping record);
}