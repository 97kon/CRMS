package com.example.testnosecurity.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.testnosecurity.pojo.Dsjjs12;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author liuqiming
* @description 针对表【dsjjs12】的数据库操作Mapper
* @createDate 2023-06-12 16:37:55
* @Entity com.example.testnosecurity.pojo.Dsjjs12
*/
@Mapper
public interface Dsjjs12Mapper extends BaseMapper<Dsjjs12> {

    List<Dsjjs12> selectAllByMonday(@Param("monday") String monday);

    ;

    List<Dsjjs12> selectAllByTuseday(@Param("tuseday") String tuseday);

    ;

    List<Dsjjs12> selectAllByWednesday(@Param("wednesday") String wednesday);

    ;

    List<Dsjjs12> selectAllByThursday(@Param("thursday") String thursday);

    ;

    List<Dsjjs12> selectAllByFriday(@Param("friday") String friday);

    ;

    List<Dsjjs12> selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(@Param("id") Integer id);
}




