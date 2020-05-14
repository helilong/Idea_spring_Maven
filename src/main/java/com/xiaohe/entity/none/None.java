package com.xiaohe.entity.none;

import org.springframework.stereotype.Component;

@Component
public class None {
    private int id;
    private  String name = "xiaohe2";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
