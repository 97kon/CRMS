package com.example.testnosecurity.mapper;

import com.example.testnosecurity.pojo.Tuesday;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【tuesday】的数据库操作Mapper
* @createDate 2023-06-12 09:46:47
* @Entity com.example.testnosecurity.pojo.Tuesday
*/
@Mapper
public interface TuesdayMapper extends BaseMapper<Tuesday> {

    List<Tuesday> selectPositionByOne(@Param("one")String one);

    List<Tuesday> selectPositionByTwo(@Param("two") String two);


    List<Tuesday> selectPositionByThree(@Param("three") String three);



    List<Tuesday> selectPositionByFour(@Param("four") String four);



    List<Tuesday> selectPositionByFive(@Param("five") String five);




}




