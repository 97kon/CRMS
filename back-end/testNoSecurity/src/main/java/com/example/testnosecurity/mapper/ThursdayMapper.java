package com.example.testnosecurity.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.testnosecurity.pojo.Thursday;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author liuqiming
* @description 针对表【thursday】的数据库操作Mapper
* @createDate 2023-06-12 09:46:54
* @Entity com.example.testnosecurity.pojo.Thursday
*/
@Mapper
public interface ThursdayMapper extends BaseMapper<Thursday> {

    List<Thursday> selectPositionByOne(@Param("one") String one);

    ;

    List<Thursday> selectPositionByTwo(@Param("two") String two);

    ;

    List<Thursday> selectPositionByThree(@Param("three") String three);

    ;

    List<Thursday> selectPositionByFour(@Param("four") String four);

    ;

    List<Thursday> selectPositionByFive(@Param("five") String five);

    ;
}




