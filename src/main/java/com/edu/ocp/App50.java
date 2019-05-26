package com.edu.ocp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App50 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("A", "B", "C");
        System.out.println(strings);

        Map<String, String> collect = strings.stream().collect(Collectors.toMap(a -> a, a -> a + 1));

        Predicate<Integer> predicate = (Integer i) -> i % 2 == 0;
    }
}
