package xyz.xiaohe.assemble;

import org.springframework.beans.factory.DisposableBean;

public class HelloWorld implements DisposableBean{

    private Message message;
    public Message getMessage() {
        return message;
    }
    public void setMessage(Message message) {
        this.message = message;
    }

    public HelloWorld() {

    }
    public HelloWorld(Message message) {
        this.message = message;
    }

    public void setMsg(){
        message.add();
        this.message=message;
    }

    public void init(){
        System.out.println("初始化");
    }

    public void destroy() throws Exception {
        System.out.println("销毁");
    }


}
