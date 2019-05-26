package com.edu.ocp.collection;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class App01 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(3, null);

        System.out.println(hashMap);

        hashMap.merge(1, 3, (v1, v2) -> v1 + v2);
        hashMap.merge(3, 3, (v1, v2) -> v1 - v2);

        System.out.println(hashMap);

    }
}
