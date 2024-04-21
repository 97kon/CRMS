package com.example.testnosecurity.service;

import com.example.testnosecurity.pojo.Thursday;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.testnosecurity.pojo.Wednesday;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【thursday】的数据库操作Service
* @createDate 2023-06-12 09:46:54
*/
@Component
public interface ThursdayService extends IService<Thursday> {

    List<Thursday> selectPositionByOne(String one);
    List<Thursday> selectPositionByTwo(String two);
    List<Thursday> selectPositionByThree(String three);
    List<Thursday> selectPositionByFour(String four);
    List<Thursday> selectPositionByFive(String five);

}
