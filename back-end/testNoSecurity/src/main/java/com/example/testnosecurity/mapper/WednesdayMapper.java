package com.example.testnosecurity.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.testnosecurity.pojo.Wednesday;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author liuqiming
* @description 针对表【wednesday】的数据库操作Mapper
* @createDate 2023-06-12 09:46:49
* @Entity com.example.testnosecurity.pojo.Wednesday
*/
@Mapper
public interface WednesdayMapper extends BaseMapper<Wednesday> {

    List<Wednesday> selectPositionByOne(@Param("one") String one);

    ;

    List<Wednesday> selectPositionByTwo(@Param("two") String two);

    ;

    List<Wednesday> selectPositionByThree(@Param("three") String three);

    ;

    List<Wednesday> selectPositionByFour(@Param("four") String four);

    ;

    List<Wednesday> selectPositionByFive(@Param("five") String five);

    ;
}




