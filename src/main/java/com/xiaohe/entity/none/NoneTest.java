package com.xiaohe.entity.none;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("noneTest")
public class NoneTest {
    private  int id;
    private String name = "xiaohe";

    @Autowired
    private None none;

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

    public None getNone() {
        return none;
    }

    public void setNone(None none) {
        this.none = none;
    }
}
