package com.example.testnosecurity.controller;

import com.example.testnosecurity.pojo.Encords;
import com.example.testnosecurity.service.EncordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class VerifyUserController {
    @Autowired
    private EncordsService encordsService;

    @PostMapping("/api/VerifyuserData")
    public Map<String, Object> selectAllByStatus(@RequestParam(name = "status") Integer status){
        List<Encords> encordsList = encordsService.selectAllByStatus(status);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("data", encordsList);
        return resultMap;
    }

    @PostMapping("/api/passData")
    public Boolean passdata(@RequestParam(name = "id") Integer id){
        encordsService.deleteById(id);
        return true;
    }
}
