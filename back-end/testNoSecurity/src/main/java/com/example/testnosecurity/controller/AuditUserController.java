package com.example.testnosecurity.controller;

import com.example.testnosecurity.pojo.Encords;
import com.example.testnosecurity.service.EncordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
public class AuditUserController {
    @Autowired
    private EncordsService encordsService;

    @PostMapping("/api/audituser")
    public Map<String,Object> selectAllByStatus(@RequestParam(name="status") Integer status){
        List<Encords> encordsList = encordsService.selectAllByStatus(status);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("data", encordsList);
        return resultMap;
    }

    @PostMapping("/api/auditupdata")
    public boolean auditUserUpdata(@RequestParam(name="status") Integer status,@RequestParam(name = "id") Integer id){
        System.out.println(status);
        System.out.println(id);
        encordsService.updateStatusById(status,id);

        if (status == 2){
            String verCode = generateVerificationCode();
            encordsService.updateVerifyCodeById(verCode,id);
        }
        return true;
    }
    private String generateVerificationCode(){
        // 生成6位随机数
        return String.format("%06d", new Random().nextInt(1000000));
    }
}
