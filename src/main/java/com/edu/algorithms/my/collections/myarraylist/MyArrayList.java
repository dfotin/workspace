package com.edu.algorithms.my.collections.myarraylist;

import java.util.Arrays;

public class MyArrayList<E> {

    private static final int DEFAUL_SIZE = 10;

    private E[] elementData;
    private int size;

    public MyArrayList(int capacity) {
        this.size = 0;
        this.elementData = (E[]) new Object[capacity];
    }

    public MyArrayList() {
        this.size = 0;
        this.elementData = (E[]) new Object[DEFAUL_SIZE];
    }

    public void add(E element) {
        ensureCapacity(size + 1);
        this.elementData[size++] = element;
    }

    public void add(int index, E element) {
        ensureCapacity(size + 1);
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    public E get(int index) {
        return this.elementData[index];
    }

    public void remove(int index) {
        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        --size;
    }

    public void remove(E element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(element)) {
                remove(i);
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(element))
                return true;
        }
        return false;
    }

    public void printf() {
        System.out.println(Arrays.toString(this.elementData));
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity == size - 1) {
            E[] oldElementData = elementData;
            int newCapacity = (size * 3) / 2 + 1;
            elementData = (E[]) new Object[newCapacity];
            System.arraycopy(oldElementData, size, elementData, 0, size);
        }
    }
}
