package com.example.testnosecurity.service;

import com.example.testnosecurity.pojo.Monday;
import com.example.testnosecurity.pojo.Tuesday;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【tuesday】的数据库操作Service
* @createDate 2023-06-12 09:46:47
*/
@Component
public interface TuesdayService extends IService<Tuesday> {

    List<Tuesday> selectPositionByOne(String one);
    List<Tuesday> selectPositionByTwo(String two);
    List<Tuesday> selectPositionByThree(String three);
    List<Tuesday> selectPositionByFour(String four);
    List<Tuesday> selectPositionByFive(String five);

}
