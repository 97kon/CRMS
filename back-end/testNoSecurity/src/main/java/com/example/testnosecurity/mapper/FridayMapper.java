package com.example.testnosecurity.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.testnosecurity.pojo.Friday;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author liuqiming
* @description 针对表【friday】的数据库操作Mapper
* @createDate 2023-06-12 09:46:57
* @Entity com.example.testnosecurity.pojo.Friday
*/
@Mapper
public interface FridayMapper extends BaseMapper<Friday> {

    List<Friday> selectPositionByOne(@Param("one") String one);

    ;

    List<Friday> selectPositionByTwo(@Param("two") String two);

    ;

    List<Friday> selectPositionByThree(@Param("three") String three);

    ;

    List<Friday> selectPositionByFour(@Param("four") String four);

    ;

    List<Friday> selectPositionByFive(@Param("five") String five);

    ;

}




