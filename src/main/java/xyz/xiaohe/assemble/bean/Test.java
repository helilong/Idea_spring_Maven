package xyz.xiaohe.assemble.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("bean4.xml");
        BeanTest bean = (BeanTest) applicationContext.getBean("beanTest");
        bean.save();
    }
}
