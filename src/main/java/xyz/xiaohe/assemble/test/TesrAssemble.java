package xyz.xiaohe.assemble.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.xiaohe.assemble.HelloWorld;

public class TesrAssemble {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("hello");
        helloWorld.setMsg();
    }
}
