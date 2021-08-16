package com.test.lab07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Jiyang Chen
 *
 * @param <K>
 * @param <T>
 */
public class MyBSTree<K extends Comparable<K>,T>{
	
	protected MyBSTreeNode<K,T> root;
	
	public MyBSTree(){
		this.root = null;
	}
	
	// Other methods go here

	/**
	 * @param newKey
	 * @param newPayload
	 */
	public void insert(K newKey, T newPayload){
		if(newKey==null) {
			return;
		}
		MyBSTreeNode<K, T> newMyBSTreeNode =new MyBSTreeNode<K,T>(newKey, newPayload);
		if(this.root == null) {
			this.root = newMyBSTreeNode;
		}else {
			MyBSTreeNode<K, T> currentNode = root;
			while (true) {
				if (newMyBSTreeNode.compareTo(currentNode) < 0) {
					if (currentNode.getLeft() == null) {
						currentNode.setLeft(newMyBSTreeNode);
						newMyBSTreeNode.setParent(currentNode);
						break;
					} else {
						currentNode = currentNode.getLeft();
					}
				} else {
					if (currentNode.getRight() == null) {
						currentNode.setRight(newMyBSTreeNode);
						newMyBSTreeNode.setParent(currentNode);
						break;
					} else {
						currentNode = currentNode.getRight();
					}
				}
			}
		}	
	}
	
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	
	public void preOrder() {
		preOrder(root);
		System.out.println();
	
	}
	
	public void postOrder() {
		postOrder(root);
		System.out.println();
	}
	
	public void levelOrder() {
		if(root==null) {
			return;
		}
		Queue<MyBSTreeNode<K, T>> queue=new LinkedList<MyBSTreeNode<K,T>>();
		queue.offer(root);
		MyBSTreeNode<K, T> currentNode =null;
		while (!queue.isEmpty()) {
			currentNode = queue.poll();
			System.out.print(currentNode.getKey()+" ");
			if(currentNode.getLeft()!=null) {
				queue.offer(currentNode.getLeft());
			}
			if(currentNode.getRight()!=null) {
				queue.offer(currentNode.getRight());
			}
		}
		System.out.println();
	}
	
	/**
	 * @param myBSTreeNode
	 */
	protected void inOrder(MyBSTreeNode<K, T> myBSTreeNode) {
		if(myBSTreeNode==null) {
			return;
		}
		inOrder(myBSTreeNode.getLeft());
		System.out.print(myBSTreeNode.getKey()+" ");
		inOrder(myBSTreeNode.getRight());
	}
	
	/**
	 * @param myBSTreeNode
	 */
	protected void preOrder(MyBSTreeNode<K, T> myBSTreeNode) {
		if(myBSTreeNode==null) {
			return;
		}
		System.out.print(myBSTreeNode.getKey()+" ");
		preOrder(myBSTreeNode.getLeft());
		preOrder(myBSTreeNode.getRight());
	}
	
	/**
	 * @param myBSTreeNode
	 */
	protected void postOrder(MyBSTreeNode<K, T> myBSTreeNode) {
		if(myBSTreeNode==null) {
			return;
		}
		postOrder(myBSTreeNode.getLeft());
		postOrder(myBSTreeNode.getRight());
		System.out.print(myBSTreeNode.getKey()+" ");
	}
	
	
	public void displayTree() {
		Stack<MyBSTreeNode<K, T>> globalStack = new Stack<MyBSTreeNode<K, T>>();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("...........................................................................................");
		while (isRowEmpty == false) {
			Stack<MyBSTreeNode<K, T>> localStack = new Stack<MyBSTreeNode<K, T>>();
			isRowEmpty = true;
			for (int j = 0; j < nBlanks; j++)
				System.out.print(' ');
			while (globalStack.isEmpty() == false) {
				MyBSTreeNode<K, T> temp = (MyBSTreeNode<K, T>) globalStack.pop();
				if (temp != null) {
					System.out.print(temp.getKey());
					localStack.push(temp.getLeft());
					localStack.push(temp.getRight());
					if (temp.getLeft() != null || temp.getRight() != null) {
						isRowEmpty = false;
					}
				} else {
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for (int j = 0; j < nBlanks * 2 - 2; j++) {
					System.out.print(' ');
				}
			}
			System.out.println();
			nBlanks /= 2;
			while (localStack.isEmpty() == false) {
				globalStack.push(localStack.pop());
			}
		}
		System.out.println("...........................................................................................");
	}

	@Override
	public String toString() {
		return "MyBSTree [root=" + root + "]";
	}
	
	

}