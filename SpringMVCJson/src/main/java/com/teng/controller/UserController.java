package com.teng.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teng.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody // 不走视图解析器，直接返回页面
    public String json1() throws JsonProcessingException {
//        System.out.println("++++++++++++++");
        User user = new User("张三",19,"男");
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(user); // 对象转JSON
        return str;
    }
}
