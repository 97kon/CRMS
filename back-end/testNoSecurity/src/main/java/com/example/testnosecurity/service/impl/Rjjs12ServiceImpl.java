package com.example.testnosecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testnosecurity.pojo.Rjjs12;
import com.example.testnosecurity.service.Rjjs12Service;
import com.example.testnosecurity.mapper.Rjjs12Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【rjjs12】的数据库操作Service实现
* @createDate 2023-06-12 16:37:40
*/
@Service
public class Rjjs12ServiceImpl extends ServiceImpl<Rjjs12Mapper, Rjjs12>
    implements Rjjs12Service{

    @Autowired
    private Rjjs12Mapper rjjs12Mapper;

//    public List<Rjjs12> selectAllByMonday(String monday){
//        return rjjs12Mapper.selectAllByMonday(monday);
//    }
//
//    public List<Rjjs12> selectAllByTuseday(String tuseday);
//
//    public List<Rjjs12> selectAllByWednesday(String wednesday);
//
//    public List<Rjjs12> selectAllByThursday(String thursday);
//
//    public List<Rjjs12> selectAllByFriday(String friday);

    public List<Rjjs12> selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(Integer id){
        return rjjs12Mapper.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(id);
    }

}




