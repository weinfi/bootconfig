package com.leo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Description:
 * Created by Liuq on 2020-01-14.
 */
@Controller
public class LoginController {
    //@RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password")  String password,
                        Map<String,Object> map, HttpSession session){
        if(password.equals("123456")) {
            session.setAttribute("loginUser",username);
            return "redirect:/main";
        }else {
            map.put("msg","用户名密码错误");
            return "/";
        }
    }
}
