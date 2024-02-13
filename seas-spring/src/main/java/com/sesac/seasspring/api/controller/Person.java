package com.sesac.seasspring.api.controller;

import lombok.Getter;
import lombok.Setter;

// @Getter
// @Setter
@Getter
@Setter
public class Person {
    private String name;
    private int age;
    // lombok
    public Person(String name, int age){
        this.name = name;
        this.age = age;
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