package com.edu.java8.beyoundLambdas;

import java.util.List;

/**
 * Created by Ukropchik on 02.07.2017.
 */
public interface CopyInterface<T> {

     List<T> copy(List<T> list);
}
