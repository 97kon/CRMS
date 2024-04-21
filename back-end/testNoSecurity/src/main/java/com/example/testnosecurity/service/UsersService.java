package com.example.testnosecurity.service;

import com.example.testnosecurity.pojo.Users;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【users】的数据库操作Service
* @createDate 2023-06-11 10:09:49
*/
@Component
public interface UsersService extends IService<Users> {

    List<Users> selectAllByUserName(String userName);

    List<Users> selectTypeByUserName(String userName);

    int insertAll(Users users);

    int updateVerCodeByUserName(String verCode, String userName);

    int updatePwdByUserName(String pwd, String userName);

    List<Users> getByUserName(String userName);

    int addAll(Users users);

    List<Users> getAllByPhone(String phone);


    List<Users> selectVerCodeByStuMail(String stuMail);

    int updatePwdByStuMail(String pwd,String stuMail);

    int updateVerCodeByStuMail(String verCode, String stuMail);




}
