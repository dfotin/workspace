package com.edu.lafore;

/**
 * Created by Ukropchik on 06.05.2017.
 */
public class HighArrayImpl implements HighArray {
    private long[] arr;
    private int numElems;

    public HighArrayImpl(int size) {
        arr = new long[size];
        numElems = 0;
    }

    @Override
    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < numElems; j++)
            if (arr[j] == searchKey)
                break;
        if (j == numElems)
            return false;
        else
            return true;
    }

    @Override
    public void insert(long value) {
        arr[numElems] = value;
        numElems++;
    }

    @Override
    public boolean delete(long value) {
        int j;
        for (j = 0; j < numElems; j++)
            if (value == arr[j])
                break;
        if (j == numElems)
            return false;
        else {
            for (int k = j; k < numElems; k++)
                arr[k] = arr[k + 1];
            numElems--;
            return true;
        }
    }

    @Override
    public void display() {
        for (int j = 0; j < numElems; j++)
            System.out.print(arr[j] + " ");
        System.out.println();
    }

    @Override
    public long removeMax() {
        long max = arr[0];
        if (max != 0) {
            for (int i = 0; i < numElems; i++) {
                if (max < arr[i + 1]) {
                    max = arr[i + 1];
                }
            }
            delete(max);
            return max;
        } else {
            return -1;
        }
    }
}
