package com.teng.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.teng.pojo.User;
import com.teng.utils.GetJson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController // 该注解表示不走视图解析器
public class UserController2 {
    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
        List<User> users = new ArrayList<>();
        User user1 = new User("张三",20,"男");
        User user2 = new User("李四",21,"女");
        User user3 = new User("王五",22,"男");
        User user4 = new User("赵六",23,"女");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

//        String str = objectMapper.writeValueAsString(users);
        return GetJson.getJson(users);
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return objectMapper.writeValueAsString(sdf.format(date));
    }
    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        // 自定义日期格式
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);// 关闭时间戳
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        objectMapper.setDateFormat(sdf); // 自定义r日期格式
        Date date = new Date();
        return objectMapper.writeValueAsString(date);

    }

    @RequestMapping("/j5")
    public String json5(){
        Date date = new Date();
        return GetJson.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }

}
