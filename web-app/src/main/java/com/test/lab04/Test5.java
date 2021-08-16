package com.test.lab04;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLinkedList<Integer> linkedList=new TestLinkedList<Integer>();
		//Node<Integer> node =linkedList.getLastNode();
		//System.out.println(node);
		linkedList.add(1);
		//Node<Integer> node2 =linkedList.getLastNode();
		//System.out.println(node2);
		linkedList.add(2);
		linkedList.add(3);
		//Node<Integer> node3 =linkedList.getLastNode();
		//System.out.println(node3);
		linkedList.add(4);
		linkedList.add(5);
		//Node<Integer> node4 =linkedList.getLastNode();
		//System.out.println(node4);
		
		linkedList.listAll();
		System.out.println("--------------------------------------------");
		linkedList.add(0, 6);
		linkedList.add(1, 7);
		linkedList.add(2, 8);
		linkedList.add(3, 9);
		linkedList.add(4, 10);
		
	
		linkedList.listAll();
		System.out.println("--------------------------------------------");
		linkedList.addFront(11);
		linkedList.addFront(12);
		linkedList.addFront(13);
		linkedList.addFront(14);
		linkedList.listAll();
		
		System.out.println(linkedList.indexOf(11));
		System.out.println(linkedList.getLastNode());
		System.out.println("--------------------------------------------");
		linkedList.remove(8);
		linkedList.listAll();

	}

}
