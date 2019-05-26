package com.edu.ocp.collection;

import java.util.Comparator;
import java.util.function.Predicate;

public class App07 {

    Predicate<Integer> predicate = a -> true;
    Runnable runnable = () -> System.out.println();
    Comparator<Integer> comparator = (a, b) -> a - b;
}
