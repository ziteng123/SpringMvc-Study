package com.teng.test;

import com.teng.pojo.User;
import com.teng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class SpringMvcTest {
    @Autowired
    private UserService us;
    public void test(){
        User user = us.gets();
        System.out.println(user);
    }
    public static void main(String[] args) {
        SpringMvcTest sc = new SpringMvcTest();
        sc.test();

    }
}
