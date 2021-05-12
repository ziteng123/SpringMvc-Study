package com.teng.service;

import com.teng.dao.HelloDao;

public class HelloService {
    private HelloDao helloDao;
    private String name;

    public HelloService(HelloDao helloDao, String name) {
        this.helloDao = helloDao;
        this.name = name;
    }

    public HelloService(String name) {
        this.name = name;
    }

    public HelloService() {
    }

    public HelloDao getHelloDao() {
        return helloDao;
    }

    public void setHelloDao(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello, "+this.name);
    }
}
