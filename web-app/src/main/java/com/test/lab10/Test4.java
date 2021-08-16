package com.test.lab10;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Test4 {

	public static void main(String[] args) {
		int[] before = { 2, 1, 0, 5, 7, 8, 3, 4, 11, 10, -1, 9, 22, 18, 34, 33, 45, 37, 78 };
		// int[] aux =new int[before.length];
		mSort(before,0, before.length-1);
		//mergeSort(before);
		System.out.println(Arrays.toString(before));
		
	}

	public static void merge(int [] a, int s, int m, int e){
		int[] aux =new int[a.length];
		for (int k = s; k <= e; k++)
			 aux[k] = a[k];
		int i = s, j = m+1;
		for (int k = s; k <= e; k++) {
			if (i > m)
				a[k] = aux[j++];
			else if (j > e)
				a[k] = aux[i++];
			else if (aux[j] < aux[i])
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}
	}
	
	public static void mSort(int [] a, int start, int end){
		if (start >= end)
			return;
		int midpoint = start + (end-start)/2 ;
		mSort(a, start, midpoint);
		mSort(a, midpoint+1, end);
		merge(a, start, midpoint, end);
	}


}
