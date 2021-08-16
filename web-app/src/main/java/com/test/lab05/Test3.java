package com.test.lab05;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fact(5));
		System.out.println(fib(5));
		System.out.println(pow_two(5));
		System.out.println(ruler(4));
		System.out.println(haoi(4, true));
		System.out.println(binarySonvert(37));
		int[] array= {1,2,4,6,7,9,10};
		reverArray(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
		//callatz(5);
		//solveTowerOfHanoi(4, "A", "B", "C");
	}
	//n+....5+4+3+3+2
	public static int sigma(int n) {
		if(n==1) {
			return n;
		}
		return n+sigma(n-1);
	}
	//x*x*x*...x
	public static int pow_two(int n) {
		if(n==0) {
			return 1;
		}
		return 2*pow_two(n-1);
	}
	

	//n*......5*4*3*2*1
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);

	}
	
	//memeber squence
	public static int memSec(int start, int d, int n) {
		if (n == 1)
			return start;
		else
			return (d + memSec(start, d, n - 1));
	} // sumSec
	
	//Fibonacci
	public static int fib(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return fib(n-1)+ fib(n-2);
	}
	
	
	
	//reverse string
	public static String reverseStr(String msg) {
		if(msg.length() <=1) {
			return msg;
		}
		return reverseStr(msg.substring(1))+ msg.charAt(0);
	}
	
	
	public static String ruler(int n) {
		if(n==0) {
			return " ";
		}
		return ruler(n-1) +n+ ruler(n-1);
	}
	
	public static String haoi(int n,boolean left) {
		String move;
		if(n==0) {
			return " ";
		}
		if(left) {
			move =n+"L";
		}else {
			move= n+"R";
		}
		return haoi(n-1, !left) + move + haoi(n-1, !left);
	}
	
	public static String binarySonvert(int n) {
		if(n==1) {
			return "1";
		}
		return binarySonvert(n/2) + (n%2);
	}
	
	public static void reverArray(int[] array,int start,int end) {
		if(start>=end) {
			return;
		}
		int temp = array[start];
		array[start]=array[end];
		array[end]=temp;
		
		reverArray(array, start+1, end-1);
	}
	
	public static int[] reverseArr(int[] arr, int length) {
		if (length <= arr.length / 2)
			return arr;
		else // swapping the values
		{
			int tempVal = arr[length - 1];
			arr[length - 1] = arr[arr.length - length];
			arr[arr.length - length] = tempVal;
		}
		return reverseArr(arr, length - 1);
	} // reverseArr
	
	//swap array
	public static void swap(int a[], int i) {
		int t = a[i];
		a[i] = a[i + 1];
		a[i + 1] = t;
	} // swap

	
	
	public static void callatz(int n) {
		System.out.print(n +" ");
		if(n==1) {
			return;
		}
		if(n%2==0) {
			callatz(n/2);
		}
		callatz(3*n+1);
		
	}
	
	public static void solveTowerOfHanoi(int num, String from, String to, String using) {

			if (num == 1) {
			    // Base Case: Move 1 disk...
			    System.out.println("Move disk from " + from +
					       " to " + to + ".");
			}
			else {
			    // Recursive Case: 
			    //   Move num-1 disks from the from peg to
			    //   the usingPeg using the toPeg.
				solveTowerOfHanoi(num-1, from, using, to);   // RC1
			
			    //   Move 1 disk from the fromPeg to the toPeg using
			    //   the usingPeg.
				solveTowerOfHanoi(1, from, to, using);            // RC2
			    
			    //   Move num-1 disks from the usingPeg to 
			    //   the toPeg using the fromPeg.
				solveTowerOfHanoi(num-1, using, to, from);   // RC3
			}
	}
}
