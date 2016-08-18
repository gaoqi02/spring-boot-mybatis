package com.ecbusiness.mapper;

import com.ecbusiness.model.ProductBrand;
import com.ecbusiness.model.ProductBrandCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProductBrandMapper {
    int countByExample(ProductBrandCriteria example);

    int deleteByExample(ProductBrandCriteria example);

    int deleteByPrimaryKey(Integer productBrandId);

    int insert(ProductBrand record);

    int insertSelective(ProductBrand record);

    List<ProductBrand> selectByExampleWithRowbounds(ProductBrandCriteria example, RowBounds rowBounds);

    List<ProductBrand> selectByExample(ProductBrandCriteria example);

    ProductBrand selectByPrimaryKey(Integer productBrandId);

    int updateByExampleSelective(@Param("record") ProductBrand record, @Param("example") ProductBrandCriteria example);

    int updateByExample(@Param("record") ProductBrand record, @Param("example") ProductBrandCriteria example);

    int updateByPrimaryKeySelective(ProductBrand record);

    int updateByPrimaryKey(ProductBrand record);
}