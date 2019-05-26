package com.edu.algorithms;

/**
 * Find the missing number in an array in Java.
 */
public class App02 {

	public static void main(String[] args) {

		int[] array5 = {1, 2, 3, 5};

		int[] array6 = {1, 2, 3, 4, 6};

		System.out.println(getMissingNumber(array5, 5));

		System.out.println(getMissingNumber(array6, 6));
	}

	private static double getMissingNumber(int[] numbers, double totalCount) {
		double expectedSum = totalCount * ((totalCount + 1) / 2);
		int actualSum = 0;
		for (int i : numbers) {
			actualSum += i;
		}
		return expectedSum - actualSum;
	}

}
