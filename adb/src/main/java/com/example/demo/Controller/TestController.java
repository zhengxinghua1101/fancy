package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("/hi")
    public String hi(Map<String,Object> map){
        map.put("hh","艹");
        return "hi";
    }
}
