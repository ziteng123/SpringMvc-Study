package com.teng.dao;

import com.teng.pojo.User;

public class UserDao {
    public User get(){
        return new User(1,"张三");
    }
}
