package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class MyOtherBean {

    @Autowired
    private MyBean myBean;

    public void doSomething() {
        System.out.println(myBean.getMessage());
    }
}
