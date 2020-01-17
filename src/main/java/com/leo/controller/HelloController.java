package com.leo.controller;


import com.leo.exception.UserNotExistException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@Value("${person.last-name}")
    @Value("${person.last-name}")
    private String name;
    @Value("${guest.name}")
    private String name1;

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello "+name+" "+name1;
    }

    @RequestMapping("/hi")
    public String sayHi(@RequestParam("user") String user){
        if (user.equals("aaa")){
          throw new UserNotExistException();
        }
        return "Hello";
    }
}
