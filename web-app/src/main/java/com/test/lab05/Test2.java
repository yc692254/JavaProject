package com.test.lab05;

import java.math.BigDecimal;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Math.sqrt(327));

		double n = 327;
		double l = 0.000000001;

		System.out.println(squareRoot(n, l));
		System.out.println(sqrt(n, l));
		//System.out.println("------------------" + squareRoot( n, l));
		// System.out.println(sqarRoot(n, l));

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

	public static double sqrt(double a, double t) {
		double guess = a / 2;
		return sqrtIter(guess, a, t);
	}

	public static double sqrtIter(double guess, double x, double l) {
		
		double error =Math.abs(Math.sqrt(x) - guess);
		System.out.println("guess:"+ guess +"\t:"+x+"\t:"+String.format("%.24f", error));
		if (error < Math.abs(l)) {
			return guess;
		} else {
			double nguess = ((guess + x / guess) / 2);
			return sqrtIter(nguess, x, l);
		}

	}

	public static boolean isGoodEnough(double guess, double x, double l) {
		return (Math.abs(Math.pow(guess, 2.0) - x) < l);
	}

	public static double improve(double guess, double x) {
		return ((guess + x / guess) / 2);

	}

	static double squareRoot2(double n, double l) {
		// Assuming the sqrt of n as n only
		double x = n;

		// The closed guess will be stored in the root
		double root;

		// To count the number of iterations
		int count = 0;

		while (true) {
			count++;

			// Calculate more closed x
			root = 0.5 * (x + (n / x));
			System.out.println("root:" + root + "\t:" + x + "\t:error:" + Math.abs(root - x));

			// Check for closeness
			if (Math.abs(root - x) < l) {
				// System.out.println("break:"+Math.abs(root - x));
				break;
			}
			// Update root
			x = root;
		}

		return root;
	}

	static double getRoot(double x2, double n) {
		// System.out.println("value:"+x2+":"+n);
		if (x2 * x2 - n < 0.0001)
			return x2;
		else {
			return getRoot((x2 + n / x2) / 2, n);
		}
	}

}
