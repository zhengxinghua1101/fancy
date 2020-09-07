package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import java.util.Date;

@EnableScheduling  // 加载定时任务
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Resource
    private JavaMailSender mailSender;

    //这个一个定时任务每天的22：30分开始给指定邮箱发送一个邮件作为提醒  
    @Scheduled( cron = "0 30 22 1/1 * 1-7")
//      @Scheduled( cron = "1/30 * * * * 1-7")
    public  void code(){

        SimpleMailMessage message = new SimpleMailMessage();

        message.setSubject("提醒业务");
        message.setText("学这是文章正文"+new Date());

        message.setFrom("发信人qq@qq.com");
        message.setTo("收信人qq@qq.com");


        mailSender.send(message);
    }
}
