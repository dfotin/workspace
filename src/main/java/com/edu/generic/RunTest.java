package com.edu.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ukropchik on 18.05.2017.
 */
public class RunTest {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Cola());
        list.add(new Pork());
        doPacking(list);
        System.out.println();
    }

    public static <T extends Product> void doPacking(List<T> list) {
        list.add(list.remove(1));
       // return list.get(0);
    }
}
