package com.test.lab10;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws Exception {

		 //int [] before = {2, 1, 0, 5, 7, 8, 3, 4, 11, 10, -1, 9, 22, 18, 34, 33, 45, 37, 78};
		int [] before = {10,5,20,12,24,37,2,18,22,36};
		//Sorters sorters=new Sorters();
		// sorters.mergeSort(before);

		 //sorters.quickSort(before);

	
		mSort(before, 0, before.length-1);
		System.out.println(Arrays.toString(before));
		//int[] array = { 5, 2, 8, 7, 9, 4 };
		// System.out.println(partition(array, 0, array.length-1));
		//qSort(array, 0, array.length-1);
		//System.out.println(Arrays.toString(array));

	}
	
	public static int merge(int [] a, int s, int m, int e){
		// Set up a temporary array
		int temp [] = new int[a.length];
		int p = 0; 
		int p1 = s; 
		int p2 = m + 1; 
		while (p1 != m + 1 && p2 != e + 1) {
			if (a[p1] < a[p2]) {
				temp[p] = a[p1];
				p1++;
			} else {
				temp[p] = a[p2];
				p2++;
			}
			p++;
		}
		if (p1 != m + 1) {
			
			System.arraycopy(a, p1, a, s + p, m + 1 - p1);
		}
		System.arraycopy(temp, 0, a, s, p);
		return 0;
	}

	
	public static void mSort(int [] a, int start, int end){
		if (start >= end) return;//base case
		int midpoint = start + (end-start)/2 ;
		//general case recursive sort left subA
		mSort(a, start, midpoint);
		//general case recursive sort right subA
		mSort(a, midpoint+1, end);
		merge(a, start, midpoint, end);
	}

	

	public static void qSort(int[] a, int start, int end) {
		// base case
		if (start >= end) {
			return;
		}
		int pivotIdx = partition(a, start, end);
		// general case recursive sort left subA
		qSort(a, start, pivotIdx - 1);
		// general case recursive sort right subA
		qSort(a, pivotIdx +1, end);
	}

	public static int partition(int[] a, int st, int end) {
		int pivot = a[end];
		int l = st;
		for (int r = st; r <= end - 1; r++) {
			if (a[r] <= pivot) {
				swap(a, l, r);
				l = l + 1;
			}
		}
		swap(a, l, end);
		return l;
	}

	public static void swap(int[] a, int p1, int p2) {
		int t = a[p1];
		a[p1] = a[p2];
		a[p2] = t;
	}

}
