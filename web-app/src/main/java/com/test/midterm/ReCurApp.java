package com.test.midterm;

public class ReCurApp {

	public static void main(String [] str){
		int [] a = {2,3,5,9,14};
		int [] b = {1,2,6,8,3};
		int [] c = {10,9,8,6,3};
		
		//System.out.println(useMeToCheck(a, 0, a.length-1));
		//System.out.println(useMeToCheck(b, 0, b.length-1));
		
		System.out.println(useMeToCheck2(a, 0, a.length-1));
		System.out.println(useMeToCheck2(b, 0, b.length-1));
		System.out.println(useMeToCheck2(c, 0, c.length-1));
	}
	// Recursive method
	public static boolean useMeToCheck(int [] c, int b, int a){
		
		int temp  = c[b];
		int temp2 = c[a];
		
		if(b >= a) {
			return temp <= temp2;
		}
		
		if(temp<=temp2) {
			return useMeToCheck(c, b+1, a-1);
		}else {
			return false;
		}
		
		
	}
	
	
	public static boolean useMeToCheck2(int [] c, int b, int a){
		if((b+1) >= a) {
			return true;
		}
		int temp  = c[b];
		int temp2 = c[b+1];
		if(temp >= temp2) {
			return useMeToCheck2(c, b+1, a);
		}else {
			return false;
		}
		
		
	}
	
	

}
