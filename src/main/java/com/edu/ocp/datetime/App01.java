package com.edu.ocp.datetime;

import java.time.LocalDate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class App01 {
    public static void main(String[] args) {
        Stream<LocalDate> s = Stream.of(LocalDate.now());
        UnaryOperator<LocalDate> u = l -> l;

        System.out.println(s.filter(l -> l != null).map(u));
    }
}
