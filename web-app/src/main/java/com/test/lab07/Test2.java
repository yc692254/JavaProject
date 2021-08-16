package com.test.lab07;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyBSTree<Integer,Integer> myTree = new MyBSTree<Integer,Integer>();
		System.out.println("Tree with Integer keys");
		// NOTE: Here keys and payloads are the same to keep it simple
		myTree.insert(25,25);
		myTree.insert(15,15);
		myTree.insert(50,50);
		
		myTree.insert(10,10);
		myTree.insert(22,22);
		myTree.insert(4,4);
		myTree.insert(12,12);
		myTree.insert(18,18);
		myTree.insert(24,24);
		
		myTree.insert(35,35);
		myTree.insert(31,31);
		myTree.insert(44,44);
		
		myTree.insert(70,70);
		myTree.insert(66,66);
		myTree.insert(90,90);
		myTree.displayTree();
		//System.out.println(myTree.toString());
		myTree.inOrder();
		myTree.preOrder();
		myTree.postOrder();
		myTree.levelOrder();

	}

}
