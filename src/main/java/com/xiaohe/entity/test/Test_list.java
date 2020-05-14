package com.xiaohe.entity.test;

import com.xiaohe.entity.TypeDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_list {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        TypeDemo typeDemo = (TypeDemo) applicationContext.getBean("typeDemo");
        System.out.println(typeDemo.getString());
        System.out.println(typeDemo.getList());
        System.out.println(typeDemo.getSet());
        System.out.println(typeDemo.getMap());
        System.out.println(typeDemo.getProperties());
    }
}
