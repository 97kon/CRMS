package com.example.testnosecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testnosecurity.pojo.Dsjjs12;
import com.example.testnosecurity.pojo.Rjjs12;
import com.example.testnosecurity.service.Dsjjs12Service;
import com.example.testnosecurity.mapper.Dsjjs12Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【dsjjs12】的数据库操作Service实现
* @createDate 2023-06-12 16:37:55
*/
@Service
public class Dsjjs12ServiceImpl extends ServiceImpl<Dsjjs12Mapper, Dsjjs12>
    implements Dsjjs12Service{
    @Autowired
    private Dsjjs12Mapper dsjjs12Mapper;
    public List<Dsjjs12> selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(Integer id){
        return dsjjs12Mapper.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(id);
    }

}




