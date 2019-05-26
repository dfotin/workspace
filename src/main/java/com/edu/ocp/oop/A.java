package com.edu.ocp.oop;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class A {

    private int i;

    public void doingSomething(A a) {
        a.i = 1;

    }

    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();

        Optional<String> hello = empty.of("Hello");

        System.out.println(empty.orElse("UNKNOWN"));

        System.out.println(hello.orElse("UNKNOWN"));

        int r = ThreadLocalRandom.current().nextInt(1, 11);
    }
}