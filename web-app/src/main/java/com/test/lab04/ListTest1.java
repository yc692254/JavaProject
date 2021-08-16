package com.test.lab04;

public class ListTest1 {
	public static void main(String [] args){
		MySinglyLinkedList<Integer> myList = new MySinglyLinkedList<Integer>();
		

		System.out.println();
		myList.listAll();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		System.out.println("List size: " + myList.size());
		System.out.println("Index of element 100 (if exists): " + myList.indexOf(100));
		System.out.println("Index of element 200 (if exists): " + myList.indexOf(200));
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		
		myList.add(0,100);
		System.out.println();
		myList.listAll();
		
		
		System.out.println("Index of element 100 (if exists): " + myList.indexOf(100));
		System.out.println("Index of element 200 (if exists): " + myList.indexOf(200));
		
		System.out.println();
		myList.listAll();
		myList.add(8);
		System.out.println();
		myList.listAll();
		myList.addFront(9);
		System.out.println();
		myList.listAll();
		System.out.println("Index of element 100 (if exists): " + myList.indexOf(100));
		System.out.println("Index of element 200 (if exists): " + myList.indexOf(200));
		
		myList.addFront(10);
		System.out.println();
		myList.listAll();
		myList.add(2,0);
		System.out.println();
		myList.listAll();
		
		System.out.println();
		System.out.println("Element at index -1: " + myList.get(-1));
		System.out.println("Element at index 2: " + myList.get(2));
		
		System.out.println();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		System.out.println("List size: " + myList.size());
		
		myList.remove(3);
		myList.remove(3);
		System.out.println();
		myList.listAll();
		
		System.out.println();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		System.out.println("List size: " + myList.size());
		
		myList.remove(0);
		System.out.println();
		myList.listAll();
		
		System.out.println();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		System.out.println("List size: " + myList.size());
		
		myList.removeTail();
		System.out.println();
		myList.listAll();
		
		System.out.println();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		System.out.println("List size: " + myList.size());
		
		myList.remove(0);
		
		System.out.println();
		myList.listAll();
		
		System.out.println();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		System.out.println("List size: " + myList.size());
		
		
		myList.remove(0);
		System.out.println();
		myList.listAll();
		
		System.out.println();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		System.out.println("List size: " + myList.size());
		
		myList.remove(0);
		System.out.println();
		myList.listAll();
		
		System.out.println();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		System.out.println("List size: " + myList.size());
		
		myList.remove(0);
		System.out.println();
		myList.listAll();
		
		System.out.println();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		System.out.println("List size: " + myList.size());
		
		myList.remove(0);
		System.out.println();
		myList.listAll();
		
		System.out.println();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		System.out.println("List size: " + myList.size());
		
		myList.remove(0);
		System.out.println();
		myList.listAll();
		
		System.out.println();
		System.out.println("Element at the front: " + myList.getFront());
		System.out.println("Element at the tail: " + myList.getTail());
		System.out.println("List size: " + myList.size());
	}
}