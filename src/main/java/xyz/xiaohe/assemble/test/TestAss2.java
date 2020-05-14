package xyz.xiaohe.assemble.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.xiaohe.assemble.Cfq;

public class TestAss2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        Cfq cfq = (Cfq) applicationContext.getBean("cfq");
        cfq.getHelilong();
    }
}
