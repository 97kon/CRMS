package com.example.testnosecurity.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.testnosecurity.pojo.Rjjs34;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author liuqiming
* @description 针对表【rjjs34】的数据库操作Mapper
* @createDate 2023-06-12 16:37:43
* @Entity com.example.testnosecurity.pojo.Rjjs34
*/
@Mapper
public interface Rjjs34Mapper extends BaseMapper<Rjjs34> {

    List<Rjjs34> selectAllByMonday(@Param("monday") String monday);

    ;

    List<Rjjs34> selectAllByTuseday(@Param("tuseday") String tuseday);

    ;

    List<Rjjs34> selectAllByWednesday(@Param("wednesday") String wednesday);

    ;

    List<Rjjs34> selectAllByThursday(@Param("thursday") String thursday);

    ;

    List<Rjjs34> selectAllByFriday(@Param("friday") String friday);

    ;

    List<Rjjs34> selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(@Param("id") Integer id);

}




