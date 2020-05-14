package com.xiaohe.entity.test;

import com.xiaohe.entity.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_zhuru {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Cat cat= (Cat)applicationContext.getBean("cat");
        cat.Hello();
    }
}
