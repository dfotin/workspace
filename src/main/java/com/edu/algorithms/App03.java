package com.edu.algorithms;

import java.util.Arrays;

public class App03 {

	private static boolean isPalindrom(int x) {
		String initialNumber = String.valueOf(x);
		char[] initArray = new char[10];
		initialNumber.getChars(0, initialNumber.length(), initArray, initialNumber.length());

		System.out.println(initArray);

		char[] finalArray = new char[10];
		int i = initArray.length - 1;
		for (char c : initArray) {
			finalArray[i] = c;
			i--;
		}
		System.out.println(finalArray);

		System.out.println(Arrays.equals(initArray, finalArray));
		return true;
	}
}
