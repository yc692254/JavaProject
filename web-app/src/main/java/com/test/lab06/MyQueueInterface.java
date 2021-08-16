package com.test.lab06;

/**
* 
* A generics Queue interface
* 
* @author	Jacek Dzikowski
* @version	1.00.00
*/
 
public interface MyQueueInterface<E> {
	
	/**
	* Adds the specified element to the end (tail) of this queue.
	*
	* @param	element		new element
	*/
	public void enqueue(E element);
	
	/**
	* Returns the front element in this Queue and removes it from the queue
	*
	* @return	E			element at the top. null if Queue is empty
	*/
	public E dequeue();
	
	/**
	* Accesses the FRONT element in this Queue without taking it off of it. 
	*
	* @return	E			element at the top. null if Queue is empty
	*/
	public E peek();

	/**
	* Returns the number of elements in this Queue.
	*
	* @return	int			number of elements in a Queue
	*/
	public int size();
	
	/**
	* Checks if the Queue is empty or not.
	*
	* @return	boolean		true if the queue is empty, false if the stack is non-empty
	*/
	public boolean isEmpty();
	
	/**
	* Lists/displays all elements in this List.
	*
	*/
	public void listAll();
}