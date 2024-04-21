package com.example.testnosecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testnosecurity.pojo.Students;
import com.example.testnosecurity.service.StudentsService;
import com.example.testnosecurity.mapper.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【students】的数据库操作Service实现
* @createDate 2023-06-12 18:13:39
*/
@Service
public class StudentsServiceImpl extends ServiceImpl<StudentsMapper, Students>
    implements StudentsService{

    @Autowired
    private StudentsMapper studentsMapper;
    public List<Students> selectStuUnitAndStuClassByStuId(String stuId){
        return studentsMapper.selectStuUnitAndStuClassByStuId(stuId);
    }


}




