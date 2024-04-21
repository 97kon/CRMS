package com.example.testnosecurity.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.testnosecurity.pojo.Encords;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author liuqiming
* @description 针对表【encords】的数据库操作Mapper
* @createDate 2023-06-11 19:29:00
* @Entity com.example.testnosecurity.pojo.Encords
*/
@Mapper
public interface EncordsMapper extends BaseMapper<Encords> {
    int insertAll(Encords encords);

    List<Encords> selectAllByStatus(@Param("status") Integer status);

    int updateStatusById(@Param("status") Integer status, @Param("id") Integer id);

    int updateVerifyCodeById(@Param("verifyCode") String verifyCode, @Param("id") Integer id);

    int deleteById(@Param("id") Integer id);

    List<Encords> selectAllByStuId(@Param("stuId") String stuId);
}




