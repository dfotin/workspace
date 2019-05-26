package com.edu.ocp.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App10 {
    public static void main(String[] args) {


        ArrayList<Integer> source = new ArrayList<Integer>();
        source.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> destination = Collections.synchronizedList(new ArrayList<Integer>());

        source.parallelStream().peek(item -> {
            destination.add(item);
        }).forEachOrdered(System.out::print); // peek would be in parallel manner but because of forEachOrdered output will be ordered like in source

        System.out.println("");

        destination.stream().forEach(System.out::print);
    }
}