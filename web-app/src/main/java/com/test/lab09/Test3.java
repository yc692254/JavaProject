package com.test.lab09;

public class Test3 {

	public static void main(String[] args) {
		Heap heap = new Heap(31); // make a Heap; max size 31
		heap.insert(100);
		heap.insert(89);
		heap.insert(90);
		heap.insert(70);
		heap.insert(80);
		heap.insert(50);
		heap.insert(75);
		
		heap.insert(50);
		heap.insert(60);
		
		heap.insert(40);
		heap.insert(55);
		
		heap.insert(20);
		heap.insert(30);
		
		heap.insert(50);
		heap.insert(70);
		heap.displayHeap();
		heap.remove();
		heap.displayHeap();
		heap.remove();
		heap.displayHeap();

	}

}
