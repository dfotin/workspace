package com.edu.ocp.collection;

import java.util.ArrayList;
import java.util.List;

public class App06 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(1);
        list.add("a");
        list.add(.30);

        print(list);
    }

    private static void print(List<?> list) {
      //  list.add(11);
        for (Object object : list) {
            System.out.print(object);
        }
    }
}
