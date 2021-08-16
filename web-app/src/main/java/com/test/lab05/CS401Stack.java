package com.test.lab05;


/**
 * @author Jiyang Chen
 *
 * @param <E>
 */
public class CS401Stack<E> implements MyStackInterface<E>{
	private MySinglyLinkedList<E> myList;
	
	public CS401Stack(){
		this.myList =  new MySinglyLinkedList<E>();
	}   
	// Your code goes here

	public void listAll(){   	// this is not part of Stack interface, but it will help you debug your code	      
		myList.listAll();
	}
	public void push(E element) {
		myList.addFront(element);
		
	}
	public E pop() {
		E obj = peek();
		myList.remove(0);;
		return obj;
	}
	public E peek() {
		return myList.getFront();
	}
	public int size() {
		return myList.size();
	}
	public boolean isEmpty() {
		return size() == 0;
	}
}