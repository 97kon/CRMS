package com.example.testnosecurity.controller;

import com.example.testnosecurity.mapper.TuesdayMapper;
import com.example.testnosecurity.pojo.*;
import com.example.testnosecurity.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class FilterClassroomController {

    @Autowired
    private MondayService mondayService;
    @Autowired
    private TuesdayService tuesdayService;
    @Autowired
    private WednesdayService wednesdayService;
    @Autowired
    private ThursdayService thursdayService;
    @Autowired
    private FridayService fridayService;

    @PostMapping("/api/filterclassroom")
    public Map<String, Object> filterclassroom(@RequestParam(name = "applyDay") String applyDay,@RequestParam(name = "applyTime") String applyTime) throws ParseException {
        ArrayList<String> ObjectList = new ArrayList<String>();
        Map<String, Object> resultMap = new HashMap<>();
        System.out.println(applyDay);
        System.out.println(applyTime);
//        去掉applyDay两头的双引号
        String endApplyDay = "";
        if (applyDay.length()>=2 && applyDay.startsWith("\"") && applyDay.endsWith("\"")){
             endApplyDay = applyDay.substring(1,applyDay.length() - 1);
        }
        System.out.println(endApplyDay);
//        获取到applyDay具体是星期几
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(endApplyDay);
        Calendar c =Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
//        获取到applyTime是第几大节
        int time=0;
        switch (applyTime) {
            case "[\"第一大节\"]":
                time = 1;
                break;
            case "[\"第二大节\"]":
                time = 2;
                break;
            case "[\"第三大节\"]":
                time = 3;
                break;
            case "[\"第四大节\"]":
                time = 4;
                break;
            case "[\"第五大节\"]":
                time = 5;
                break;
        }
        System.out.println(dayOfWeek);
        System.out.println(time);
//        确认查询区域
        List<Monday> mondayList= new ArrayList<>();
        List<Tuesday> tuesdayList= new ArrayList<>();
        List<Wednesday> wednesdayList= new ArrayList<>();
        List<Thursday> thursdayList= new ArrayList<>();
        List<Friday> fridayList= new ArrayList<>();
        switch (dayOfWeek){
            case 1:
            {
                switch (time){
                    case 1:
                        mondayList = mondayService.selectPositionByOne("0");
                        resultMap.put("data", mondayList);
                        break;
                    case 2:
                        mondayList = mondayService.selectPositionByTwo("0");
                        resultMap.put("data", mondayList);
                        break;
                    case 3:
                        mondayList = mondayService.selectPositionByThree("0");
                        resultMap.put("data", mondayList);
                        break;
                    case 4:
                        mondayList = mondayService.selectPositionByFour("0");
                        resultMap.put("data", mondayList);
                        break;
                    case 5:
                        mondayList = mondayService.selectPositionByFive("0");
                        resultMap.put("data", mondayList);
                        break;
                }
            }
                break;
            case 2:
            {
                switch (time){
                    case 1:
                        tuesdayList = tuesdayService.selectPositionByOne("0");
                        resultMap.put("data", tuesdayList);
                        break;
                    case 2:
                        tuesdayList = tuesdayService.selectPositionByTwo("0");
                        resultMap.put("data", tuesdayList);
                        break;
                    case 3:
                        tuesdayList = tuesdayService.selectPositionByThree("0");
                        resultMap.put("data", tuesdayList);
                        break;
                    case 4:
                        tuesdayList = tuesdayService.selectPositionByFour("0");
                        resultMap.put("data", tuesdayList);
                        break;
                    case 5:
                        tuesdayList = tuesdayService.selectPositionByFive("0");
                        resultMap.put("data", tuesdayList);
                        break;
                }
            }
                break;
            case 3:
            {
                switch (time){
                    case 1:
                        wednesdayList = wednesdayService.selectPositionByOne("0");
                        resultMap.put("data", wednesdayList);
                        break;
                    case 2:
                        wednesdayList = wednesdayService.selectPositionByTwo("0");
                        resultMap.put("data", wednesdayList);
                        break;
                    case 3:
                        wednesdayList = wednesdayService.selectPositionByThree("0");
                        resultMap.put("data", wednesdayList);
                        break;
                    case 4:
                        wednesdayList = wednesdayService.selectPositionByFour("0");
                        resultMap.put("data", wednesdayList);
                        break;
                    case 5:
                        wednesdayList = wednesdayService.selectPositionByFive("0");
                        resultMap.put("data", wednesdayList);
                        break;
                }
            }
                break;
            case 4:
            {
                switch (time){
                    case 1:
                        thursdayList = thursdayService.selectPositionByOne("0");
                        resultMap.put("data", thursdayList);
                        break;
                    case 2:
                        thursdayList = thursdayService.selectPositionByTwo("0");
                        resultMap.put("data", thursdayList);
                        break;
                    case 3:
                        thursdayList = thursdayService.selectPositionByThree("0");
                        resultMap.put("data", thursdayList);
                        break;
                    case 4:
                        thursdayList = thursdayService.selectPositionByFour("0");
                        resultMap.put("data", thursdayList);
                        break;
                    case 5:
                        thursdayList = thursdayService.selectPositionByFive("0");
                        resultMap.put("data", thursdayList);
                        break;
                }
            }
                break;
            case 5:
            {
                switch (time){
                    case 1:
                        fridayList = fridayService.selectPositionByOne("0");
                        resultMap.put("data", fridayList);
                        break;
                    case 2:
                        fridayList = fridayService.selectPositionByTwo("0");
                        resultMap.put("data", fridayList);
                        break;
                    case 3:
                        fridayList = fridayService.selectPositionByThree("0");
                        resultMap.put("data", fridayList);
                        break;
                    case 4:
                        fridayList = fridayService.selectPositionByFour("0");
                        resultMap.put("data", fridayList);
                        break;
                    case 5:
                        fridayList = fridayService.selectPositionByFive("0");
                        resultMap.put("data", fridayList);
                        break;
                }
            }
                break;
        }
//        resultMap.put("test",ObjectList);
        return resultMap;
    }
}
