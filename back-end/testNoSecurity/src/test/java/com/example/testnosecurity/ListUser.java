package com.example.testnosecurity;

import com.example.testnosecurity.pojo.Rjjs12;
import com.example.testnosecurity.pojo.Students;
import com.example.testnosecurity.pojo.Users;
import com.example.testnosecurity.service.Rjjs12Service;
import com.example.testnosecurity.service.StudentsService;
import com.example.testnosecurity.service.UsersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@SpringBootTest
public class ListUser {

    @Autowired
    private UsersService usersService;
    @Autowired
    private StudentsService studentsService;
    @Autowired
    private Rjjs12Service rjjs12Service;
    @Test
    public void TestListUser(){
        String stuMail = "2325656876@qq.com";
        List<Users> usersList = usersService.selectVerCodeByStuMail(stuMail);
        StringBuilder verCodeBuilder = new StringBuilder();
        for (Users users : usersList){
            verCodeBuilder.append(users.getVerCode());
        }
        String verCode = verCodeBuilder.toString();
        String result = verCode.substring(0,6);
        System.out.println("VerCode:"+result);

    }
    @Test
    public void TestListStudents(){
        String stuId = "21067010122";
        List<Students> studentsList = studentsService.selectStuUnitAndStuClassByStuId(stuId);
//        StringBuilder UnitClassBuilder = new StringBuilder();
//        for (Students students : studentsList){
//            UnitClassBuilder.append(students.getStuUnit());
//        }
//        String Unit = UnitClassBuilder.toString();
//        System.out.println(Unit);
        String stuUnitAndClass = studentsList.get(0).getStuUnit() + studentsList.get(0).getStuClass();
        System.out.println(stuUnitAndClass);
    }
    @Test
    public void TestListWithList(){

        List<Rjjs12> rjjs12List1 = rjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(1);
        List<Rjjs12> rjjs12List2 = rjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(2);
        List<Rjjs12> rjjs12List3 = rjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(3);
        List<Rjjs12> rjjs12List4 = rjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(4);
        List<Rjjs12> rjjs12List5 = rjjs12Service.selectMondayAndTusedayAndWednesdayAndThursdayAndFridayById(5);
        ArrayList<String> arrRjjs12List1 = new ArrayList<String>();
        ArrayList<String> arrRjjs12List2 = new ArrayList<String>();
        ArrayList<String> arrRjjs12List3 = new ArrayList<String>();
        ArrayList<String> arrRjjs12List4 = new ArrayList<String>();
        ArrayList<String> arrRjjs12List5 = new ArrayList<String>();
//        System.out.println(rjjs12List1);
//        System.out.println(rjjs12List2);
        for (Rjjs12 rjjs12 : rjjs12List1) {
            arrRjjs12List1.add(addList(rjjs12.getMonday()));
            arrRjjs12List1.add(addList(rjjs12.getTuseday()));
            arrRjjs12List1.add(addList(rjjs12.getWednesday()));
            arrRjjs12List1.add(addList(rjjs12.getThursday()));
            arrRjjs12List1.add(addList(rjjs12.getFriday()));
        }
        for (Rjjs12 rjjs12 : rjjs12List2) {
            arrRjjs12List2.add(addList(rjjs12.getMonday()));
            arrRjjs12List2.add(addList(rjjs12.getTuseday()));
            arrRjjs12List2.add(addList(rjjs12.getWednesday()));
            arrRjjs12List2.add(addList(rjjs12.getThursday()));
            arrRjjs12List2.add(addList(rjjs12.getFriday()));
        }
        for (Rjjs12 rjjs12 : rjjs12List3) {
            arrRjjs12List3.add(addList(rjjs12.getMonday()));
            arrRjjs12List3.add(addList(rjjs12.getTuseday()));
            arrRjjs12List3.add(addList(rjjs12.getWednesday()));
            arrRjjs12List3.add(addList(rjjs12.getThursday()));
            arrRjjs12List3.add(addList(rjjs12.getFriday()));
        }
        for (Rjjs12 rjjs12 : rjjs12List4) {
            arrRjjs12List4.add(addList(rjjs12.getMonday()));
            arrRjjs12List4.add(addList(rjjs12.getTuseday()));
            arrRjjs12List4.add(addList(rjjs12.getWednesday()));
            arrRjjs12List4.add(addList(rjjs12.getThursday()));
            arrRjjs12List4.add(addList(rjjs12.getFriday()));
        }
        for (Rjjs12 rjjs12 : rjjs12List5) {
            arrRjjs12List5.add(addList(rjjs12.getMonday()));
            arrRjjs12List5.add(addList(rjjs12.getTuseday()));
            arrRjjs12List5.add(addList(rjjs12.getWednesday()));
            arrRjjs12List5.add(addList(rjjs12.getThursday()));
            arrRjjs12List5.add(addList(rjjs12.getFriday()));
        }
        System.out.println(arrRjjs12List1);
        System.out.println(arrRjjs12List2);
        System.out.println(arrRjjs12List3);

        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for(int i=0; i<arrRjjs12List1.size(); i++){
            StringJoiner tempJoiner = new StringJoiner(",", "[", "]");
            tempJoiner.add(arrRjjs12List1.get(i));
            tempJoiner.add(arrRjjs12List2.get(i));
            tempJoiner.add(arrRjjs12List3.get(i));
            tempJoiner.add(arrRjjs12List4.get(i));
            tempJoiner.add(arrRjjs12List5.get(i));

            joiner.add(tempJoiner.toString());
        }
        String result = joiner.toString();
        System.out.println(result);
    }
    private String addList(String str){
        String put = "0";
        if (str.equals("1")){

        }else {
            put = "1";
        }
        return put;
    }
}
