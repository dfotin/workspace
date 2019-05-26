package com.edu.java8.beyoundLambdas;

import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Created by Ukropchik on 02.07.2017.
 */
public class _1 {

    @Test
    public void _m() {
        final Long idToFind = 7L;
        final Predicate<Item> idFilter = item -> item.getId().equals(idToFind);

        ItemService.itemsMatching(idFilter)
                .reduce(toOneItem())
                .ifPresent(System.out::println);
    }

    private BinaryOperator<Item> toOneItem() {
        return (a, b) -> {
            throw new IllegalStateException("Found multiple items with id " + a.getId());
        };
    }
}
