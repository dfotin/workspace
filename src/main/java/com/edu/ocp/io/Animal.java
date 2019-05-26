package com.edu.ocp.io;

import java.io.Serializable;

public class Animal implements Serializable {
    private static final long serialVersionUID = -6719549662719726253L;
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
