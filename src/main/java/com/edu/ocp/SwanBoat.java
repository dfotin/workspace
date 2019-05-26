package com.edu.ocp;

import java.util.stream.IntStream;

public class SwanBoat {
    private static SwanBoat boat;

    public void row() {

    }

    public void paddle() {
        IntStream.range(1, 10).forEach(i -> boat.row());
    }

    public static void main(String[] args) {
        boat = new SwanBoat();

    }
}
