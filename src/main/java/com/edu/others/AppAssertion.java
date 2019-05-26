package com.edu.others;

public class AppAssertion {

    private static boolean flag = false;

    public static void main(String[] args) {
        assert flag : print();
    }

    private static String print() {
        String ss = "Hello World!";
        System.out.println(ss);
        return ss;
    }

}


