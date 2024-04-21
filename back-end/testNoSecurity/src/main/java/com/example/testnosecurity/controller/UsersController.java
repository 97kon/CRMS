package com.example.testnosecurity.controller;

import com.example.testnosecurity.pojo.Users;
import com.example.testnosecurity.service.UsersService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
@CrossOrigin(origins = "http://localhost:8099")
public class UsersController {
    @Autowired
    private UsersService usersService;
    @PostMapping("/api/login")
    public Boolean login(@RequestParam("username") String username, @RequestParam("pwd") String pwd){
        List<Users> usersList = usersService.selectAllByUserName(username);
        Map<String, Object> result = new HashMap<>();
//        String type = usersService.selectTypeByUserName(username);
        if (usersList != null &&usersList.size() > 0 && usersList.get(0).getPwd().equals(pwd)){
            return true;
//            result.put("success",true);
//            result.put("type",usersService.selectTypeByUserName(username));
        }else {
//            result.put("success",false);
//            result.put("type",null);
            return false;
        }
//        return result;
    }
    @PostMapping("/api/gettype")
    public List<Users> getType(@RequestParam(name = "username") String username){
        List<Users> usersList1 = usersService.selectTypeByUserName(username);
            return usersList1;
    }
    private String generateVerificationCode(){
        // 生成6位随机数
        return String.format("%06d", new Random().nextInt(1000000));
    }

//    @Autowired
//    private JavaMailSender javaMailSender;
    @Autowired
    private JavaMailSenderImpl mailSender;

    @PostMapping("/api/register")
    public boolean register(@RequestParam(name = "stuMail") String stuMail ,@RequestParam(name="verCode") String verCode){
        System.out.println("reg"+stuMail);
        System.out.println("reg"+verCode);
        if (!checkVerificationCode(stuMail, verCode)){
//            return "验证码错误";
//            int status = 200;
//            return status;
            return false;
        }
//        注册操作
//        usersService.insertAll(users);
//        return "注册成功";
        return true;
    }
    @PostMapping("/api/registerform")
    public boolean registerform(@RequestBody Users users){
        usersService.insertAll(users);
        return true;
    }
    private boolean checkVerificationCode(String stuMail, String verCode){
        System.out.println("check"+stuMail);
//        查询数据库中该邮箱对应的验证码
        String saveCode = queryVerificationCodeFromDatabase(stuMail);
//                检查验证码是否正确
        return verCode.equals(saveCode);
    }

    private String queryVerificationCodeFromDatabase(String stuMail){
        System.out.println("query"+stuMail);
//        查询数据库中该邮箱对应的验证码并返回
        List<Users> usersList = usersService.selectVerCodeByStuMail(stuMail);
        StringBuilder verCodeBuilder = new StringBuilder();
        for (Users users : usersList){
            verCodeBuilder.append(users.getVerCode());
        }
        String verCode = verCodeBuilder.toString();
        String code = verCode.substring(0,6);
        return code;
//        return "yes";
    }
    private  void saveVerificationCodeToDatabase(String stuMail, String verCode){
//        将验证码保存到数据库
        usersService.updateVerCodeByStuMail(verCode,stuMail);
    }

    private void sendVerificationCodeByEmail(String stuMail, String Code) throws MessagingException{
//        MimeMessage message = javaMailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message, true);
//        helper.setTo(stuMail);
//        helper.setSubject("激活邮件");
//        helper.setText("您的激活码是"+Code);
//        javaMailSender.send(message);
        System.out.println("send"+stuMail);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("CRMS邮箱验证");
        message.setText("邮箱验证码为"+Code);
        message.setTo(stuMail);
        message.setFrom("3231045496@qq.com");
        mailSender.send(message);
    }
    @PostMapping("/api/sendCode")
    public String sendVerificationCode(@RequestBody String requestBody) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(requestBody);
        String stuMail = jsonNode.get("stuMail").asText();
        String Code = generateVerificationCode();
        System.out.println("sendVC"+stuMail);
        try{
            sendVerificationCodeByEmail(stuMail, Code);
        } catch (MessagingException e){
            e.printStackTrace();
            return "发送邮件失败";
        }

        saveVerificationCodeToDatabase(stuMail,Code);

        return "已发送验证码邮件，请前往邮箱查收";
    }

    @PostMapping("/api/passwordreset")
    public String passWordReset(@RequestParam(name="stuMail") String stuMail,@RequestParam(name="pwd") String pwd,@RequestParam(name="verCode") String verCode){
        System.out.println("pass"+stuMail);
        System.out.println("pass"+pwd);
        System.out.println("pass"+verCode);
        if (!checkVerificationCode(stuMail, verCode)){
            return "验证码错误";
        }
        usersService.updatePwdByStuMail(pwd, stuMail);
        return "密码修改成功";
    }

}
