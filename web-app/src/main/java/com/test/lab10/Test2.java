package com.test.lab10;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int merge(int [] a, int s, int m, int e){
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
	
	private void mSort(int [] a, int start, int end){
		if (start >= end)
			return;
		int midpoint = start + (end-start)/2 ;
		mSort(a, start, midpoint);
		mSort(a, midpoint+1, end);
		merge(a, start, midpoint, end);
	}

}
