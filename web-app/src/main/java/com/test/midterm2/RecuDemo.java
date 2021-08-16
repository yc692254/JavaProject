package com.test.midterm2;

public class RecuDemo {
	
	
	public static void main(String [] str){
		int [] a = {2,3,5,-8,14};
		int [] b = {1,2,6,8,3};
		
		System.out.println(calcSum(a, 0, a.length-1));
		System.out.println(calcSum(b, 0, b.length-1));
	}
	
	public static int calcSum(int [] input, int start, int end){
		if(end==start) {
			return input[end];
		}
		return input[end]+calcSum(input, start, end-1);
        // Your code goes here
	}

}
