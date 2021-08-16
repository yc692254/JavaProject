package com.test.lab07;

public class MyBSTreeTest{
	public static void main(String [] args){
		MyBSTree<Integer,Integer> myTree = new MyBSTree<Integer,Integer>();
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
		
		System.out.println();
		System.out.println("Tree with Double keys (Point3D object distances to origin)");
		MyBSTree<Double,Point3D> myTree2 = new MyBSTree<Double,Point3D>();
		Point3D origin = new Point3D(0.0, 0.0, 0.0);
		Point3D b = new Point3D(0.0, -1.0, 0.0);
		Point3D c = new Point3D(0.0, 2.0, 0.0);
		Point3D d = new Point3D(0.0, 0.0, 0.5);
		Point3D e = new Point3D(5.0, 0.0, 0.0);
		Point3D f = new Point3D(25.0, 0.0, 0.0);
		Point3D g = new Point3D(0.0, -0.1, 0.0);
		myTree2.insert(b.distanceTo(origin),b);
		myTree2.insert(c.distanceTo(origin),c);
		myTree2.insert(d.distanceTo(origin),d);
		myTree2.insert(e.distanceTo(origin),e);
		myTree2.insert(f.distanceTo(origin),f);
		myTree2.insert(g.distanceTo(origin),g);
		System.out.println("IN-ORDER Traversal");
		myTree2.inOrder();
		System.out.println("PRE-ORDER Traversal");
		myTree2.preOrder();
		System.out.println("POST-ORDER Traversal");
		myTree2.postOrder();
		
	}
}