package com.test.lab06;

import com.test.lab05.Node;

/**
 * @author Jiyang Chen
 *
 * @param <E>
 */
public class MySinglyLinkedList<E> implements MyListInterface<E>{
	
	protected Node<E> head;
	protected Node<E> tail;
	protected int size;
	
	/**
	 * 
	 */
	public MySinglyLinkedList(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	} 

	/**
	* Appends the specified element to the end (tail) of this List.
	*
	* @param	element		new element
	*/
	@Override
	public void add(E element) {
		addlinkLast(element);
	}

	/**
	* Inserts the specified element at the specified position index in this List.
	*
	* @param	index		new element index
	* @param	element		new element
	*/
	@Override
	public void add(int index, E element) {
		if (index == size) {
			addlinkLast(element);
		}else {
			addlinkBefore(element, index);
		}
	}

	/**
	* Appends the specified element to the front of this List.
	*
	* @param	element		new element
	*/
	@Override
	public void addFront(E element) {
		addlinkFirst(element);
	}

	/**
	* Returns the element at the specified position (index) in this List. 
	*
	* @param	index		index of the element to be returned
	* @return	E			element at position index. null if index >= size
	*/
	@Override
	public E get(int index) {
		Node<E> node = getNode(index);
		return node==null?null:node.getPayload();
	}

	/**
	* Returns the first element in this List. 
	*
	* @return	E			element at position index. null if List is empty
	*/
	@Override
	public E getFront() {
		return this.head==null?null:this.head.getPayload();
	}

	/**
	* Returns the last element in this List. 
	*
	* @return	E			element at position index. null if List is empty
	*/
	@Override
	public E getTail() {
		if (this.tail != null){
			return this.tail.getPayload();
		} else {
			return null;
		}
	}

	/**
	* Returns the index in this List of the first occurrence of the specified key, or -1 if List does not contain this key.
	*
	* @param	key			specified key to be found in List
	* @return	int			index of the specified key in List or -1 if not found
	*/
	@Override
	public int indexOf(E key) {
		int index = 0;
		for (Node<E> node= this.head; node!=null; node=node.getNext()) {
			if(key.equals(node.getPayload())) {
				return index;
			}
			index++;
		}
		return -1;
	}

	/**
	* Removes the element at the specified position in this List.
	*
	* @param	index		index of the element to be removed
	*/
	@Override
	public void remove(int index) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		if (size == 0) {
			throw new IllegalStateException("the list is empty");
		}
		Node<E> prevNode = getNode(index-1);
		Node<E> currNode = getNode(index);
		Node<E> nextNode = currNode.getNext();
		if(index == size) {
			if(prevNode==null) {
				this.head = nextNode;
			}else {
				prevNode.setNext(nextNode);
			}
			this.tail = prevNode;
		}else {
			if(prevNode==null) {
				this.head = nextNode;
				this.tail = prevNode;
			}else {
				prevNode.setNext(nextNode);
			}
		}
		size--;
		
	}

	/**
	* Removes the last element of the List. 
	*
	*/
	@Override
	public void removeTail() {
		if (size == 0) {
			throw new IllegalStateException("the list is empty");
		}
		int lastIndex = size -1;
		Node<E> prevNode = getNode(lastIndex-1);
		if(prevNode==null) {
			this.head = prevNode;
		}else {
			prevNode.setNext(null);
		}
		this.tail = prevNode;
		size--;
		
	}

	/**
	* Returns the number of elements in this List.
	*
	* @return	int			number of elements in List
	*/
	@Override
	public int size() {
		return this.size;
	}

	/**
	* Lists/displays all elements in this List.
	*
	*/
	@Override
	public void listAll() {
		if(size ==0) {
			System.out.println("This list is empty");
			return;
		}
		int index = 0;
		Node<E> node = this.head;
		while (node!=null) {
			System.out.println("Element at Node " + index +": "+node.getPayload());
			node= node.getNext();
			index++;
			
		}
		
	}
	
	/**
	 * @param element
	 */
	private void addlinkFirst(E element) {
		Node<E> currNode = this.head;
		Node<E> newNode = new Node<E>(element, currNode);
		if(currNode==null) {
			this.tail = newNode;
		}
		this.head  = newNode;
		size  = size + 1;
	}
	
	/**
	 * @param element
	 * @param index
	 */
	private void addlinkBefore(E element, int index) {
		Node<E> prev = getNode(index - 1);
		Node<E> curr = getNode(index);
		Node<E> newNode = new Node<E>(element, curr);
		if (prev == null) {
			this.head = newNode;
		}else {
			prev.setNext(newNode);
		}
		size = size + 1;
	}
	
	/**
	 * @param element
	 */
	private void addlinkLast(E element) {
		Node<E> newNode = new Node<E>(element, null);
		if (this.head == null) {
			this.head = newNode;
		} else {
			Node<E> tail = getLastNode();
			tail.setNext(newNode);
		}
		this.tail = newNode;
		size = size + 1;
	}
	
	/**
	 * @param index
	 * @return
	 */
	private Node<E> getNode(int index){
		Node<E> node = this.head;
		int i = 0;
		while (node!=null) {
			if(i==index) {
				return node;
			}
			node = node.getNext();
			i++;
		}
		return node;
	}
	
	/**
	 * @return
	 */
	private Node<E> getLastNode(){
		Node<E> node = head;
		while (node!=null && node.getNext()!=null) {
			node= node.getNext();
		}
		return node;
	}

}
