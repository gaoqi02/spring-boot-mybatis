package com.ecbusiness.mapper;

import com.ecbusiness.model.Product;
import com.ecbusiness.model.ProductCriteria;
import com.ecbusiness.model.ProductWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProductMapper {
    int countByExample(ProductCriteria example);

    int deleteByExample(ProductCriteria example);

    int deleteByPrimaryKey(Integer productId);

    int insert(ProductWithBLOBs record);

    int insertSelective(ProductWithBLOBs record);

    List<ProductWithBLOBs> selectByExampleWithBLOBsWithRowbounds(ProductCriteria example, RowBounds rowBounds);

    List<ProductWithBLOBs> selectByExampleWithBLOBs(ProductCriteria example);

    List<Product> selectByExampleWithRowbounds(ProductCriteria example, RowBounds rowBounds);

    List<Product> selectByExample(ProductCriteria example);

    ProductWithBLOBs selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") ProductWithBLOBs record, @Param("example") ProductCriteria example);

    int updateByExampleWithBLOBs(@Param("record") ProductWithBLOBs record, @Param("example") ProductCriteria example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductCriteria example);

    int updateByPrimaryKeySelective(ProductWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProductWithBLOBs record);

    int updateByPrimaryKey(Product record);
}