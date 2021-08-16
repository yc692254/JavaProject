package com.test.lab09;

/**
 * @author Jiyang Chen
 *
 * @param <K>
 * @param <T>
 */
public class MyBSTreeNode<K extends Comparable<K>,T> implements MyBSTreeNodeInterface<K,T>,Comparable<MyBSTreeNode<K, T>> {
	
	private K key;
	private T payload;
	private MyBSTreeNode<K, T> parent;
	private MyBSTreeNode<K, T> left;
	private MyBSTreeNode<K, T> right;
	
	/**
	 * @param key
	 * @param payload
	 */
	public MyBSTreeNode(K key,T payload) {
		this.key     = key;
		this.payload = payload;
		this.parent  = null;
		this.left    = null;
		this.right   = null;
	}
	

	@Override
	public void setLeft(MyBSTreeNode<K, T> leftNode) {
		this.left = leftNode;
	}

	@Override
	public void setRight(MyBSTreeNode<K, T> rightNode) {
		this.right = rightNode;
	}

	@Override
	public void setParent(MyBSTreeNode<K, T> parentNode) {
		this.parent = parentNode;
	}

	@Override
	public void setKey(K newKey) {
		this.key = newKey;
	}

	@Override
	public void setPayload(T newPayload) {
		this.payload = newPayload;
	}

	@Override
	public MyBSTreeNode<K, T> getLeft() {
		return this.left;
	}

	@Override
	public MyBSTreeNode<K, T> getRight() {
		return this.right;
	}

	@Override
	public MyBSTreeNode<K, T> getParent() {
		return this.parent;
	}

	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public T getPayload() {
		return this.payload;
	}
	
	
	@Override
	public boolean isLeftChild() {
		if (this.parent == null) return false;
		return (this.parent.left == this);
	}


	@Override
	public int compareTo(MyBSTreeNode<K, T> o) {
		return this.key.compareTo(o.key);
	}
	
	@Override
	public String toString() {
		return "MyBSTreeNode [Key:" + key + "|Payload:" + payload + "]";
	}
}