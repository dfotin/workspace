package com.edu.ocp.oop.house;

public class TestClass {
    public static void main(String[] args) {
        Office off = new HomeOffice();
        //  System.out.println(off.getAddress());
        System.out.println(Office.getAddress());

        HomeOffice homeOffice = new HomeOffice();
        System.out.println(homeOffice.getAddress());
    }
}
