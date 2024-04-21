package com.example.testnosecurity.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.testnosecurity.pojo.Dzsw12;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author liuqiming
* @description 针对表【dzsw12】的数据库操作Mapper
* @createDate 2023-06-12 16:37:52
* @Entity com.example.testnosecurity.pojo.Dzsw12
*/
@Mapper
public interface Dzsw12Mapper extends BaseMapper<Dzsw12> {

    List<Dzsw12> selectAllByMonday(@Param("monday") String monday);

    ;

    List<Dzsw12> selectAllByTuseday(@Param("tuseday") String tuseday);

    ;

    List<Dzsw12> selectAllByWednesday(@Param("wednesday") String wednesday);

    ;

    List<Dzsw12> selectAllByThursday(@Param("thursday") String thursday);

    ;

    List<Dzsw12> selectAllByFriday(@Param("friday") String friday);

    ;

    List<Dzsw12> selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(@Param("id") Integer id);
}




