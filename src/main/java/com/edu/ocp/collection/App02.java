package com.edu.ocp.collection;

import java.util.Arrays;

public class App02 {
    public static void main(String[] args) {
        Arrays.asList('a', 'c', 'b', 'b').stream()
                .sorted()
                .distinct()
                .forEach(System.out::print);

    }
}
