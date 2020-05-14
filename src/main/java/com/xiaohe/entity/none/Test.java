package com.xiaohe.entity.none;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("bean2.xml");
        NoneTest noneTest = (NoneTest) applicationContext.getBean("noneTest");
        System.out.println(noneTest.getName());
        System.out.println(noneTest.getNone());
        System.out.println(noneTest.getId());
    }
}
