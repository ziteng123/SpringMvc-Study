package com.teng.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 代表这个类会被Spring接管
public class MvcController2 {

    @RequestMapping("/mvctest2") // 请求路径
    public String test1(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "mvc"; // 返回视图文件名，跳到mvc.jsp页面
    }
    @RequestMapping("/mvctest3")
    public String test2(Model model){
        model.addAttribute("msg","ControllerTest3");
        return "mvc";
    }
}
