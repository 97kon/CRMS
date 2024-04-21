package com.example.testnosecurity.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.testnosecurity.pojo.Rjjs12;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author liuqiming
* @description 针对表【rjjs12】的数据库操作Mapper
* @createDate 2023-06-12 16:37:40
* @Entity com.example.testnosecurity.pojo.Rjjs12
*/
@Mapper
public interface Rjjs12Mapper extends BaseMapper<Rjjs12> {

    List<Rjjs12> selectAllByMonday(@Param("monday") String monday);

    List<Rjjs12> selectAllByTuseday(@Param("tuseday") String tuseday);

    List<Rjjs12> selectAllByWednesday(@Param("wednesday") String wednesday);

    List<Rjjs12> selectAllByThursday(@Param("thursday") String thursday);

    List<Rjjs12> selectAllByFriday(@Param("friday") String friday);

    List<Rjjs12> selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(@Param("id") Integer id);
}




