package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import java.util.Date;

//@EnableScheduling
@SpringBootTest
class DemoApplicationTests {

    @Resource
    private JavaMailSender mailSender;

//    @Scheduled( cron = "0 0 22 1/1 * 1-7")
//    @Scheduled( cron = "1/30 * * * * 1-7")
    @Test
    void contextLoads() {

//        SimpleMailMessage message = new SimpleMailMessage();
//
//        message.setSubject("提醒业务");
//        message.setText("学习强国还有今日校园完成了么？我的小宝贝"+new Date());
//
//        message.setFrom("583285444@qq.com");
//        message.setTo("1514451780@qq.com");
//
//
//
//
//        mailSender.send(message);
    }

}
