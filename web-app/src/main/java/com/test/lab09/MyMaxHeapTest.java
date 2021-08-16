package com.test.lab09;

public class MyMaxHeapTest {

	public static void main(String[] args) {
		MyMaxHeap<Integer,Integer> heap=new MyMaxHeap<Integer,Integer>();
		System.out.println("MyMaxHeap with Integer keys");
		heap.insert(90, 90);
		heap.insert(89, 89);
		heap.insert(70, 70);
		heap.insert(36, 36);
		heap.insert(75, 75);
		heap.insert(63, 63);
		heap.insert(65, 65);
		heap.insert(21, 21);
		heap.insert(18, 18);
		heap.insert(15, 15);
		heap.insert(85, 85);
		//heap.insert(95, 95);
		heap.displayTree();
		
		heap.top();
		
		heap.displayTree();
		
	}

}
