package com.edu.algorithms.my.collections.mylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;

import static org.hamcrest.core.Is.is;

public class MyLinkedListTest {

    @Test
    public void constructorTest() {
        // given
        MyLinkedList myLinkedList = new MyLinkedList();

        // when
        int size = myLinkedList.size();

        // then
        Assert.assertThat("Should be zero", myLinkedList.size(), is(0));
    }
}
