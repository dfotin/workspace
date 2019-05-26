package com.edu.ocp.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;

public class App05 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        CopyOnWriteArrayList<Integer> list2 = new CopyOnWriteArrayList<>(list1);

        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1, 2);
        map.put(3, 3);

        List<Integer> list3 = Collections.synchronizedList(list1);

        // for (Integer item : list1) list1.add(10); // java.util.ConcurrentModificationException

        for (Integer item : list2) list2.add(10);

        for (Integer item : map.keySet()) map.remove(0);

        for (Integer item : list3) list3.remove(0);

        System.out.println(list1.size() + " " + list2.size() + " " + list3.size());


    }
}