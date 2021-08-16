package com.test.lab;

import java.util.Arrays;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		int[] nums =new int[] {8, 6, 3, 10, 28, 20, 18, 25, 14, 30};
		binaryInsertionSort(nums);
		System.out.println(Arrays.toString(nums));

	}
	
	public static void binaryInsertionSort(int[] nums) {
		int N = nums.length;
		for (int i = 0; i < N ; i++) {
			int low = 0;
			int high = i-1;
			while(low <= high){

				int middle = (low+high)/2;

				if(nums[middle] > nums[i])
					high = middle - 1;
				else
					low  = middle + 1;
		    }
			int temp = nums[i];

			for(int j = i; j > high + 1; j--){
				nums[j] = nums[j-1];

			}

			nums[high + 1] = temp;

			}
		
	}
	
	public static int findPosition(int[] nums, int x) {
		int low  =0;
		int high = nums.length -1;
	    while (low <= high) {
	        int mid = low + (high - low) / 2;

	        if (nums[mid] > x) {
	        	high = mid - 1;
	        } else {
	        	low = mid + 1;
	        }
	    }

	    return low;
	}
	
	public static void insertionSort(int[] nums) {
		int N = nums.length;
		for (int i = 0; i < N ; i++) {
			for (int j = i; j > 0 ; j--) {
				if(compareLess(nums[j], nums[j-1])) {
					exchange(nums, j-1, j);
				}else {
					break;
				}
			}
		}
	}
	
	public static boolean compareLess(int value1,int value2) {
		if(value1 < value2) {
			return true;
		}
		return false;
		
	}
	
	public static void exchange(int[] nums,int i ,int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j]  = temp;
	}
	
	
	public static void insertionSort(List<Integer> list) {
		int tempVal = 0;
		for (int i = 1; i < list.size(); i++) {
			tempVal = list.get(i);
			int j = i -1;
			while (j >= 0 && (tempVal < list.get(j))) {
				list.set(j+1, list.get(j));
				j= j-1;
			}
			list.set(j+1, tempVal);
			
		}
		
		
	}
	

}
