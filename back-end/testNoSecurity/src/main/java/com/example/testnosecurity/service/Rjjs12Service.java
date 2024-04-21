package com.example.testnosecurity.service;

import com.example.testnosecurity.pojo.Rjjs12;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【rjjs12】的数据库操作Service
* @createDate 2023-06-12 16:37:40
*/
@Component
public interface Rjjs12Service extends IService<Rjjs12> {

//    List<Rjjs12> selectAllByMonday(String monday);
//
//    List<Rjjs12> selectAllByTuseday(String tuseday);
//
//    List<Rjjs12> selectAllByWednesday(String wednesday);
//
//    List<Rjjs12> selectAllByThursday(String thursday);
//
//    List<Rjjs12> selectAllByFriday(String friday);


    List<Rjjs12> selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(Integer id);
}
