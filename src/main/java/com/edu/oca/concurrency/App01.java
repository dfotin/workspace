package com.edu.oca.concurrency;

/**
 * Created by Ukropchik on 04.02.2018.
 */
public class App01 {
    public static void main(String[] args) {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println(availableProcessors);
    }
}