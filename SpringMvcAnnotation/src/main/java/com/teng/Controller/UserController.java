package com.teng.Controller;

import com.teng.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1") // 以get方式请求 @RequestParam表示该参数是从前端接收的
    public String test1(@RequestParam("username") String name, Model model){
        // 接收前段参数
        System.out.println("接受前端的参数:"+name);
        model.addAttribute("msg",name);
        // 视图跳转
        return "mvc";
    }
    @GetMapping("/t2")
    public String test2(User user,Model model){ // 前端传递的参数与对象属性名必须一致
        System.out.println(user);
        model.addAttribute("msg",user);
        return "mvc";
    }
}
