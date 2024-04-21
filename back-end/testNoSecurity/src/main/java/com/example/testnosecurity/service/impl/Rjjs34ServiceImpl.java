package com.example.testnosecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testnosecurity.pojo.Rjjs12;
import com.example.testnosecurity.pojo.Rjjs34;
import com.example.testnosecurity.service.Rjjs34Service;
import com.example.testnosecurity.mapper.Rjjs34Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【rjjs34】的数据库操作Service实现
* @createDate 2023-06-12 16:37:43
*/
@Service
public class Rjjs34ServiceImpl extends ServiceImpl<Rjjs34Mapper, Rjjs34>
    implements Rjjs34Service{
    @Autowired
    private Rjjs34Mapper rjjs34Mapper;

    public List<Rjjs34> selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(Integer id){
        return rjjs34Mapper.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(id);
    }

}




