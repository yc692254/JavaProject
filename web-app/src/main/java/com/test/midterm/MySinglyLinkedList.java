package com.test.midterm;

/**
 * MyListInterface<E> implementation class
 * @author Jiyang Chen
 *
 * @param <E>
 */
public class MySinglyLinkedList<E> implements MyListInterface<E> {
	protected Node<E> head;
	protected int size;
	
	public MySinglyLinkedList(){
		this.head = null;
		this.size = 0;
	}

	// Your implementation goes here
	
	/**
	* Appends the specified element to the end (tail) of this List.
	*
	* @param	element		new element
	*/
	public void add(E element) {
		addlinkLast(element);
	}

	/**
	* Inserts the specified element at the specified position index in this List.
	*
	* @param	index		new element index
	* @param	element		new element
	*/
	public void add(int index, E element) {
		if (index == size)
			addlinkLast(element);
		else
			addlinkBefore(element, index);

	}

	/**
	* Appends the specified element to the front of this List.
	*
	* @param	element		new element
	*/
	public void addFront(E element) {
		addlinkFirst(element);
		
	}

	/**
	* Returns the element at the specified position (index) in this List. 
	*
	* @param	index		index of the element to be returned
	* @return	int			element at position index. null if index >= size
	*/
	public E get(int index) {
		Node<E> node = getNode(index);
		return node == null ? null : node.getPayload();
	}

	/**
	* Returns the first element in this List. 
	*
	* @param	index		index of the element to be returned
	* @return	int			element at position index. null if List is empty
	*/
	public E getFront() {
		Node<E> node = getHeaderNode();
		return node == null ? null : node.getPayload();
	}

	/**
	* Returns the last element in this List. 
	*
	* @param	index		index of the element to be returned
	* @return	int			element at position index. null if List is empty
	*/
	public E getTail() {
		Node<E> node = getLastNode();
		return node==null?null:node.getPayload();
	}

	/**
	* Returns the index in this List of the first occurrence of the specified key, or -1 if List does not contain this key.
	*
	* @param	key			specified key to be found in List
	* @return	int			index of the specified key in List or -1 if not found
	*/
	public int indexOf(E key) {
		int index = 0;
		for (Node<E> x = head; x != null; x = x.next) {
			if (key.equals(x.payload))
				return index;
			index++;
		}
		return -1;
	}

	/**
	* Removes the element at the specified position in this List.
	*
	* @param	index		index of the element to be removed
	*/
	public void remove(int index) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		if (size == 0) {
			throw new IllegalStateException("the list is empty");
		}
		Node<E> prev = getNode(index-1);
		Node<E> curr = getNode(index);
		Node<E> next = curr.getNext();
		if (prev == null) {
			head = next;
		} else {
			prev.setNext(next);
		}
		size--;
		
	}

	/**
	* Removes the last element of the List. 
	*
	*/
	public void removeTail() {
		if (size == 0) {
			throw new IllegalStateException("the list is empty");
		}
		int index = size -1;
		Node<E> prev = getNode(index -1);
		if (prev == null) {
			head = null;
		} else {
			prev.setNext(null);
		}
		size--;
	}

	/**
	* Returns the number of elements in this List.
	*
	* @return	int			number of elements in List
	*/
	public int size() {
		return size;
	}

	/**
	* Lists/displays all elements in this List.
	*
	*/
	public void listAll() {
		if(size ==0) {
			System.out.println("This list is empty");
			return;
		}
		int index = 0;
		Node<E> node = head;
		while (node!=null) {
			System.out.println("Element at Node " + index +": "+node.payload);
			index++;
			node= node.getNext();
			
		}
	}
	
	
	/**
	 * @param element
	 */
	private void addlinkFirst(E element) {
		Node<E> first = head;
		Node<E> newNode = new Node<E>(element, first);
		head  = newNode;
		first = newNode;
		size  = size + 1;
	}
	
	/**
	 * @param element
	 */
	private void addlinkLast(E element) {
		Node<E> newNode = new Node<E>(element, null);
		if (head == null) {
			head = newNode;
		} else {
			Node<E> tail = getLastNode();
			tail.setNext(newNode);
			tail = newNode;
		}
		size = size + 1;
	}
	
	/**
	 * @param element
	 * @param index
	 */
	private void addlinkBefore(E element, int index) {
		Node<E> pred = getNode(index - 1);
		Node<E> curr = getNode(index);
		Node<E> newNode = new Node<E>(element, curr);
		if (pred == null)
			head = newNode;
		else
			pred.setNext(newNode);
		size = size + 1;
	}
	

	/**
	 * @param i
	 * @return
	 */
	private Node<E> getNode(int i){
		Node<E> node = head;
		int index = 0;
		while (node!=null) {
			if(index == i) {
				return node;
			}
			index++;
			node= node.getNext();
		}
		return node;
	}
	
	/**
	 * @return
	 */
	public Node<E> getHeaderNode(){
		Node<E> node = head;
		return node;
	}
	
	/**
	 * @return
	 */
	public Node<E> getLastNode(){
		Node<E> node = head;
		while (node!=null && node.getNext()!=null) {
			node= node.getNext();
		}
		return node;
	}
	
	Node<E> newnode =null;

	public void reverse() {
		Node<E> result=reverseNode(head);
		//System.out.println(newnode);
		//reverseNode2(head);
		System.out.println(result);

		
	}
	
	
	
	public Node<E> reverseNode(Node<E> node) {
		if(node.next==null) {
			return node;
		}
		Node<E> result=reverseNode(node.next);
		System.out.println(node);
		Node<E> netxNode= node.next;
		netxNode.next = node;
		node.next = null;
		return result;
	}
	
	public void reverseNode2(Node<E> node) {
		if(node.next==null) {
			System.out.println("F3:"+node);
			newnode = node;
			return;
		}
		
		System.out.println("F1:"+node);
		reverseNode2(node.next);
		System.out.println("F2:"+node.next);
	}
	
	
}