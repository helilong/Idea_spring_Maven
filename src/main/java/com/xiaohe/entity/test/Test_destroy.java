package com.xiaohe.entity.test;

import com.xiaohe.entity.Hello2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_destroy {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Hello2 hello2 = (Hello2) applicationContext.getBean("hello2");
    }
}
