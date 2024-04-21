package com.example.testnosecurity.service;

import com.example.testnosecurity.pojo.Encords;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【encords】的数据库操作Service
* @createDate 2023-06-11 19:29:00
*/
@Component
public interface EncordsService extends IService<Encords> {

    int insertAll(Encords encords);
    List<Encords> selectAllByStatus(Integer status);
    int updateStatusById(Integer status, Integer id);

    int updateVerifyCodeById(String verifyCode, Integer id);

    int deleteById(Integer id);

    List<Encords> selectAllByStuId(String stuId);

}
