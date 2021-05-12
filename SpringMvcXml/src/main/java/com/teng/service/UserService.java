package com.teng.service;

import com.teng.dao.UserDao;
import com.teng.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserDao userdao;

    public User gets(){
        return new User(1,"张三");
    }
    public User getUser(){
        System.out.println("获取对象");
//        userdao = new UserDao();
        User user = userdao.get();
        System.out.println("大家好，我是"+user.getId()+"号选手，"+user.getName());
        return user;
    }



}
