package com.teng.controller;

import com.teng.pojo.User;
import com.teng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MvcHelloController implements Controller {
    @Autowired
    private UserService us;
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView view = new ModelAndView();
        User user = us.getUser();
        view.addObject("user",user);
        // 设置视图跳转
        view.setViewName("hello");

        return view;
    }
}
