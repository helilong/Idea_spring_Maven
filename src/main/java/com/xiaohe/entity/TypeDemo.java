package com.xiaohe.entity;

import java.util.*;

public class TypeDemo {
    private  String string = "";
    private List list = new ArrayList();
    private Set set = new HashSet();
    private Map map = new HashMap();
    private Properties properties = new Properties();

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
