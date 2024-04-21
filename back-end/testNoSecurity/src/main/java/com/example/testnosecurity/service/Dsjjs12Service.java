package com.example.testnosecurity.service;

import com.example.testnosecurity.pojo.Dsjjs12;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.testnosecurity.pojo.Rjjs12;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【dsjjs12】的数据库操作Service
* @createDate 2023-06-12 16:37:55
*/
@Component
public interface Dsjjs12Service extends IService<Dsjjs12> {

//    List<Dsjjs12> selectAllByMonday(String monday);
//
//
//
//    List<Dsjjs12> selectAllByTuseday(String tuseday);
//
//
//
//    List<Dsjjs12> selectAllByWednesday(String wednesday);
//
//
//
//    List<Dsjjs12> selectAllByThursday(String thursday);
//
//
//
//    List<Dsjjs12> selectAllByFriday(String friday);

    List<Dsjjs12> selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(Integer id);



}
