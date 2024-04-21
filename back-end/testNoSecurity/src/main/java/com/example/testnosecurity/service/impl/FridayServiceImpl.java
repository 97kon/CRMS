package com.example.testnosecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testnosecurity.pojo.Friday;
import com.example.testnosecurity.pojo.Monday;
import com.example.testnosecurity.service.FridayService;
import com.example.testnosecurity.mapper.FridayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【friday】的数据库操作Service实现
* @createDate 2023-06-12 09:46:57
*/
@Service
public class FridayServiceImpl extends ServiceImpl<FridayMapper, Friday>
    implements FridayService{

    @Autowired
    private FridayMapper fridayMapper;

    public List<Friday> selectPositionByOne(String one){
        return fridayMapper.selectPositionByOne(one);
    }
    public List<Friday> selectPositionByTwo(String two){
        return fridayMapper.selectPositionByTwo(two);
    }
    public List<Friday> selectPositionByThree(String three){
        return fridayMapper.selectPositionByThree(three);
    }
    public List<Friday> selectPositionByFour(String four){
        return fridayMapper.selectPositionByFour(four);
    }
    public List<Friday> selectPositionByFive(String five){
        return fridayMapper.selectPositionByFive(five);
    }

}




