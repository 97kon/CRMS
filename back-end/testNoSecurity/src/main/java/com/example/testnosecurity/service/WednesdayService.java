package com.example.testnosecurity.service;

import com.example.testnosecurity.pojo.Tuesday;
import com.example.testnosecurity.pojo.Wednesday;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【wednesday】的数据库操作Service
* @createDate 2023-06-12 09:46:49
*/
@Component
public interface WednesdayService extends IService<Wednesday> {

    List<Wednesday> selectPositionByOne(String one);
    List<Wednesday> selectPositionByTwo(String two);
    List<Wednesday> selectPositionByThree(String three);
    List<Wednesday> selectPositionByFour(String four);
    List<Wednesday> selectPositionByFive(String five);

}
