package com.example.testnosecurity.controller;

import com.example.testnosecurity.pojo.Encords;
import com.example.testnosecurity.service.EncordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplyUserController {
    @Autowired
    private EncordsService encordsService;

    @PostMapping("/api/applyuser")
    public boolean applyuser(@RequestBody Encords encords){
        encordsService.insertAll(encords);
//        return "申请提交成功";
        return  true;
    }
}
