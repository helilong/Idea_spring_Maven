package com.xiaohe.entity.aop;


import org.springframework.stereotype.Component;

@Component("book")
public class Book {

    public void add(){
        System.out.println("add_____________");
    }

}
