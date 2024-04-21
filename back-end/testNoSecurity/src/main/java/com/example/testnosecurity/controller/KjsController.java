package com.example.testnosecurity.controller;

import com.example.testnosecurity.pojo.*;
import com.example.testnosecurity.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.TextStyle;
import java.util.*;

@RestController
public class KjsController {
    @Autowired
    private Rjjs12Service rjjs12Service;
    @Autowired
    private Rjjs34Service rjjs34Service;
    @Autowired
    private Dsjjs12Service dsjjs12Service;
    @Autowired
    private Dzsw12Service dzsw12Service;
    @Autowired
    private StudentsService studentsService;

    @PostMapping("/api/kjsoninput")
    public Map<String,Object> kjsInput(@RequestParam(name = "num") Integer num, @RequestParam(name = "stuIdArray") String stuIdArray){
        System.out.println(num);
        System.out.println(stuIdArray);

        ArrayList<Integer> useTableList = new ArrayList<Integer>();
        String[] extractedStrings = extractStrings(stuIdArray);
//        System.out.println(extractedStrings);
        System.out.println(222);
        for (String str : extractedStrings) {
            List<Students> studentsList = studentsService.selectStuUnitAndStuClassByStuId(str);
            String stuUnitAndClass = studentsList.get(0).getStuUnit() + studentsList.get(0).getStuClass();
            System.out.println(stuUnitAndClass);
            switch (stuUnitAndClass) {
                case "软件技术21101":
                case "软件技术21102":
                    useTableList.add(1);
                    break;
                case "软件技术21103":
                case "软件技术21104":
                    useTableList.add(2);
                    break;
                case "大数据技术21101":
                case "大数据技术21102":
                    useTableList.add(3);
                    break;
                case "电子商务21101":
                case "电子商务21102":
                    useTableList.add(4);
                    break;
            }
        }
        System.out.println(useTableList.get(0));
//        去出重复数据
        ArrayList<Integer> useTableListWithout = new ArrayList<Integer>(new HashSet<Integer>(useTableList));
        System.out.println(useTableListWithout);
        ArrayList<String> allTableList = new ArrayList<String>();
        for (Integer i : useTableListWithout){
            switch (i){
                case 1:{
                    List<Rjjs12> rjjs12List1 = rjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(1);
                    List<Rjjs12> rjjs12List2 = rjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(2);
                    List<Rjjs12> rjjs12List3 = rjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(3);
                    List<Rjjs12> rjjs12List4 = rjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(3);
                    List<Rjjs12> rjjs12List5 = rjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(3);
                    ArrayList<String> arrRjjs12List1 = new ArrayList<String>();
                    ArrayList<String> arrRjjs12List2 = new ArrayList<String>();
                    ArrayList<String> arrRjjs12List3 = new ArrayList<String>();
                    ArrayList<String> arrRjjs12List4 = new ArrayList<String>();
                    ArrayList<String> arrRjjs12List5 = new ArrayList<String>();
                    for (Rjjs12 rjjs12 : rjjs12List1) {
                        arrRjjs12List1.add(addList(rjjs12.getMonday(),"1"));
                        arrRjjs12List1.add(addList(rjjs12.getTuseday(),"1"));
                        arrRjjs12List1.add(addList(rjjs12.getWednesday(),"1"));
                        arrRjjs12List1.add(addList(rjjs12.getThursday(),"1"));
                        arrRjjs12List1.add(addList(rjjs12.getFriday(),"1"));
                    }
                    for (Rjjs12 rjjs12 : rjjs12List2) {
                        arrRjjs12List2.add(addList(rjjs12.getMonday(),"1"));
                        arrRjjs12List2.add(addList(rjjs12.getTuseday(),"1"));
                        arrRjjs12List2.add(addList(rjjs12.getWednesday(),"1"));
                        arrRjjs12List2.add(addList(rjjs12.getThursday(),"1"));
                        arrRjjs12List2.add(addList(rjjs12.getFriday(),"1"));
                    }
                    for (Rjjs12 rjjs12 : rjjs12List3) {
                        arrRjjs12List3.add(addList(rjjs12.getMonday(),"1"));
                        arrRjjs12List3.add(addList(rjjs12.getTuseday(),"1"));
                        arrRjjs12List3.add(addList(rjjs12.getWednesday(),"1"));
                        arrRjjs12List3.add(addList(rjjs12.getThursday(),"1"));
                        arrRjjs12List3.add(addList(rjjs12.getFriday(),"1"));
                    }
                    for (Rjjs12 rjjs12 : rjjs12List4) {
                        arrRjjs12List4.add(addList(rjjs12.getMonday(),"1"));
                        arrRjjs12List4.add(addList(rjjs12.getTuseday(),"1"));
                        arrRjjs12List4.add(addList(rjjs12.getWednesday(),"1"));
                        arrRjjs12List4.add(addList(rjjs12.getThursday(),"1"));
                        arrRjjs12List4.add(addList(rjjs12.getFriday(),"1"));
                    }
                    for (Rjjs12 rjjs12 : rjjs12List5) {
                        arrRjjs12List5.add(addList(rjjs12.getMonday(),"1"));
                        arrRjjs12List5.add(addList(rjjs12.getTuseday(),"1"));
                        arrRjjs12List5.add(addList(rjjs12.getWednesday(),"1"));
                        arrRjjs12List5.add(addList(rjjs12.getThursday(),"1"));
                        arrRjjs12List5.add(addList(rjjs12.getFriday(),"1"));
                    }

                    String resultMapRjjs12 = rongheList(arrRjjs12List1,arrRjjs12List2,arrRjjs12List3,arrRjjs12List4,arrRjjs12List5);

                    allTableList.add(resultMapRjjs12);

                }
                    break;
                case 2:{
                    List<Rjjs34> rjjs34List1 = rjjs34Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(1);
                    List<Rjjs34> rjjs34List2 = rjjs34Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(2);
                    List<Rjjs34> rjjs34List3 = rjjs34Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(3);
                    List<Rjjs34> rjjs34List4 = rjjs34Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(4);
                    List<Rjjs34> rjjs34List5 = rjjs34Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(5);
                    ArrayList<String> arrRjjs34List1 = new ArrayList<String>();
                    ArrayList<String> arrRjjs34List2 = new ArrayList<String>();
                    ArrayList<String> arrRjjs34List3 = new ArrayList<String>();
                    ArrayList<String> arrRjjs34List4 = new ArrayList<String>();
                    ArrayList<String> arrRjjs34List5 = new ArrayList<String>();
                    for (Rjjs34 rjjs34 : rjjs34List1) {
                        arrRjjs34List1.add(addList(rjjs34.getMonday(),"2"));
                        arrRjjs34List1.add(addList(rjjs34.getTuseday(),"2"));
                        arrRjjs34List1.add(addList(rjjs34.getWednesday(),"2"));
                        arrRjjs34List1.add(addList(rjjs34.getThursday(),"2"));
                        arrRjjs34List1.add(addList(rjjs34.getFriday(),"2"));
                    }
                    for (Rjjs34 rjjs34 : rjjs34List2) {
                        arrRjjs34List2.add(addList(rjjs34.getMonday(),"2"));
                        arrRjjs34List2.add(addList(rjjs34.getTuseday(),"2"));
                        arrRjjs34List2.add(addList(rjjs34.getWednesday(),"2"));
                        arrRjjs34List2.add(addList(rjjs34.getThursday(),"2"));
                        arrRjjs34List2.add(addList(rjjs34.getFriday(),"2"));
                    }
                    for (Rjjs34 rjjs34 : rjjs34List3) {
                        arrRjjs34List3.add(addList(rjjs34.getMonday(),"2"));
                        arrRjjs34List3.add(addList(rjjs34.getTuseday(),"2"));
                        arrRjjs34List3.add(addList(rjjs34.getWednesday(),"2"));
                        arrRjjs34List3.add(addList(rjjs34.getThursday(),"2"));
                        arrRjjs34List3.add(addList(rjjs34.getFriday(),"2"));
                    }
                    for (Rjjs34 rjjs34 : rjjs34List4) {
                        arrRjjs34List4.add(addList(rjjs34.getMonday(),"2"));
                        arrRjjs34List4.add(addList(rjjs34.getTuseday(),"2"));
                        arrRjjs34List4.add(addList(rjjs34.getWednesday(),"2"));
                        arrRjjs34List4.add(addList(rjjs34.getThursday(),"2"));
                        arrRjjs34List4.add(addList(rjjs34.getFriday(),"2"));
                    }
                    for (Rjjs34 rjjs34 : rjjs34List5) {
                        arrRjjs34List5.add(addList(rjjs34.getMonday(),"2"));
                        arrRjjs34List5.add(addList(rjjs34.getTuseday(),"2"));
                        arrRjjs34List5.add(addList(rjjs34.getWednesday(),"2"));
                        arrRjjs34List5.add(addList(rjjs34.getThursday(),"2"));
                        arrRjjs34List5.add(addList(rjjs34.getFriday(),"2"));
                    }
                    String resultMapRjjs34 = rongheList(arrRjjs34List1,arrRjjs34List2,arrRjjs34List3,arrRjjs34List4,arrRjjs34List5);
                    allTableList.add(resultMapRjjs34);

                }
                    break;
                case 3:{
                    List<Dsjjs12> dsjjs12List1 = dsjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(1);
                    List<Dsjjs12> dsjjs12List2 = dsjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(2);
                    List<Dsjjs12> dsjjs12List3 = dsjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(3);
                    List<Dsjjs12> dsjjs12List4 = dsjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(4);
                    List<Dsjjs12> dsjjs12List5 = dsjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(5);
                    ArrayList<String> arrDsjjs12List1 = new ArrayList<String>();
                    ArrayList<String> arrDsjjs12List2 = new ArrayList<String>();
                    ArrayList<String> arrDsjjs12List3 = new ArrayList<String>();
                    ArrayList<String> arrDsjjs12List4 = new ArrayList<String>();
                    ArrayList<String> arrDsjjs12List5 = new ArrayList<String>();
                    for (Dsjjs12 dsjjs12 : dsjjs12List1) {
                        arrDsjjs12List1.add(addList(dsjjs12.getMonday(),"3"));
                        arrDsjjs12List1.add(addList(dsjjs12.getTuseday(),"3"));
                        arrDsjjs12List1.add(addList(dsjjs12.getWednesday(),"3"));
                        arrDsjjs12List1.add(addList(dsjjs12.getThursday(),"3"));
                        arrDsjjs12List1.add(addList(dsjjs12.getFriday(),"3"));
                    }
                    for (Dsjjs12 dsjjs12 : dsjjs12List2) {
                        arrDsjjs12List2.add(addList(dsjjs12.getMonday(),"3"));
                        arrDsjjs12List2.add(addList(dsjjs12.getTuseday(),"3"));
                        arrDsjjs12List2.add(addList(dsjjs12.getWednesday(),"3"));
                        arrDsjjs12List2.add(addList(dsjjs12.getThursday(),"3"));
                        arrDsjjs12List2.add(addList(dsjjs12.getFriday(),"3"));
                    }
                    for (Dsjjs12 dsjjs12 : dsjjs12List3) {
                        arrDsjjs12List3.add(addList(dsjjs12.getMonday(),"3"));
                        arrDsjjs12List3.add(addList(dsjjs12.getTuseday(),"3"));
                        arrDsjjs12List3.add(addList(dsjjs12.getWednesday(),"3"));
                        arrDsjjs12List3.add(addList(dsjjs12.getThursday(),"3"));
                        arrDsjjs12List3.add(addList(dsjjs12.getFriday(),"3"));
                    }
                    for (Dsjjs12 dsjjs12 : dsjjs12List4) {
                        arrDsjjs12List4.add(addList(dsjjs12.getMonday(),"3"));
                        arrDsjjs12List4.add(addList(dsjjs12.getTuseday(),"3"));
                        arrDsjjs12List4.add(addList(dsjjs12.getWednesday(),"3"));
                        arrDsjjs12List4.add(addList(dsjjs12.getThursday(),"3"));
                        arrDsjjs12List4.add(addList(dsjjs12.getFriday(),"3"));
                    }
                    for (Dsjjs12 dsjjs12 : dsjjs12List5) {
                        arrDsjjs12List5.add(addList(dsjjs12.getMonday(),"3"));
                        arrDsjjs12List5.add(addList(dsjjs12.getTuseday(),"3"));
                        arrDsjjs12List5.add(addList(dsjjs12.getWednesday(),"3"));
                        arrDsjjs12List5.add(addList(dsjjs12.getThursday(),"3"));
                        arrDsjjs12List5.add(addList(dsjjs12.getFriday(),"3"));
                    }

                    String resultMapDsjjs12 = rongheList(arrDsjjs12List1,arrDsjjs12List2,arrDsjjs12List3,arrDsjjs12List4, arrDsjjs12List5);
                    allTableList.add(resultMapDsjjs12);
                }
                    break;
                case 4:{
                    List<Dzsw12> dzsw12List1 = dzsw12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(1);
                    List<Dzsw12> dzsw12List2 = dzsw12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(2);
                    List<Dzsw12> dzsw12List3 = dzsw12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(3);
                    List<Dzsw12> dzsw12List4 = dzsw12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(4);
                    List<Dzsw12> dzsw12List5 = dzsw12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(5);
                    ArrayList<String> arrDzsw12List1 = new ArrayList<String>();
                    ArrayList<String> arrDzsw12List2 = new ArrayList<String>();
                    ArrayList<String> arrDzsw12List3 = new ArrayList<String>();
                    ArrayList<String> arrDzsw12List4 = new ArrayList<String>();
                    ArrayList<String> arrDzsw12List5 = new ArrayList<String>();
                    for (Dzsw12 dzsw12 : dzsw12List1) {
                        arrDzsw12List1.add(addList(dzsw12.getMonday(),"4"));
                        arrDzsw12List1.add(addList(dzsw12.getTuseday(),"4"));
                        arrDzsw12List1.add(addList(dzsw12.getWednesday(),"4"));
                        arrDzsw12List1.add(addList(dzsw12.getThursday(),"4"));
                        arrDzsw12List1.add(addList(dzsw12.getFriday(),"4"));
                    }
                    for (Dzsw12 dzsw12 : dzsw12List2) {
                        arrDzsw12List2.add(addList(dzsw12.getMonday(),"4"));
                        arrDzsw12List2.add(addList(dzsw12.getTuseday(),"4"));
                        arrDzsw12List2.add(addList(dzsw12.getWednesday(),"4"));
                        arrDzsw12List2.add(addList(dzsw12.getThursday(),"4"));
                        arrDzsw12List2.add(addList(dzsw12.getFriday(),"4"));
                    }
                    for (Dzsw12 dzsw12 : dzsw12List3) {
                        arrDzsw12List3.add(addList(dzsw12.getMonday(),"4"));
                        arrDzsw12List3.add(addList(dzsw12.getTuseday(),"4"));
                        arrDzsw12List3.add(addList(dzsw12.getWednesday(),"4"));
                        arrDzsw12List3.add(addList(dzsw12.getThursday(),"4"));
                        arrDzsw12List3.add(addList(dzsw12.getFriday(),"4"));
                    }
                    for (Dzsw12 dzsw12 : dzsw12List4) {
                        arrDzsw12List4.add(addList(dzsw12.getMonday(),"4"));
                        arrDzsw12List4.add(addList(dzsw12.getTuseday(),"4"));
                        arrDzsw12List4.add(addList(dzsw12.getWednesday(),"4"));
                        arrDzsw12List4.add(addList(dzsw12.getThursday(),"4"));
                        arrDzsw12List4.add(addList(dzsw12.getFriday(),"4"));
                    }
                    for (Dzsw12 dzsw12 : dzsw12List5) {
                        arrDzsw12List5.add(addList(dzsw12.getMonday(),"4"));
                        arrDzsw12List5.add(addList(dzsw12.getTuseday(),"4"));
                        arrDzsw12List5.add(addList(dzsw12.getWednesday(),"4"));
                        arrDzsw12List5.add(addList(dzsw12.getThursday(),"4"));
                        arrDzsw12List5.add(addList(dzsw12.getFriday(),"4"));
                    }

                    String resultMapDzsw12 = rongheList(arrDzsw12List1,arrDzsw12List2,arrDzsw12List3,arrDzsw12List4,arrDzsw12List5);
                    allTableList.add(resultMapDzsw12);
                }
                    break;
            }
        }
        System.out.println(allTableList);
//        int[][] table = new int[5][5];


        if (allTableList.size() == 3){
            int[][] table1 = parseString(allTableList.get(0));
            int[][] table2 = parseString(allTableList.get(1));
            int[][] table3 = parseString(allTableList.get(2));

//            private int[][] mergeTables(table1,table2, table3) {
                int[][] result = new int[table1.length][table1[0].length];
                for (int i = 0; i < table1.length; i++) {
                    for (int j = 0; j < table1[i].length; j++) {
                        int value = 0;
                        if (table1[i][j] == 1) {
                            value = 1;
                        } else if (table2[i][j] == 2) {
                            value = 2;
                        } else if (table3[i][j] == 3) {
                            value = 3;
                        }
                        result[i][j] = value;
                    }
                }
            System.out.println("运行3");

            int[][] freeTable = result;
            printTable(freeTable);

//                return result;
//            }

//            for (int i = 0;i < 5; i++){
//                for (int j = 0; j < 5; j++){
//                    table[i][j] = 0;
//                }
//            }
//            int[][] array1 = Arrays.stream(allTableList.get(0).replaceAll("[\\[\\]\\s]+", "").split(","))
//                    .map(s -> Integer.parseInt(s))
//                    .toArray(size -> new int[5][5]);
//            int[][] array2 = Arrays.stream(allTableList.get(1).replaceAll("[\\[\\]\\s]+", "").split(","))
//                    .map(s -> Integer.parseInt(s))
//                    .toArray(size -> new int[5][5]);
//            int[][] array3 = Arrays.stream(allTableList.get(2).replaceAll("[\\[\\]\\s]+", "").split(","))
//                    .map(s -> Integer.parseInt(s))
//                    .toArray(size -> new int[5][5]);
////定义一个课表
////            int[][] table = new int[5][5];
////遍历五节课
//            for (int i = 0;i < 5; i++){
//                for (int j = 0; j < 5; j++){
//                    if (array1[i][j] == 1) {
//                        table[i][j] = 1;
//                    }
//                    if (array2[i][j] == 2) {
//                        table[i][j] = 2;
//                    }
//                    if (array3[i][j] == 3) {
//                        table[i][j] = 3;
//                    }
//                }
//            }
//            tableAll = table;
//            输出表格
        } else if (allTableList.size() == 2) {
            int[][] table1 = parseString(allTableList.get(0));
            int[][] table2 = parseString(allTableList.get(1));
//            int[][] table3 = parseString(allTableList.get(2));

//            private int[][] mergeTables(table1,table2, table3) {
            int[][] result = new int[table1.length][table1[0].length];
            for (int i = 0; i < table1.length; i++) {
                for (int j = 0; j < table1[i].length; j++) {
                    int value = 0;
                    if (table1[i][j] == 1) {
                        value = 1;
                    } else if (table2[i][j] == 3) {
                        value = 3;
                    }
                    result[i][j] = value;
                }
            }
            System.out.println("运行2");
            int[][] freeTable = result;
            printTable(freeTable);
////            for (int i = 0;i < 5; i++){
////                for (int j = 0; j < 5; j++){
////                    table[i][j] = 0;
////                }
////            }
//            int[][] array1 = (int[][]) Arrays.stream(allTableList.get(0).replaceAll("[\\[\\]\\s]+", "").split(","))
//                    .map(Integer::parseInt)
//                    .toArray();
//            int[][] array2 = (int[][]) Arrays.stream(allTableList.get(1).replaceAll("[\\[\\]\\s]+", "").split(","))
//                    .map(Integer::parseInt)
//                    .toArray();
//
////            int[][] table = new int[5][5];
//
//            for (int i = 0;i < 5; i++){
//                for (int j = 0; j < 5; j++){
//                    if (array1[i][j] == 1) {
//                        table[i][j] = 1;
//                    }
//                    if (array2[i][j] == 2) {
//                        table[i][j] = 2;
//                    }
//                }
//            }

        } else if (allTableList.size() == 4) {
            int[][] table1 = parseString(allTableList.get(0));
            int[][] table2 = parseString(allTableList.get(1));
            int[][] table3 = parseString(allTableList.get(2));
            int[][] table4 = parseString(allTableList.get(3));

//            private int[][] mergeTables(table1,table2, table3) {
            int[][] result = new int[table1.length][table1[0].length];
            for (int i = 0; i < table1.length; i++) {
                for (int j = 0; j < table1[i].length; j++) {
                    int value = 0;
                    if (table1[i][j] == 1) {
                        value = 1;
                    } else if (table2[i][j] == 2) {
                        value = 2;
                    } else if (table3[i][j] == 3) {
                        value = 3;
                    }else if (table4[i][j] == 4) {
                        value = 4;
                    }
                    result[i][j] = value;
                }
            }
            System.out.println("运行4");

            int[][] freeTable = result;
            printTable(freeTable);
//            for (int i = 0;i < 5; i++){
//                for (int j = 0; j < 5; j++){
//                    table[i][j] = 0;
//                }
////            }
//            int[][] array1 = Arrays.stream(allTableList.get(0).replaceAll("[\\[\\]\\s]+", "").split(","))
//                    .map(s -> Integer.parseInt(s))
//                    .toArray(size -> new int[size/5][5]);
//            int[][] array2 = Arrays.stream(allTableList.get(1).replaceAll("[\\[\\]\\s]+", "").split(","))
//                    .map(s -> Integer.parseInt(s))
//                    .toArray(size -> new int[size/5][5]);
//            int[][] array3 = Arrays.stream(allTableList.get(2).replaceAll("[\\[\\]\\s]+", "").split(","))
//                    .map(s -> Integer.parseInt(s))
//                    .toArray(size -> new int[size/5][5]);
//            int[][] array4 = Arrays.stream(allTableList.get(3).replaceAll("[\\[\\]\\s]+", "").split(","))
//                    .map(s -> Integer.parseInt(s))
//                    .toArray(size -> new int[size/5][5]);
//
////            int[][] table = new int[5][5];
//
//            for (int i = 0;i < 5; i++){
//                for (int j = 0; j < 5; j++){
//                    if (array1[i][j] == 1) {
//                        table[i][j] = 1;
//                    }
//                    if (array2[i][j] == 2) {
//                        table[i][j] = 2;
//                    }
//                    if (array3[i][j] == 3) {
//                        table[i][j] = 3;
//                    }
//                    if (array3[i][j] == 3) {
//                        table[i][j] = 3;
//                    }
//                }
//            }
        } else if (allTableList.size() == 1) {
            int[][] table1 = parseString(allTableList.get(0));
//            int[][] table2 = parseString(allTableList.get(1));
//            int[][] table3 = parseString(allTableList.get(2));
//            int[][] table4 = parseString(allTableList.get(3));

//            private int[][] mergeTables(table1,table2, table3) {
            int[][] result = new int[table1.length][table1[0].length];
            for (int i = 0; i < table1.length; i++) {
                for (int j = 0; j < table1[i].length; j++) {
                    int value = 0;
                    if (table1[i][j] == 1) {
                        value = 1;
                    }
                    result[i][j] = value;
                }
            }
            System.out.println("运行1");

            int[][] freeTable = result;
            printTable(freeTable);
//            for (int i = 0;i < 5; i++){
//                for (int j = 0; j < 5; j++){
//                    table[i][j] = 0;
//                }
////            }
//            int[][] array1 = Arrays.stream(allTableList.get(0).replaceAll("[\\[\\]\\s]+", "").split(","))
//                    .map(s -> Integer.parseInt(s))
//                    .toArray(size -> new int[size/5][5]);
//
////            int[][] table = new int[5][5];
//            for (int i = 0;i < 5; i++){
//                for (int j = 0; j < 5; j++){
//                    if (array1[i][j] == 1) {
//                        table[i][j] = 1;
//                    }
//                }
//            }

        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(table[i][j] + " ");
//            }
//            System.out.println();
//        }



        ArrayList<String> resultArrList = new ArrayList<>();
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("data", resultArrList);
        return resultMap;
    }

    private String[] extractStrings(String input) {
        List<String> strings = new ArrayList<>();
        int start = 0;
        int index = input.indexOf(";");
        while (index >= 0) {
            strings.add(input.substring(start, index));
            start = index + 1;
            index = input.indexOf(";", start);
        }
        strings.add(input.substring(start));
        return strings.toArray(new String[strings.size()]);
    }
    private String addList(String str,String tableId){
        String put = "0";
        if (str.equals("1")){

        }else {
            put = tableId;
        }
        return put;
    }
    private String rongheList(ArrayList<String> arrayList1,ArrayList<String> arrayList2,ArrayList<String> arrayList3,ArrayList<String> arrayList4,ArrayList<String> arrayList5){
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for(int i=0; i<arrayList1.size(); i++){
            StringJoiner tempJoiner = new StringJoiner(",", "[", "]");
            tempJoiner.add(arrayList1.get(i));
            tempJoiner.add(arrayList2.get(i));
            tempJoiner.add(arrayList3.get(i));
            tempJoiner.add(arrayList4.get(i));
            tempJoiner.add(arrayList5.get(i));
            joiner.add(tempJoiner.toString());
        }
        String result = joiner.toString();
        System.out.println(result);
        return result;
    }
    private static void printTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println("huanhang");
        }
    }
    private static int[][] parseString(String s) {
        s = s.replaceAll("\\[|\\]", ""); // 将“[”和“]”全部替换为“”
        String[] rows = s.split("],");
        int[][] table = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String row = rows[i];
            String[] values = row.split(",");
            table[i] = new int[values.length];
            for (int j = 0; j < values.length; j++) {
                table[i][j] = Integer.parseInt(values[j]);
            }
        }
        return table;
    }
}
