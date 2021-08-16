package com.test.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSortUtils {

	public static void insertionSort(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			insert(list, i);
		}

	}

	private static void insert(List<Integer> l, int i) {
		
		int value = l.get(i);
		int j = i;
		while (j != 0 && (l.get(j - 1) > value)) {
			l.set(j, l.get(j - 1));
			j = j - 1;
		}
		l.set(j, value);
		
	}

	public static void binaryInsertionSort(List<Integer> list) {

		for (int i = 1; i < list.size(); i++) {
			int temp = list.get(i);
			int low = binarySearch(list, 0, i - 1, temp);
			for (int j = i - 1; j >= low; j--) {
				list.set(j + 1, list.get(j));
			}
			list.set(low, temp);

		}

	}

	private static int binarySearch(List<Integer> list, int lowerBound, int upperBound, int target) {
		while (lowerBound <= upperBound) {
			int middleIndex = (lowerBound + upperBound) / 2;
			if (list.get(middleIndex) > target) {
				upperBound = middleIndex - 1;
			} else {
				lowerBound = middleIndex + 1;
			}
		}
		return lowerBound;
	}

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(8, 6, 3, 10, 28, 20, 18, 25, 14, 30);
		System.out.println(list1);
		insertionSort(list1);
		System.out.println(list1);
		List<Integer> list2 = Arrays.asList(8, 6, 3, 10, 28, 20, 18, 25, 14, 30);
		System.out.println(list2);
		binaryInsertionSort(list2);
		System.out.println(list2);
		List<Integer> list3 =new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			int r = (int) (Math.random() * 20001) - 10000;
			list3.add(r);
		}
		//System.out.println(Arrays.toString(list3.toArray()));
		insertionSort(list3);
		System.out.println(list3.size()+","+Arrays.toString(list3.toArray()));
		
		List<Integer> list4 =new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			int r = (int) (Math.random() * 20001) - 10000;
			list4.add(r);
		}
		//System.out.println(Arrays.toString(list4.toArray()));
		binaryInsertionSort(list4);
		System.out.println(list4.size()+","+Arrays.toString(list4.toArray()));
	}

}
