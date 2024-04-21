package com.example.testnosecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testnosecurity.pojo.Users;
import com.example.testnosecurity.service.UsersService;
import com.example.testnosecurity.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【users】的数据库操作Service实现
* @createDate 2023-06-11 10:09:49
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

    @Autowired
    private UsersMapper usersMapper;
    public List<Users> selectAllByUserName(String userName){
        return usersMapper.selectAllByUserName(userName);
    }

    public List<Users> selectTypeByUserName(String userName){
        return usersMapper.selectTypeByUserName(userName);
    }
    public int insertAll(Users users){
        return usersMapper.insertAll(users);
    }
    public int updateVerCodeByUserName(String verCode, String userName){
        return usersMapper.updateVerCodeByUserName(verCode, userName);
    }

    public int updatePwdByUserName(String pwd, String userName){
        return usersMapper.updatePwdByUserName(pwd, userName);
    }

    public List<Users> getByUserName(String userName){
        return usersMapper.getByUserName(userName);
    }

    public int addAll(Users users){
        return usersMapper.addAll(users);
    }
    public List<Users> getAllByPhone(String phone){
        return usersMapper.getAllByPhone(phone);
    }
    public List<Users> selectVerCodeByStuMail(String stuMail){
        return usersMapper.selectVerCodeByStuMail(stuMail);
    }
    public int updatePwdByStuMail(String pwd,String stuMail){
        return usersMapper.updatePwdByStuMail(pwd,stuMail);
    }
    public int updateVerCodeByStuMail(String verCode, String stuMail){
        return usersMapper.updateVerCodeByStuMail(verCode, stuMail);
    }

}




