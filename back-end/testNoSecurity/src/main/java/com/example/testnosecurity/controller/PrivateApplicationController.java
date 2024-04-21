package com.example.testnosecurity.controller;

import com.example.testnosecurity.pojo.Encords;
import com.example.testnosecurity.service.EncordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PrivateApplicationController {

    @Autowired
    private EncordsService encordsService;

    @PostMapping("/api/privateapplicationData")
    public Map<String, Object> selectAllByStuId(@RequestParam(name="stuId") String stuId){
        List<Encords> encordsList = encordsService.selectAllByStuId(stuId);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("data", encordsList);
        return resultMap;
    }
}
