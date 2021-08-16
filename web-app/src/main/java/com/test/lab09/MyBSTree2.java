package com.test.lab09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/**
 * @author Jiyang Chen
 *
 * @param <K>
 * @param <T>
 */
public class MyBSTree2<K extends Comparable<K>,T>{
	
	protected MyBSTreeNode<K,T> root;
	
	public MyBSTree2(){
		this.root = null;
	}
	
	// Other methods go here

	/**
	 * @param newKey
	 * @param newPayload
	 */
	public void insert(K newKey, T newPayload){
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
	 * @return
	 */
	public MyBSTreeNode<K, T> getMinKeyNode() {
		return this.getMinKeyNode(this.root);
		
	}
	
	/**
	 * @return
	 */
	public MyBSTreeNode<K, T> getMaxKeyNode(){
		return this.getMaxKeyNode(this.root);
		
	}
	
	/**
	 * @param treeRoot
	 * @return
	 */
	private MyBSTreeNode<K,T> getMinKeyNode(MyBSTreeNode<K,T> treeRoot) {
		if(treeRoot ==null) {
			return null;
		}
		while (treeRoot.getLeft()!=null) {
			treeRoot = treeRoot.getLeft();
		}
		return treeRoot;
	}
	
	/**
	 * @param treeRoot
	 * @return
	 */
	private MyBSTreeNode<K, T> getMaxKeyNode(MyBSTreeNode<K,T> treeRoot) {
		if(treeRoot ==null) {
			return null;
		}
		while (treeRoot.getRight()!=null) {
			treeRoot = treeRoot.getRight();
		}
		return treeRoot;
	}
	
	/**
	 * @param keyToFind
	 * @return
	 */
	public MyBSTreeNode<K, T> findNodeWithKey(K keyToFind){
		if(keyToFind==null) {
			return null;
		}
		MyBSTreeNode<K, T> currentNode = this.root;
		if(currentNode==null) {
			return null;
		}
		while (currentNode!=null) {
			int differ = keyToFind.compareTo(currentNode.getKey());
			if(differ == 0) {
				if(keyToFind.equals(currentNode.getKey())) {
					return currentNode;
				}else {
					return null;
				}
			}else if(differ < 0){
				currentNode = currentNode.getLeft();
			}else {
				currentNode = currentNode.getRight();
			}
		}
		return null;
		
	}
	
	/**
	 * @param keyToDelete
	 */
	public boolean delete(K keyToDelete) {
		if(keyToDelete==null) {
			return false;
		}
		MyBSTreeNode<K, T> currentNode = this.root;
		if(currentNode==null) {
			return false;
		}
		while (currentNode!=null ) {
			K currentKey = currentNode.getKey();
			int differ = keyToDelete.compareTo(currentKey);
			if(differ < 0) {
				currentNode = currentNode.getLeft();
			}else if(differ > 0){
				currentNode = currentNode.getRight();
			}else {
				if(keyToDelete.equals(currentKey)) {
					return removeNode(currentNode);
				}else {
					return false;
				}
			}
			
		}	
		return false;
		
	}
	
	/**
	 * @param node
	 */
	protected boolean removeNode(MyBSTreeNode<K, T> node) {
		boolean isRemoved = false;
		boolean isLeftChild = node.isLeftChild();
		if(node.getLeft()!=null && node.getRight()!=null) {
			MyBSTreeNode<K, T> minNode = this.getMinKeyNode(node.getRight());
			if(minNode!=node.getRight()) {
				
				minNode.getParent().setLeft(minNode.getRight());
				
				if (minNode.getRight() != null) {
					minNode.getRight().setParent(minNode.getParent());
				}
				minNode.setRight(node.getRight());
				
			}
			
			if (node.getRight() != null) {
				node.getRight().setParent(minNode);
			}
			if (node.getLeft() != null) {
				node.getLeft().setParent(minNode);
			}
			
			if (node == this.root) {
				this.root = minNode;
			} else if (isLeftChild) {
				node.getParent().setLeft(minNode);
			} else {
				node.getParent().setRight(minNode);
			}
			minNode.setLeft(node.getLeft());
			minNode.setParent(node.getParent());
			isRemoved = true;
		}else if(node.getLeft()!=null) {
			if (node == this.root) {
				this.root = node.getLeft();
			} else if (isLeftChild) {
				node.getParent().setLeft(node.getLeft());
			} else {
				node.getParent().setRight(node.getLeft());
			}
			if (node.getLeft() != null) {
				node.getLeft().setParent(node.getParent());
			}
			isRemoved = true;
		}else if(node.getRight()!=null) {
			if (node == this.root) {
				this.root = node.getRight();
			} else if (isLeftChild) {
				node.getParent().setLeft(node.getRight());
			} else {
				node.getParent().setRight(node.getRight());
			}
			if (node.getRight() != null) {
				node.getRight().setParent(node.getParent());
			}
			isRemoved = true;
		}else {
			if (node == this.root) {
				this.root = null;
			} else if (isLeftChild) {
				node.getParent().setLeft(null);
			} else {
				node.getParent().setRight(null);
			}
			isRemoved = true;
		}
		return isRemoved;
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