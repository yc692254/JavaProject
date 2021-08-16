package com.test.midterm2;

public class ReCurApp {

	public static void main(String [] str){
		int [] a = {2,3,5,9,14};
		int [] b = {1,2,6,8,3};
		int [] c = {10,9,8,6,3};
		
		//System.out.println(useMeToCheck(a, 0, a.length-1));
		//System.out.println(useMeToCheck(b, 0, b.length-1));
		
		System.out.println(useMeToCheck(a, 0, a.length-1));
		System.out.println(useMeToCheck(b, 0, b.length-1));
		System.out.println(useMeToCheck(c, 0, c.length-1));
	}
	
	// Recursive method(DESC)
	public static boolean useMeToCheck(int [] c, int b, int a){
		if((b+1) >= a) {
			return true;
		}
		int left  = c[b];
		int right = c[b+1];
		if(left >= right) {
			return useMeToCheck(c, b+1, a);
		}else {
			return false;
		}
	}
	
	

}
