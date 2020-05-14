package com.xiaohe.entity.test;

import com.xiaohe.entity.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_init {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Hello hello = (Hello) applicationContext.getBean("hello");
    }
}
