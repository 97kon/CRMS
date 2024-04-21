package com.example.testnosecurity.service;

import com.example.testnosecurity.pojo.Rjjs12;
import com.example.testnosecurity.pojo.Rjjs34;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【rjjs34】的数据库操作Service
* @createDate 2023-06-12 16:37:43
*/
@Component
public interface Rjjs34Service extends IService<Rjjs34> {

//    List<Rjjs34> selectAllByMonday(String monday);
//
//
//
//    List<Rjjs34> selectAllByTuseday(String tuseday);
//
//
//
//    List<Rjjs34> selectAllByWednesday(String wednesday);
//
//
//
//    List<Rjjs34> selectAllByThursday(String thursday);
//
//
//
//    List<Rjjs34> selectAllByFriday(String friday);


    List<Rjjs34> selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(Integer id);


}
