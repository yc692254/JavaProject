package com.test.midterm;

import java.util.Scanner;
import java.util.Stack;

public class CS401Bin2Dec {
	
	public static Double conversion(String number) throws Exception {
		int n = number.length();
		Stack<Integer> stack=new Stack<Integer>();
		char[] charNums= number.toCharArray();
		for (int i = 0; i < charNums.length; i++) {
			Integer num=Integer.parseInt(String.valueOf(charNums[i]));
			if(num > 1) {
				throw new Exception("conversion aborted");
				
			}else {
				stack.push(num);
			}
			
		}
		double sum=0;
		for (int i = 0; i < n; i++) {
			Integer num = stack.pop();
			sum+= num * Math.pow(2, i);
		}
		return sum;
		
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(conversion("111001"));
		System.out.println(conversion("1101"));
		System.out.println(conversion("1101101"));
		System.out.println(Math.pow(2, 1));
		getInput();
	}
	
	public static void getInput() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please input binary String. only 0 or 1,exit system:");
		
		String input =null;
		while (scanner.hasNext()) {
			input = scanner.nextLine();
			if(input.equals("exit")) {
				System.out.println("exit system.");
				break;
			}
			System.out.println("input:"+ input);
			double sum=0;;
			try {
				sum = conversion(input);
			} catch (Exception e) {
				System.out.println("input must binary String .only 0 or 1,conversion aborted");
				break;
			}
			System.out.println("conversion num:"+sum);
			
			
		}
		
	}
	
	public static boolean checkInput(String input) {
		boolean falg = true;
		char[] charNums = input.toCharArray();
		for (int i = 0; i < charNums.length; i++) {
			int num =Integer.parseInt(String.valueOf(charNums[i]));
			if(num > 1) {
				return false;
			}
		}
		return falg;
		
	}

}
