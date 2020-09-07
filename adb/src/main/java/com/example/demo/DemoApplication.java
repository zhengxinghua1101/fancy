package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import java.util.Date;

@EnableScheduling
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Resource
    private JavaMailSender mailSender;

    @Scheduled( cron = "0 30 22 1/1 * 1-7")
//      @Scheduled( cron = "1/30 * * * * 1-7")
    public  void code(){

        SimpleMailMessage message = new SimpleMailMessage();

        message.setSubject("提醒业务");
        message.setText("学习强国还有今日校园完成了么？我的小宝贝"+new Date());

        message.setFrom("583285444@qq.com");
        message.setTo("2081686841@qq.com");


        mailSender.send(message);
    }
}
