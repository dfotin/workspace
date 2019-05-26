package com.edu.ocp.collection;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App03 {
    public static void main(String[] args) {
        //magic(Stream.iterate(1, x -> x++));

        Map<Integer, List<String>> collect = Stream.of("bull", "cow", "sheep").collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }

    private static void magic(Stream<Integer> s) {
        Optional opt = s.filter(x -> x < 5).max((x, y) -> x - y);
        System.out.println(opt.get());
    }
}
