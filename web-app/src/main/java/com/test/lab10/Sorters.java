package com.test.lab10;

public class Sorters {
	public void bubbleSort(int [] array){
		if (array != null){
			int temporary;
			for (int i = 0; i < (array.length-1); i++){
				for (int j = 0; j < (array.length-i-1); j++){
					if (array[j] > array[j+1]){
						temporary = array[j];
						array[j] = array[j+1];
						array[j+1] = temporary;
					}
				}
			}
		} else {
			System.out.println("ERROR: Null array reference.");
		}	
	}
	public void selectionSort(int [] array){
		if (array != null){
			int temp;
			int max;
			for (int i = 0; i < array.length - 1; i++){
				max = 0;
				for (int j = 0; j < array.length-i-1; j++){
					if (array[j] < array[j+1]){
						max = j+1;
					}
				}
				temp = array[max];
				array[max] = array[array.length - i - 1];
				array[array.length - i - 1] = temp;
			}
		} else {
			System.out.println("ERROR: Null array reference.");
		}	
	}
	
	public void insertionSort(int [] array){
		if (array != null){
			int j, temp;
			for (int i = 1; i < array.length; i++ ) {
				j = i;
				temp = array[i];
				while (j != 0 && array[j - 1] > temp){
				  array[j] = array[j - 1];
				  j--;
				}
				array[j] = temp;
			}
		} else {
			System.out.println("ERROR: Null array reference.");
		}	
	}
	
	public void mergeSort(int[] array){
		if (array != null){
			//mSort(array, 0, array.length-1);
			int[] tmp = new int [array.length];
			mSort (array, tmp, 0, array.length - 1);
		} else {
			System.out.println("ERROR: Null array reference.");
		}	
	}
	
	private static void merge (int[] a, int[] tmp, int left, int center, int right)
	{	
	  int first1 = left;		
	  int last1 = center;
	  int first2 = center + 1;	
	  int last2 = right;

	  int idx = first1;

	  while ((first1 <= last1) && (first2 <= last2))
	  {	
	    if (a[first1] < a[first2])
	      tmp[idx++] = a[first1++];
	    else 
	      tmp[idx++] = a[first2++];
	  }

	  while (first1 <= last1)
	    tmp[idx++] = a[first1++]; 

	  while (first2 <= last2)
	    tmp[idx++] = a[first2++];

	  for (idx = left; idx <= right; idx++)
	    a[idx] = tmp[idx];
	}
	
	public static void mSort(int [] a,int[] tmp, int start, int end){
		if (start >= end)
			return;
		int midpoint = start + (end-start)/2 ;
		mSort(a,tmp, start, midpoint);
		mSort(a,tmp, midpoint+1, end);
		merge(a,tmp,start, midpoint, end);
	}
	
	public void quickSort(int[] array){
		if (array != null){
			qSort(array,  0, array.length-1);
		} else {
			System.out.println("ERROR: Null array reference.");
		}	
	}
	
	private int partition(int [] a, int st, int end){
		int pivot = a[end];
		int l = st;
		for(int r = st; r <= end-1; r++){
			if (a[r] <= pivot){
				swap(a, l, r);
				l = l+1;
			}
		}
		swap(a, l, end);
		return l;
	}
	
	private void swap(int[] a, int p1, int p2) {
		int t = a[p1];
		a[p1] = a[p2];
		a[p2] = t;
	}
	
	private void qSort(int [] a, int start, int end) {
		if (start >= end) {
			return;
		}
		int pivotIdx = partition(a, start, end);
		qSort(a, start, pivotIdx-1);
		qSort(a, pivotIdx + 1, end);
	}

}
