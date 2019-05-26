package com.edu.java8.beyoundLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Ukropchik on 02.07.2017.
 */
public class ItemService {
    private static final List<Item> items = Arrays.asList(new Item(5L, 1), new Item(7L, 2), new Item(2L, 3), new Item(11L, 4), new Item(7L, 5));

    public static Stream<Item> itemsMatching(Predicate<Item> id) {
        List<Item> resultList =new ArrayList<>();
        for (Item item : items) {
            if (id.test(item)){
                System.out.println(item);
                resultList.add(item);
            }
        }
        return resultList.stream();
        //return items.stream().filter(id).peek(System.out::println);
    }
}
