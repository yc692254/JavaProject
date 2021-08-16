package com.test.lab05;

public class RecursiveApp {
	
	public static boolean isPalindrome(String str) {
		String clean = str.replaceAll("\\s+", "").toLowerCase();
		int len = clean.length();
		if (len < 2)
			return true;
		if (clean.charAt(0) != clean.charAt(len - 1))
			return false;
		return isPalindrome(clean.substring(1, len - 1));
	}
	
	public static double squareRoot(double a, double t) {
		double guess = a / 2;
		return square(guess, a, t);
	}

	public static double square(double guess, double a, double t) {
		if ((Math.abs(Math.pow(guess, 2.0) - a) < Math.abs(t))) {
			return guess;
		} else {
			double nguess = ((guess + a / guess) / 2);
			return square(nguess, a, t);
		}
	}
	
	public static void main(String[] args) {
		double n = 327;
		double l = 0.000000001;

		System.out.println(isPalindrome("43211234"));
		System.out.println(squareRoot(n, l));
	}
	
	

}
