package com.test.lab08;

/**
 * @author Jiyang Chen
 *
 * @param <K>
 * @param <T>
 */
public interface MyBSTreeNodeInterface<K extends Comparable<K>,T> {
	/**
	 * @param leftNode
	 */
	public abstract void setLeft(MyBSTreeNode<K,T> leftNode);
	/**
	 * @param rightNode
	 */
	public abstract void setRight(MyBSTreeNode<K,T> rightNode);
	/**
	 * @param parentNode
	 */
	public abstract void setParent(MyBSTreeNode<K,T> parentNode);
	/**
	 * @param newKey
	 */
	public abstract void setKey(K newKey);
	/**
	 * @param newPayload
	 */
	public abstract void setPayload(T newPayload);
	/**
	 * @return
	 */
	public abstract MyBSTreeNode<K,T> getLeft();
	/**
	 * @return
	 */
	public abstract MyBSTreeNode<K,T> getRight();
	/**
	 * @return
	 */
	public abstract MyBSTreeNode<K,T> getParent();	
	/**
	 * @return
	 */
	public abstract K getKey();
	/**
	 * @return
	 */
	public abstract T getPayload();	
	
	/**
	 * @return
	 */
	public abstract boolean isLeftChild();
}