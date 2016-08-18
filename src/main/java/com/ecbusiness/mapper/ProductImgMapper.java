package com.ecbusiness.mapper;

import com.ecbusiness.model.ProductImg;
import com.ecbusiness.model.ProductImgCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProductImgMapper {
    int countByExample(ProductImgCriteria example);

    int deleteByExample(ProductImgCriteria example);

    int deleteByPrimaryKey(Integer proImageId);

    int insert(ProductImg record);

    int insertSelective(ProductImg record);

    List<ProductImg> selectByExampleWithRowbounds(ProductImgCriteria example, RowBounds rowBounds);

    List<ProductImg> selectByExample(ProductImgCriteria example);

    ProductImg selectByPrimaryKey(Integer proImageId);

    int updateByExampleSelective(@Param("record") ProductImg record, @Param("example") ProductImgCriteria example);

    int updateByExample(@Param("record") ProductImg record, @Param("example") ProductImgCriteria example);

    int updateByPrimaryKeySelective(ProductImg record);

    int updateByPrimaryKey(ProductImg record);
}