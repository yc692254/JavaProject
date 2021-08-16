package com.test.lab06;

public class QueueTest1 {
	public static void main(String [] args){
		MyQueueInterface<Integer> myList = new MySinglyLinkedList2<Integer>();
		
		Integer dequeued = null;
		
		System.out.println();
		System.out.println("Enqueue: 200.");
		myList.enqueue(200);		
		System.out.println();
		myList.listAll();
		System.out.println();
		System.out.println("Enqueue: 3.");
		myList.enqueue(3);
		System.out.println();
		myList.listAll();
		System.out.println();
		System.out.println("Enqueue: 4.");
		myList.enqueue(4);
		System.out.println();
		myList.listAll();
		dequeued = myList.dequeue();
		System.out.println("Dequeued: " + dequeued + ".");
		System.out.println();
		myList.listAll();
		dequeued = myList.dequeue();
		System.out.println("Dequeued: " + dequeued + ".");
		System.out.println();
		myList.listAll();
		System.out.println();
		System.out.println("Enqueue: 7.");
		myList.enqueue(7);
		System.out.println();
		myList.listAll();
		System.out.println();
		System.out.println("Enqueue: 9.");
		myList.enqueue(9);
		System.out.println();
		myList.listAll();
		System.out.println();
		System.out.println("Enqueue: 19.");
		myList.enqueue(19);
		System.out.println();
		myList.listAll();
		System.out.println();
		System.out.println("Enqueue: 5.");
		myList.enqueue(5);
		System.out.println();
		myList.listAll();
		System.out.println();
		System.out.println("Dequeue.");
		dequeued = myList.dequeue();
		System.out.println("Dequeued: " + dequeued + ".");
		System.out.println();
		myList.listAll();
	}
}