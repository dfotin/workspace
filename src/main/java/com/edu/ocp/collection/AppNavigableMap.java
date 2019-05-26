package com.edu.ocp.collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class AppNavigableMap {

    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Jim");
        map.put(20, "Bill");
        map.put(30, "David");
        map.put(40, "Andrew");
        map.put(50, "Alex");


        System.out.println("ceiling key by the given \"35\" - " + map.ceilingKey(35));

        System.out.println("floor key by the given \"35\" - " + map.floorKey(35));

        System.out.println("higher key by the given \"40\" - " + map.higherKey(40));

        System.out.println("lower key by the given \"40\" - " + map.lowerKey(40));
    }

}
