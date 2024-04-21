package com.example.testnosecurity.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.testnosecurity.pojo.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author liuqiming
* @description 针对表【users】的数据库操作Mapper
* @createDate 2023-06-11 10:09:49
* @Entity com.example.testnosecurity.pojo.Users
*/
@Mapper
public interface UsersMapper extends BaseMapper<Users> {
    List<Users> selectAllByUserName(@Param("userName") String userName);

    List<Users> selectTypeByUserName(@Param("userName") String userName);

//    List<Users> getTypeByUserName(@Param("userName") String userName);

    int insertAll(Users users);

    int updateVerCodeByUserName(@Param("verCode") String verCode, @Param("userName") String userName);

    int updatePwdByUserName(@Param("pwd") String pwd, @Param("userName") String userName);

    List<Users> getByUserName(@Param("userName") String userName);

    int addAll(Users users);

    List<Users> getAllByPhone(@Param("phone") String phone);

//    String selectVerCodeByStuMail(@Param("stuMail") String stuMail);
List<Users> selectVerCodeByStuMail(@Param("stuMail") String stuMail);

    int updatePwdByStuMail(@Param("pwd") String pwd, @Param("stuMail") String stuMail);

    int updateVerCodeByStuMail(@Param("verCode") String verCode, @Param("stuMail") String stuMail);
}




