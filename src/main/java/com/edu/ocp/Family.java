package com.edu.ocp;

public class Family {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.printName();
        child.printName();

        System.out.println(parent.abbreviation);

        System.out.println(child.nickname);
        System.out.println(child.abbreviation);


    }
}
