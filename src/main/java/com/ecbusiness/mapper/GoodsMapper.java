package com.ecbusiness.mapper;

import com.ecbusiness.model.Goods;
import com.ecbusiness.model.GoodsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsMapper {
    int countByExample(GoodsCriteria example);

    int deleteByExample(GoodsCriteria example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExampleWithRowbounds(GoodsCriteria example, RowBounds rowBounds);

    List<Goods> selectByExample(GoodsCriteria example);

    Goods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsCriteria example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsCriteria example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}