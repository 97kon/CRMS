package com.example.testnosecurity.service;

import com.example.testnosecurity.pojo.Friday;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.testnosecurity.pojo.Thursday;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【friday】的数据库操作Service
* @createDate 2023-06-12 09:46:57
*/
@Component
public interface FridayService extends IService<Friday> {

    List<Friday> selectPositionByOne(String one);
    List<Friday> selectPositionByTwo(String two);
    List<Friday> selectPositionByThree(String three);
    List<Friday> selectPositionByFour(String four);
    List<Friday> selectPositionByFive(String five);

}
