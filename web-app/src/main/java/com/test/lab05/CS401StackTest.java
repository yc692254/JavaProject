package com.test.lab05;

public class CS401StackTest {
	public static void main(String [] args){
		CS401Stack<Integer> myStack = new CS401Stack<Integer>();
		
		System.out.println("Stack empty: " + myStack.isEmpty());
		System.out.println("Stack size: " + myStack.size());
		myStack.listAll();
		System.out.println();
		
		myStack.push(3);
		System.out.println();
		System.out.println("Stack empty: " + myStack.isEmpty());
		System.out.println("Stack size: " + myStack.size());
		myStack.listAll();
		System.out.println();
		
		myStack.push(4);
		System.out.println("Stack empty: " + myStack.isEmpty());
		System.out.println("Stack size: " + myStack.size());
		myStack.listAll();
		System.out.println();
		
		System.out.println("Top stack element is: " + myStack.peek());
		
		myStack.pop();
		System.out.println("Stack empty: " + myStack.isEmpty());
		System.out.println("Stack size: " + myStack.size());
		myStack.listAll();
		System.out.println();
		
		myStack.push(10);
		System.out.println("Stack empty: " + myStack.isEmpty());
		System.out.println("Stack size: " + myStack.size());
		myStack.listAll();
		System.out.println();
		
		myStack.push(20);
		System.out.println("Stack empty: " + myStack.isEmpty());
		System.out.println("Stack size: " + myStack.size());
		myStack.listAll();
		System.out.println();
		
		myStack.push(-10);
		System.out.println("Stack empty: " + myStack.isEmpty());
		System.out.println("Stack size: " + myStack.size());
		myStack.listAll();
		System.out.println();
		
		System.out.println("Top stack element is: " + myStack.peek());
		
		myStack.pop();
		System.out.println("Stack empty: " + myStack.isEmpty());
		System.out.println("Stack size: " + myStack.size());
		myStack.listAll();
		System.out.println();
	}
}