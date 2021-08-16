package com.test.lab08;

public class MyBSTreeTest2 {

	public static void main(String[] args) {
		MyBSTree2<Integer,Integer> myTree = new MyBSTree2<Integer,Integer>();
		System.out.println("Tree with Integer keys");
		// NOTE: Here keys and payloads are the same to keep it simple
		myTree.insert(2,2);
		myTree.insert(3,3);
		myTree.insert(1,1);
		myTree.insert(-10,-10);
		myTree.insert(4,4);
		myTree.insert(0,0);
		myTree.insert(9,9);
		System.out.println("IN-ORDER Traversal");
		myTree.inOrder();
		System.out.println("PRE-ORDER Traversal");
		myTree.preOrder();
		System.out.println("POST-ORDER Traversal");
		myTree.postOrder();
		
	    System.out.println("MIN Key: = " + myTree.getMinKeyNode().getKey());
		
		System.out.println("MAX Key: = " + myTree.getMaxKeyNode().getKey());
		
		System.out.println("Result of searching for a node with key " + 2 + " : " + myTree.findNodeWithKey(2));
		System.out.println("Result of searching for a node with key " + 200 + " : " + myTree.findNodeWithKey(200));
		System.out.println("Result of searching for a node with key " + 9 + " : " + myTree.findNodeWithKey(9));
		System.out.println();
		

		System.out.println("Deleting node with key 2.");
		myTree.delete(2);
		System.out.println("IN-ORDER Traversal");
		myTree.inOrder();
		System.out.println("PRE-ORDER Traversal");
		myTree.preOrder();
		System.out.println("POST-ORDER Traversal");
		myTree.postOrder();
		
		System.out.println();
		System.out.println("Deleting node with key 200.");
		myTree.delete(200);
		System.out.println("IN-ORDER Traversal");
		myTree.inOrder();
		System.out.println("PRE-ORDER Traversal");
		myTree.preOrder();
		System.out.println("POST-ORDER Traversal");
		myTree.postOrder();
	
		System.out.println();	
		System.out.println("Deleting node with key 4.");
		myTree.delete(4);
		System.out.println("IN-ORDER Traversal");
		myTree.inOrder();
		System.out.println("PRE-ORDER Traversal");
		myTree.preOrder();
		System.out.println("POST-ORDER Traversal");
		myTree.postOrder();
	

		System.out.println();
		System.out.println("Deleting node with key 3.");	
		myTree.delete(3);
		System.out.println("IN-ORDER Traversal");
		myTree.inOrder();
		System.out.println("PRE-ORDER Traversal");
		myTree.preOrder();
		System.out.println("POST-ORDER Traversal");
		myTree.postOrder();
		
		System.out.println();
		System.out.println("Deleting node with key 0.");
		myTree.delete(0);
		System.out.println("IN-ORDER Traversal");
		System.out.println("PRE-ORDER Traversal");
		myTree.preOrder();
		System.out.println("POST-ORDER Traversal");
		myTree.postOrder();
		myTree.inOrder();

	}

}
