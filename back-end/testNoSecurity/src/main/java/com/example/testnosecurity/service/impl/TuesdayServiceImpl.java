package com.example.testnosecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testnosecurity.pojo.Monday;
import com.example.testnosecurity.pojo.Tuesday;
import com.example.testnosecurity.service.TuesdayService;
import com.example.testnosecurity.mapper.TuesdayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【tuesday】的数据库操作Service实现
* @createDate 2023-06-12 09:46:47
*/
@Service
public class TuesdayServiceImpl extends ServiceImpl<TuesdayMapper, Tuesday>
    implements TuesdayService{

    @Autowired
    private TuesdayMapper tuesdayMapper;
    public List<Tuesday> selectPositionByOne(String one){
        return tuesdayMapper.selectPositionByOne(one);
    }
    public List<Tuesday> selectPositionByTwo(String two){
        return tuesdayMapper.selectPositionByTwo(two);
    }
    public List<Tuesday> selectPositionByThree(String three){
        return tuesdayMapper.selectPositionByThree(three);
    }
    public List<Tuesday> selectPositionByFour(String four){
        return tuesdayMapper.selectPositionByFour(four);
    }
    public List<Tuesday> selectPositionByFive(String five){
        return tuesdayMapper.selectPositionByFive(five);
    }

}




