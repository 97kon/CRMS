package com.example.testnosecurity.service;

import com.example.testnosecurity.pojo.Students;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【students】的数据库操作Service
* @createDate 2023-06-12 18:13:39
*/
@Component
public interface StudentsService extends IService<Students> {

    List<Students> selectStuUnitAndStuClassByStuId(String stuId);


}
