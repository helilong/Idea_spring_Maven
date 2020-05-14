package com.xiaohe.entity.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class bean1 {


    public void bean(){
        System.out.println("bena方法执行");
    }


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
         bean1 bean1 = (bean1) applicationContext.getBean("bean1");
       //  bean1.bean();
    }
}
