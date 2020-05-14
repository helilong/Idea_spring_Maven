package com.xiaohe.entity;



public class Hello {
   private  Message message;
    public Message getMessage() {
        return message;
    }
    public void setMessage(Message message) {
        System.out.println("spring执行依赖关系注入");
        this.message = message;
    }

    public Hello(){
        System.out.println("spring 实体化主调");
    }
    public void init(){
        System.out.println("测试初始化方法");
        message.say();
    }
}

