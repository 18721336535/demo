package com.zbq.demo.mapper;

import com.zbq.demo.domain.MobileFoodFacilityPermit;
import com.zbq.demo.domain.MobileFoodFacilityPermitExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface MobileFoodFacilityPermitMapper {

    List<MobileFoodFacilityPermit> selectByExample(MobileFoodFacilityPermitExample example);

    long countByExample(MobileFoodFacilityPermitExample example);

    int deleteByExample(MobileFoodFacilityPermitExample example);

    int insert(MobileFoodFacilityPermit row);

    int insertSelective(MobileFoodFacilityPermit row);

    int updateByExampleSelective(@Param("row") MobileFoodFacilityPermit row, @Param("example") MobileFoodFacilityPermitExample example);

    int updateByExample(@Param("row") MobileFoodFacilityPermit row, @Param("example") MobileFoodFacilityPermitExample example);
}