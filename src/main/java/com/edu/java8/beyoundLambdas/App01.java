package com.edu.java8.beyoundLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ukropchik on 02.07.2017.
 */
public class App01 {
    private static List<String> list = Arrays.asList("A", "B", "C", "D");
     private static CopyInterface<String> copyInterface = (list) -> new ArrayList<>(list);

    public static void main(String[] args) {
        pring(copyInterface);
    }

    private static void pring(CopyInterface<String> anInterface) {
        System.out.println(anInterface.copy(list));
    }
}
