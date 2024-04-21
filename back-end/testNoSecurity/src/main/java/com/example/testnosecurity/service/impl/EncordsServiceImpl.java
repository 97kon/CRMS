package com.example.testnosecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testnosecurity.pojo.Encords;
import com.example.testnosecurity.service.EncordsService;
import com.example.testnosecurity.mapper.EncordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liuqiming
* @description 针对表【encords】的数据库操作Service实现
* @createDate 2023-06-11 19:29:00
*/
@Service
public class EncordsServiceImpl extends ServiceImpl<EncordsMapper, Encords>
    implements EncordsService{

    @Autowired
    private EncordsMapper encordsMapper;

    public int insertAll(Encords encords){
        return encordsMapper.insertAll(encords);
    }
    public List<Encords> selectAllByStatus(Integer status){
        return encordsMapper.selectAllByStatus(status);
    }
    public int updateStatusById(Integer status, Integer id){
        return encordsMapper.updateStatusById(status,id);
    }

    public int updateVerifyCodeById(String verifyCode, Integer id){
        return encordsMapper.updateVerifyCodeById(verifyCode, id);
    }

    public int deleteById(Integer id){
        return encordsMapper.deleteById(id);
    }

    public List<Encords> selectAllByStuId(String stuId){
        return encordsMapper.selectAllByStuId(stuId);
    }
}





