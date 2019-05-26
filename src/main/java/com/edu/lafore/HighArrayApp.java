package com.edu.lafore;

/**
 * Created by Ukropchik on 06.05.2017.
 */
public class HighArrayApp {
    public static void main(String[] args) {
        HighArray highArray = new HighArrayImpl(100);
        highArray.insert(152);
        highArray.insert(412);
        highArray.insert(745);
        highArray.insert(587);
        highArray.insert(1000);
        highArray.display();

        System.out.println(highArray.find(745));

       // System.out.println(highArray.delete(412));
        highArray.display();

        //System.out.println(highArray.removeMax());

        highArray.display();

        HighArray emptyArray = new HighArrayImpl(10);
        System.out.println(emptyArray.removeMax());

        HighArray sortedArray = new HighArrayImpl(100);
        sortedArray.insert(highArray.removeMax());
        sortedArray.insert(highArray.removeMax());
        sortedArray.insert(highArray.removeMax());
        sortedArray.insert(highArray.removeMax());
        sortedArray.insert(highArray.removeMax());

        sortedArray.display();

    }
}
