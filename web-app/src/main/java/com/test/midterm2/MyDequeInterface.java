package com.test.midterm2;

public interface MyDequeInterface<E> {
	
	/**
	 * @param element
	 */
	public void injectAtFront(E element);
	
	/**
	 * @param element
	 */
	public void ejectFromFront(E element);
	
	/**
	 * @param element
	 */
	public void injectAtTail(E element);
	
	/**
	 * @param element
	 */
	public void ejectFromTail(E element);
	
	
	/**
	 * @return
	 */
	public E peekFront();
	

	/**
	 * @return
	 */
	public E peekTail();

}
