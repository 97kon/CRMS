package com.example.testnosecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testnosecurity.pojo.Monday;
import com.example.testnosecurity.pojo.Thursday;
import com.example.testnosecurity.service.ThursdayService;
import com.example.testnosecurity.mapper.ThursdayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【thursday】的数据库操作Service实现
* @createDate 2023-06-12 09:46:54
*/
@Service
public class ThursdayServiceImpl extends ServiceImpl<ThursdayMapper, Thursday>
    implements ThursdayService{
    @Autowired
    private ThursdayMapper thursdayMapper;

    public List<Thursday> selectPositionByOne(String one){
        return thursdayMapper.selectPositionByOne(one);
    }
    public List<Thursday> selectPositionByTwo(String two){
        return thursdayMapper.selectPositionByTwo(two);
    }
    public List<Thursday> selectPositionByThree(String three){
        return thursdayMapper.selectPositionByThree(three);
    }
    public List<Thursday> selectPositionByFour(String four){
        return thursdayMapper.selectPositionByFour(four);
    }
    public List<Thursday> selectPositionByFive(String five){
        return thursdayMapper.selectPositionByFive(five);
    }

}




