package com.xiaohe.entity.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("none.xml");
        Book book = (Book) applicationContext.getBean("book");
        book.add();
    }
}
