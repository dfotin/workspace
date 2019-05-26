package com.edu.lafore;

/**
 * Created by Ukropchik on 06.05.2017.
 */
public interface HighArray {
    boolean find(long searchKey);

    void insert(long value);

    boolean delete(long value);

    void display();

    long removeMax();
}
