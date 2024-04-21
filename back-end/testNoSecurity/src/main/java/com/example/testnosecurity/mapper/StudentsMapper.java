package com.example.testnosecurity.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.testnosecurity.pojo.Students;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author liuqiming
* @description 针对表【students】的数据库操作Mapper
* @createDate 2023-06-12 18:13:39
* @Entity com.example.testnosecurity.pojo.Students
*/
@Mapper
public interface StudentsMapper extends BaseMapper<Students> {

    List<Students> selectStuUnitAndStuClassByStuId(@Param("stuId") String stuId);
}




