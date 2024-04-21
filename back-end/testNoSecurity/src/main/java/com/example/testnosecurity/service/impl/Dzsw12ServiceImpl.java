package com.example.testnosecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testnosecurity.pojo.Dzsw12;
import com.example.testnosecurity.pojo.Rjjs12;
import com.example.testnosecurity.service.Dzsw12Service;
import com.example.testnosecurity.mapper.Dzsw12Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【dzsw12】的数据库操作Service实现
* @createDate 2023-06-12 16:37:52
*/
@Service
public class Dzsw12ServiceImpl extends ServiceImpl<Dzsw12Mapper, Dzsw12>
    implements Dzsw12Service{
    @Autowired
    private Dzsw12Mapper dzsw12Mapper;
    public List<Dzsw12> selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(Integer id){
        return dzsw12Mapper.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(id);
    }

}




