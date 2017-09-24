package com.yly;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * 学生类
 */
public class Stu {
    private int id;
    private String name;
    private int age;
    public Stu(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.err.println("");
        String str = new String();
    }
    public Stu() {
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
