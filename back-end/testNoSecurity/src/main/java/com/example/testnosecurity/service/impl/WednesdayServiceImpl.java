package com.example.testnosecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testnosecurity.pojo.Monday;
import com.example.testnosecurity.pojo.Wednesday;
import com.example.testnosecurity.service.WednesdayService;
import com.example.testnosecurity.mapper.WednesdayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【wednesday】的数据库操作Service实现
* @createDate 2023-06-12 09:46:49
*/
@Service
public class WednesdayServiceImpl extends ServiceImpl<WednesdayMapper, Wednesday>
    implements WednesdayService{

    @Autowired
    private WednesdayMapper wednesdayMapper;

    public List<Wednesday> selectPositionByOne(String one){
        return wednesdayMapper.selectPositionByOne(one);
    }
    public List<Wednesday> selectPositionByTwo(String two){
        return wednesdayMapper.selectPositionByTwo(two);
    }
    public List<Wednesday> selectPositionByThree(String three){
        return wednesdayMapper.selectPositionByThree(three);
    }
    public List<Wednesday> selectPositionByFour(String four){
        return wednesdayMapper.selectPositionByFour(four);
    }
    public List<Wednesday> selectPositionByFive(String five){
        return wednesdayMapper.selectPositionByFive(five);
    }

}




