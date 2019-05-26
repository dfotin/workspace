package com.edu.ocp;

public class Child extends Parent {
    private String name = "child";
    public String nickname = "bestParent";

    @Override
    public void printName()  throws Error{
        System.out.println(name);
    }
}
