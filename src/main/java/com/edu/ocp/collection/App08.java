package com.edu.ocp.collection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App08 {
    public static void main(String[] args) throws IOException {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(5, 6, 7);

        Stream<List<Integer>> stream = Stream.of(list1, list2);

        stream.flatMap(s->s.stream()).forEach(System.out::println);
        stream.flatMap(s->Stream.of(s.size())).forEach(System.out::println);

        App08 app08 = (App08) new Object();

        boolean sameFile = Files.isSameFile(Paths.get("s"), Paths.get("s"));

        boolean s = "".endsWith("a");
    }
}
