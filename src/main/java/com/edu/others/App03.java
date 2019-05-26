package com.edu.others;

import java.util.HashMap;
import java.util.LinkedList;

public class App03 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put(null, "Hello");

        System.out.println(hashMap);
        System.out.println(hashMap.get(null));

        hashMap.put(null, "Hello2");
        System.out.println(hashMap);


        LinkedList linkedList = new LinkedList();

    }
}
