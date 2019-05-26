package com.edu.algorithms.my.collections.myarraylist;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class MyArrayListTest {

    @Test
    public void constructorTest_Empty() {
        // give
        MyArrayList<Object> myArrayList = new MyArrayList<>();

        // when
        int listSize = myArrayList.size();

        // then
        Assert.assertThat("Initial size should be 0!", listSize, is(0));
    }

    @Test
    public void constructorTest_WithSetSize() {
        // give
        int capacity = 50;
        MyArrayList<Object> myArrayList = new MyArrayList<>(capacity);

        // when
        for (int i = 0; i < capacity; i++) {
            myArrayList.add(new Object());
        }

        // then
        Assert.assertThat("Size should be " + capacity, myArrayList.size(), is(capacity));
    }

    @Test
    public void addTest() {
        // give
        String element1 = "James";
        String element2 = "David";

        MyArrayList<String> myArrayList = fulfillMyArrayList(element1, element2);

        // when
        int listSize = myArrayList.size();

        // then
        Assert.assertThat("Initial size should be equal to the amount of elements that were added", listSize, is(2));
        Assert.assertThat("Elements should be equal", myArrayList.get(0), is(element1));
        Assert.assertThat("Elements should be equal", myArrayList.get(1), is(element2));
    }

    @Test
    public void addTest_SpecialPosition() {
        // given
        String element1 = "James";
        String element2 = "David";
        String element3 = "Max";
        String element4 = "Olha";
        String element5 = "Mendy";

        MyArrayList<String> myArrayList = fulfillMyArrayList(element1, element2, element3, element5);

        // when
        myArrayList.add(2, element4);

        // then
        Assert.assertThat("Should be in another position", myArrayList.get(0), is(element1));
        Assert.assertThat("Should be in another position", myArrayList.get(1), is(element2));
        Assert.assertThat("Should be in another position", myArrayList.get(2), is(element4));
        Assert.assertThat("Should be in another position", myArrayList.get(3), is(element3));
        Assert.assertThat("Should be in another position", myArrayList.get(4), is(element5));

    }

    @Test
    public void removeTest_ByIndex() {
        // given
        String element1 = "James";
        String element2 = "David";
        String element3 = "Max";

        MyArrayList<String> myArrayList = fulfillMyArrayList(element1, element2, element3);

        // when
        myArrayList.remove(1);

        // then
        Assert.assertThat("Size should decrease", myArrayList.size(), is(2));
        Assert.assertFalse("Expected no removed element present in the array", myArrayList.contains(element2));
    }

    @Test
    public void removeTest_ByObject() {

        // given
        String element1 = "James";
        String element2 = "David";
        String element3 = "Max";

        MyArrayList<String> myArrayList = fulfillMyArrayList(element1, element2, element3);

        // when
        myArrayList.remove(element2);

        // then
        Assert.assertThat("Size should decrease", myArrayList.size(), is(2));
        Assert.assertFalse("Expected no removed element present in the array", myArrayList.contains(element2));
    }

    @Test
    public void containsTest() {
        // given
        String element1 = "James";
        String element2 = "David";
        String element3 = "Max";
        String element4 = "Olha";
        String element5 = "Mendy";

        MyArrayList<String> myArrayList = fulfillMyArrayList(element1, element2, element3, element4);

        // when
        boolean containsElement3 = myArrayList.contains(element3);
        boolean containsElement5 = myArrayList.contains(element5);

        // then
        Assert.assertTrue("Should be present", containsElement3);
        Assert.assertFalse("Should not be present", containsElement5);
    }

    @Test
    public void sizeTest() {
        // given
        String element1 = "James";
        String element2 = "David";
        String element3 = "Max";

        MyArrayList<String> myArrayList = fulfillMyArrayList(element1, element2, element3);

        // when
        int size = myArrayList.size();

        // then
        Assert.assertThat("Incorrect size of array", size, is(3));

    }


    private MyArrayList<String> fulfillMyArrayList(String... element) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        for (int i = 0; i < element.length; i++) {
            myArrayList.add(element[i]);
        }
        return myArrayList;
    }
}
