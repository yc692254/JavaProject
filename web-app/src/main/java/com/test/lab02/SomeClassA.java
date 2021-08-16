package com.test.lab02;

public class SomeClassA {

	private int x; // notice the access modifier
	protected int y; // notice the access modifier

	public SomeClassA(int a, int b) {
		x = a;
		y = b;
	}

	public int add() {
		return x + y;
	}

	public String toString() {
		return "" + x + " " + y;
	}

}
