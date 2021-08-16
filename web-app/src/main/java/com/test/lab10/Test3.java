package com.test.lab10;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		int[] before = { 2, 1, 0, 5, 7, 8, 3, 4, 11, 10, -1, 9, 22, 18, 34, 33, 45, 37, 78 };
		// int[] aux =new int[before.length];
		// mSort(before,aux, 0, before.length-1);
		mergeSort(before);
		System.out.println(Arrays.toString(before));
	}

	public static void merge(int[] result, int[] left, int[] right) {
		int i1 = 0; // index into left array
		int i2 = 0; // index into right array
		for (int i = 0; i < result.length; i++) {
			if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
				result[i] = left[i1]; // take from left
				i1++;
			} else {
				result[i] = right[i2]; // take from right
				i2++;
			}
		}
	}

	public static void mergeSort(int[] a) {
		if (a.length >= 2) {
			// split array into two halves
			int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
			int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
			// recursively sort the two halves
			mergeSort(left);
			mergeSort(right);
			// merge the sorted halves into a sorted whole
			merge(a, left, right);
		}
	}

}
