package com.edu.ocp.oop;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class TestClass {

    public static void main(String[] args) {
        OuterWorld outerWorld = new OuterWorld();

        //String[] a = {"1", "2", "3"};

      //  List<?> l = new ArrayList<>(Arrays.asList(a));
//
        Path p1 = Paths.get("x\\y");
        Path p2 = Paths.get("z");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);

        List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b)->a>b?a:b));
        System.out.println(ls.stream().max(Integer::max).get());
        System.out.println(ls.stream().max(Integer::compare).get());
        System.out.println(ls.stream().max((a, b)->a>b?a:b)); //4

        Locale.getDefault();

        new Locale("", "");

        Locale l=  Locale.US;

        DoubleStream doubleStream = DoubleStream.of(1, 2, 3);

    }
}
