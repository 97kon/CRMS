package com.example.testnosecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testnosecurity.pojo.Monday;
import com.example.testnosecurity.service.MondayService;
import com.example.testnosecurity.mapper.MondayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【monday】的数据库操作Service实现
* @createDate 2023-06-12 09:46:41
*/
@Service
public class MondayServiceImpl extends ServiceImpl<MondayMapper, Monday>
    implements MondayService{

    @Autowired
    private MondayMapper mondayMapper;

    public List<Monday> selectPositionByOne(String one){
        return mondayMapper.selectPositionByOne(one);
    }
    public List<Monday> selectPositionByTwo(String two){
        return mondayMapper.selectPositionByTwo(two);
    }
    public List<Monday> selectPositionByThree(String three){
        return mondayMapper.selectPositionByThree(three);
    }
    public List<Monday> selectPositionByFour(String four){
        return mondayMapper.selectPositionByFour(four);
    }
    public List<Monday> selectPositionByFive(String five){
        return mondayMapper.selectPositionByFive(five);
    }

}




