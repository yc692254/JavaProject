package com.test.lab06;


/**
 * @author Jiyang Chen
 *
 * @param <E>
 */
public class MySinglyLinkedList2<E> implements MyListInterface<E>, MyQueueInterface<E>{
	
	protected Node<E> head;
	protected Node<E> tail;
	protected int size;
	
	/**
	 * 
	 */
	public MySinglyLinkedList2(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	} 

	/**
	* Adds the specified element to the end (tail) of this queue.
	*
	* @param	element		new element
	*/
	@Override
	public void enqueue(E element) {
		add(element);
		
	}

	/**
	* Returns the front element in this Queue and removes it from the queue
	*
	* @return	E			element at the top. null if Queue is empty
	*/
	@Override
	public E dequeue() {
		E element = deletelinkFirst(head);
		return element;
	}

	/**
	* Accesses the FRONT element in this Queue without taking it off of it. 
	*
	* @return	E			element at the top. null if Queue is empty
	*/
	@Override
	public E peek() {
		return getFront();
	}
	
	/**
	* Returns the number of elements in this Queue.
	*
	* @return	int			number of elements in a Queue
	*/
	@Override
	public int size() {
		return this.size; 
	}
	
	
	/**
	* Checks if the Queue is empty or not.
	*
	* @return	boolean		true if the queue is empty, false if the stack is non-empty
	*/
	@Override
	public boolean isEmpty() {
		return this.size == 0;
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

	@Override
	public void add(E element) {
		addlinkLast(element);
		
	}

	@Override
	public void add(int index, E element) {
		if (index == size) {
			addlinkLast(element);
		}else {
			addlinkBefore(element, index);
		}
	}
	
	@Override
	public void addFront(E element) {
		addlinkFirst(element);
	}

	@Override
	public E get(int index) {
		Node<E> node = getNode(index);
		return node==null?null:node.getPayload();
	}

	@Override
	public E getFront() {
		return this.head==null?null:this.head.getPayload();
	}

	@Override
	public E getTail() {
		return this.tail ==null?null:this.tail.getPayload();
	}

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
	 * @param head
	 * @return
	 */
	private E deletelinkFirst(Node<E> head) {
		E element    = head.getPayload();
		Node<E> next = head.getNext();
		this.head = next;
		if (next == null) {
			this.tail = null;
		}
		size--;
		return element;
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
