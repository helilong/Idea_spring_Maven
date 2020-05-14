package com.xiaohe.entity;

public class Cat implements Animal {
    private CallType call;
    public void  setCat(CallType call){
        this.call = call;
    }
    public CallType getCall() {
        return call;
    }

    public Cat(){

    }
    public Cat(CallType call){
        this.call = call;
    }

    public void setCall(CallType call) {
        this.call = call;
    }



    public void Hello() {
        System.out.println(call.callTest());
    }
}
