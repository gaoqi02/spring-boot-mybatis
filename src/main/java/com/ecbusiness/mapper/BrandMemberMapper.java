package com.ecbusiness.mapper;

import com.ecbusiness.model.BrandMember;
import com.ecbusiness.model.BrandMemberCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BrandMemberMapper {
    int countByExample(BrandMemberCriteria example);

    int deleteByExample(BrandMemberCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(BrandMember record);

    int insertSelective(BrandMember record);

    List<BrandMember> selectByExampleWithRowbounds(BrandMemberCriteria example, RowBounds rowBounds);

    List<BrandMember> selectByExample(BrandMemberCriteria example);

    BrandMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BrandMember record, @Param("example") BrandMemberCriteria example);

    int updateByExample(@Param("record") BrandMember record, @Param("example") BrandMemberCriteria example);

    int updateByPrimaryKeySelective(BrandMember record);

    int updateByPrimaryKey(BrandMember record);
}