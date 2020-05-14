package com.xiaohe.entity;

public class Hello2{
    private  Message message;
    public Message getMessage() {
        return message;
    }
    public void setMessage(Message message) {
        System.out.println("spring执行依赖关系注入");
        this.message = message;
    }

    public Hello2(){
        System.out.println("spring 实体化主调");
    }
    public void close(){
        System.out.println("资源回收");
    }

}
