package com.test.lab09;

public class Node {
	private int iData; // data item (key)

	public Node(int key){ 
		iData = key; 
	}

	// -------------------------------------------------------------
	public int getKey() {
		return iData;
	}

	// -------------------------------------------------------------
	public void setKey(int id) {
		iData = id;
	}
	// -------------------------------------------------------------

}
