package com.edu.ocp;

import java.util.*;
import java.util.stream.Collectors;

public class App10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("greg", "dave", "don", "ed", "fred");

        System.out.println("--- Collectors.groupingBy(Function<? super T, ? extends K> classifier)");
        Map<Integer, List<String>> collect1 = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect1);

        System.out.println("--- Collectors.groupingBy(Function<? super T, ? extends K> classifier, Collector<? super T, A, D> downstream)");
        Map<Integer, Long> collect2 = names.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(collect2);
        System.out.println(collect2.values());

        System.out.println("--- groupingBy(Function<? super T, ? extends K> classifier, Supplier<M> mapFactory, Collector<? super T, A, D> downstream)");
        TreeMap<Integer, Set<String>> collect3 = names.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println(collect3);

        StringBuilder collect4 = names.stream().parallel().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(collect4);

        String[] p = {"1", "2", "3"};

        List<String> list1 = Arrays.asList(p);

        List<String> list2 = new ArrayList<>(Arrays.asList(p));

        List<?> list3 = new ArrayList<>(Arrays.asList(p));
    }
}
