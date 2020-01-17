package com.leo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

/**
 * Description:
 * Created by Liuq on 2020-01-14.
 */
@Controller
public class WebController {

    @RequestMapping("/success")
    public String mythymeleaf(Map<String,Object> map){
        map.put("a","<h1>你好</h1>");
        map.put("user", Arrays.asList("张三","李四","王五"));
        return "success";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
