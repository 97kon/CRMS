package com.example.testnosecurity.service;

import com.example.testnosecurity.pojo.Dzsw12;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.testnosecurity.pojo.Rjjs12;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【dzsw12】的数据库操作Service
* @createDate 2023-06-12 16:37:52
*/
@Component
public interface Dzsw12Service extends IService<Dzsw12> {

//    List<Dzsw12> selectAllByMonday(String monday);
//
//
//
//    List<Dzsw12> selectAllByTuseday(String tuseday);
//
//
//
//    List<Dzsw12> selectAllByWednesday(String wednesday);
//
//
//
//    List<Dzsw12> selectAllByThursday(String thursday);
//
//
//
//    List<Dzsw12> selectAllByFriday(String friday);

    List<Dzsw12> selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(Integer id);


}
