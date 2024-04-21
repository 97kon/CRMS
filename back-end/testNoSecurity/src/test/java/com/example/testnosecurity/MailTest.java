package com.example.testnosecurity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;

@SpringBootTest
public class MailTest {
    @Autowired
    JavaMailSenderImpl mailSender;
    @Test
    public void contextLoads(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("今晚开会");
        message.setText("大家好");
        message.setTo("3231045496@qq.com");
        message.setFrom("3231045496@qq.com");
        mailSender.send(message);
    }


}
