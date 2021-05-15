package com.teng.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MvcController3 {
    @RequestMapping(value="/add/{a}/{b}",method= RequestMethod.POST) // restful风格，请求方式为POST
    public String restfulTest(@PathVariable int a,@PathVariable String b, Model model){
        String str = a+b;
        model.addAttribute("msg", str);
        return "mvc";
    }
}
