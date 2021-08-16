package com.test.lab09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.test.lab08.MyBSTreeNode;

/**
 * @author Jiyang Chen
 *
 * @param <K>
 * @param <T>
 */
public class MyMaxHeap<K extends Comparable<K>, T> {
	
	protected MyBSTreeNode<K, T> root;
	
	public MyMaxHeap() {
		this.root = null;
	}

	/**
	 * @param newKey
	 * @param newPayload
	 */
	public void insert(K newKey, T newPayload) {
		MyBSTreeNode<K, T> newMyBSTreeNode =new MyBSTreeNode<K,T>(newKey, newPayload);
		if(this.root == null) {
			this.root = newMyBSTreeNode;
		}else {
			Queue<MyBSTreeNode<K, T>> queue=new LinkedList<MyBSTreeNode<K,T>>();
			queue.offer(root);
			MyBSTreeNode<K, T> currentNode =null;
			while (!queue.isEmpty()) {
				currentNode = queue.poll();
				if(currentNode.getLeft()!=null) {
					queue.offer(currentNode.getLeft());
				}else {
					currentNode.setLeft(newMyBSTreeNode);
					newMyBSTreeNode.setParent(currentNode);
					break;
				}
				if(currentNode.getRight()!=null) {
					queue.offer(currentNode.getRight());
				}else {
					currentNode.setRight(newMyBSTreeNode);
					newMyBSTreeNode.setParent(currentNode);
					break;
				}
			}
			//swapUpNode
			swapUpHeap(newMyBSTreeNode);
			
			
		}
	}
	
	/**
	 * @param lastNode
	 */
	public void swapUpHeap(MyBSTreeNode<K, T> lastNode) {
		MyBSTreeNode<K, T> tempNode = lastNode;
		while (tempNode!=this.root) {
			int differ = tempNode.compareTo(tempNode.getParent());
			if(differ > 0) {
				K tempKey = tempNode.getKey();
				T tempPayload = tempNode.getPayload();
				
				tempNode.setKey(tempNode.getParent().getKey());
				tempNode.setPayload(tempNode.getParent().getPayload());
				
				tempNode.getParent().setKey(tempKey);
				tempNode.getParent().setPayload(tempPayload);
				
				tempNode = tempNode.getParent();
			}else {
				break;
			}
			
		}
	}
	
		
	/**
	 * @param node
	 * @return
	 */
	public int getHeight(MyBSTreeNode<K, T> node) {
		if (node == null) return 0;
		if (node.getLeft() == null && node.getRight() == null) return 1;
		return 1 + Math.max(this.getHeight(node.getLeft()), this.getHeight(node.getRight()));
	}
	

	/**
	 * @return
	 */
	public MyBSTreeNode<K, T> top() {
		MyBSTreeNode<K, T> result = null;
		if(this.root==null) {
			result= null;
		}else {
			result= new MyBSTreeNode<K, T>(root.getKey(), root.getPayload());
			MyBSTreeNode<K, T> lastNode    = findLastNode(this.root);
			MyBSTreeNode<K, T> parentNode  = lastNode.getParent();
			K lastKey        = lastNode.getKey();
			T lastPayload    = lastNode.getPayload();
			if(parentNode.getLeft() == lastNode) {
				parentNode.setLeft(null);
			}else {
				parentNode.setRight(null);
			}
			root.setKey(lastKey);
			root.setPayload(lastPayload);
			//swapDownNode
			swapDownHeap(this.root);
		}
		return result;
	}
	
	
	/**
	 * @param topNode
	 */
	public void swapDownHeap(MyBSTreeNode<K, T> topNode) {
		MyBSTreeNode<K, T> tempNode = topNode;
		MyBSTreeNode<K, T> left = tempNode.getLeft();
		MyBSTreeNode<K, T> right = tempNode.getRight();
		if (left != null && right != null) {
			if (left.compareTo(right) > 0) {
				if (left.compareTo(tempNode) > 0) {
					K tempKey = tempNode.getKey();
					T tempPayload = tempNode.getPayload();
					tempNode.setKey(left.getKey());
					tempNode.setPayload(left.getPayload());
					left.setKey(tempKey);
					left.setPayload(tempPayload);
					swapDownHeap(left);
				} else {
					return;
				}

			} else {
				if (right.compareTo(tempNode) > 0) {
					K tempKey = tempNode.getKey();
					T tempPayload = tempNode.getPayload();
					tempNode.setKey(right.getKey());
					tempNode.setPayload(right.getPayload());
					right.setKey(tempKey);
					right.setPayload(tempPayload);
					swapDownHeap(right);
				} else {
					return;
				}

			}
		} else if (left != null && right == null) {
			if (left.compareTo(tempNode) > 0) {
				K tempKey = tempNode.getKey();
				T tempPayload = tempNode.getPayload();
				tempNode.setKey(left.getKey());
				tempNode.setPayload(left.getPayload());
				left.setKey(tempKey);
				left.setPayload(tempPayload);
				swapDownHeap(left);
			} else {
				return;
			}

		} else {
			return;
		}
	}
	
	public MyBSTreeNode<K, T> findLastNode(MyBSTreeNode<K, T> topNode) {
		Queue<MyBSTreeNode<K, T>> queue=new LinkedList<MyBSTreeNode<K,T>>();
		queue.offer(topNode);
		MyBSTreeNode<K, T> currentNode =null;
		while (!queue.isEmpty()) {
			currentNode = queue.poll();
			if(currentNode.getLeft()!=null) {
				queue.offer(currentNode.getLeft());
			}
			if(currentNode.getRight()!=null) {
				queue.offer(currentNode.getRight());
			}
		}
		return currentNode;
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
		return "MyMaxHeap [root=" + root + "]";
	}
}
