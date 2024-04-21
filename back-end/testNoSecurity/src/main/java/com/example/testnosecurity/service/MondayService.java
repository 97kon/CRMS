package com.example.testnosecurity.service;

import com.example.testnosecurity.pojo.Monday;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【monday】的数据库操作Service
* @createDate 2023-06-12 09:46:41
*/
@Component
public interface MondayService extends IService<Monday> {

    List<Monday> selectPositionByOne(String one);
    List<Monday> selectPositionByTwo(String two);
    List<Monday> selectPositionByThree(String three);
    List<Monday> selectPositionByFour(String four);
    List<Monday> selectPositionByFive(String five);

}
