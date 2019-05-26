package com.edu.inner;

/**
 * Created by Ukropchik on 31.05.2017.
 */
public class MainPoint {
    public static void main(String[] args) {
        SuperClass instance1 = new SuperClass() {
            public void doIt() {
                System.out.println("Anonymous class is doing ...");
            }
        };
        SuperClass instance2 = new SuperClass();

        instance1.doIt();
        instance2.doIt();
    }
}
