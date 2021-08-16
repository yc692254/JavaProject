package com.test.lab06;
public class ListTest2 {
	public static void main(String [] args){
		MySinglyLinkedList<Integer> myList = new MySinglyLinkedList<Integer>();
		
		myList.addFront(200);		
		System.out.println();
		myList.listAll();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());

		myList.add(3);
		System.out.println();
		myList.listAll();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		myList.add(4);
		System.out.println();
		myList.listAll();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		myList.add(5);
		System.out.println();
		myList.listAll();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		myList.add(6);
		System.out.println();
		myList.listAll();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		myList.add(7);
		System.out.println();
		myList.listAll();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		myList.removeTail();
		System.out.println();
		myList.listAll();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		myList.remove(2);		
		System.out.println();
		myList.listAll();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		myList.add(2,100);		
		System.out.println();
		myList.listAll();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		myList.removeTail();		
		System.out.println();
		myList.listAll();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
	
	}
}