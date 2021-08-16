package com.test.lab04;

public class TestLinkedList<E> implements  MyListInterface<E>{
	
	protected Node<E> head;
	protected int size; 
	
	public TestLinkedList(){
		this.head = null;
		this.size = 0;
	}
	
	
	public void add(E element) {
		addlinkLast(element);
	}
	
	public void add(int index, E element) {
		if (index == size)
			addlinkLast(element);
		else
			addlinkBefore(element, index);
	}


	public void addFront(E element) {
		addlinkFirst(element);
		
	}


	public E get(int index) {
		Node<E> node = getNode(index);
		return node == null ? null : node.getPayload();
	}


	public E getFront() {
		Node<E> node = getFirstNode();
		return node==null?null:node.getPayload();
	}


	public E getTail() {
		Node<E> node = getLastNode();
		return node==null?null:node.getPayload();
	}


	public int indexOf(E key) {
		Node<E> node = head;
		int index = 0;
		while (node!=null) {
			if(key.equals(node.getPayload())) {
				return index;
			}
			index++;
			node= node.getNext();
		}
		return -1;
	}


	public void remove(int index) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		if (size == 0) {
			throw new IllegalStateException("the list is empty");
		}
		Node<E> pred = getNode(index-1);
		Node<E> next = getNode(index+1);
		if(pred == null) {
			head = next;
		}else {
			pred.setNext(next);
		}
		size = size-1;
	}


	public void removeTail() {
		if (size == 0) {
			throw new IllegalStateException("the list is empty");
		}
		int lastIndex = size -1;
		Node<E> prev= getNode(lastIndex-1);
		if (prev == null) {
			head = null;
		} else {
			prev.setNext(null);
		}
		size = size-1;
		
	}


	public int size() {
		return size;
	}


	public void listAll() {
		if(size ==0) {
			System.out.println("This list is empty");
			return;
		}
		int index = 0;
		Node<E> node = head;
		while (node!=null) {
			System.out.println("Element at Node " + index +": "+node.getPayload());
			node= node.getNext();
			index++;
		}
		
	}
	
	private void addlinkFirst(E element) {
        Node<E> first = head;
        Node<E> newNode = new Node<E>(element, first);
        head  = newNode;
        first = newNode;
        size = size + 1;
    }
	
	private void addlinkBefore(E element, int index) {
		Node<E> pred    = getNode(index-1);
		Node<E> curr    = getNode(index);
		Node<E> newNode = new Node<E>(element, curr);
		if (pred == null) {
			head = newNode;
		}else {
			pred.setNext(newNode);
		} 
		size = size + 1;
	}
	
	private void addlinkLast(E element) {
		Node<E> newNode = new Node<E>(element, null);
		if(head == null) {
			head = newNode;
		}else {
			Node<E> tail = getLastNode();
			tail.setNext(newNode);
			tail = newNode;
		}
		size = size + 1;
    }
	
	public Node<E> getNode(int i){
		Node<E> node = head;
		int index = 0;
		while (node!=null) {
			if(index ==i) {
				return node;
			}
			index++;
			node= node.getNext();
			
		}
		return node;
	}
	
	public Node<E> getFirstNode(){
		Node<E> node = head;
		return node;
	}
	
	public Node<E> getLastNode(){
		Node<E> node = head;
		while (node!=null && node.getNext()!=null) {
			node= node.getNext();
		}
		return node;
	}


}
