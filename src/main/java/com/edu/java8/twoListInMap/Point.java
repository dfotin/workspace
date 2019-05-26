package com.edu.java8.twoListInMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Ukropchik on 01.06.2017.
 */
public class Point {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>() {
            {
                add("Dima");
                add("Petro Ivanovuch");
            }
        };

        System.out.println(list1);

        List<String> list2 = Arrays.asList("Fotin", "Ovsyk");

        System.out.println(list2);

        Map<String, String> map = IntStream.range(0, list1.size()).boxed()
                .collect(Collectors.toMap(i -> list1.get(i), i -> list2.get(i)));

        System.out.println(map);

    }
}
