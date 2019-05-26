package com.edu.ocp.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class App04 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        list.add(1);
        list.add("2");
        list.add(.3);

        print(list);

        IntStream range = IntStream.range(1, 5);
    }

    private static void print(List list) {
        for (Object object : list) {
            System.out.print(object);
        }
    }
}
