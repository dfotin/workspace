package com.edu.algorithms.my.collections.mylinkedlist;

public class MyLinkedList<E> {

    private Node<E> first;

    private Node<E> last;

    private int size;

    public MyLinkedList() {
        this.first = new Node<>();
        this.last = new Node<>();
        this.size =0;
    }

    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;
    }

    public int size() {
        return size;
    }

}
