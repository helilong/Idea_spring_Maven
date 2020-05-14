package com.xiaohe.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

    private  String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static void main(String[] args) {
        BeanFactory beanFactory= new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("HelloWorldBean");
        System.out.println(helloWorld.getInfo());

    }
}
