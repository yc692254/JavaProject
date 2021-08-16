package com.test.lab05;

/**
* 
* A generics Stack interface
* 
* @author	Jacek Dzikowski
* @version	1.00.00
*/
 
public interface MyStackInterface<E> {
	
	/**
	* Adds the specified element to the top of this Stack.
	*
	* @param	element		new element
	*/
	public void push(E element);
	
	/**
	* Returns the top element in this Stack and takes it off the Stack. 
	*
	* @return	E			element at the top. null if Stack is empty
	*/
	public E pop();
	
	/**
	* Acesses the TOP element in this Stack without taking it off of it. 
	*
	* @return	E			element at the top. null if Stack is empty
	*/
	public E peek();

	/**
	* Returns the number of elements in this Stack.
	*
	* @return	int			number of elements in a Stack
	*/
	public int size();
	
	/**
	* Checks if the Stack is empty or not.
	*
	* @return	boolean		true if the stack is empty, false if the stack is non-empty
	*/
	public boolean isEmpty();
}