package com.test.lab10;

/**
 * @author Jiyang Chen
 *
 * @param <K>
 * @param <T>
 */
public class MyGraph<K extends Comparable<K>, T> {

	protected MySinglyLinkedList<MyVertex<K, T>> vertices;

	public MyGraph() {
		this.vertices = new MySinglyLinkedList<MyVertex<K, T>>();
	}

	// methods:
	/**
	 * @param newLabel
	 * @param newPayload
	 * @return
	 */
	public boolean addVertex(K newLabel, T newPayload) {
		// your code here
		// adding a vertex edge means adding a new vertex object to the vertices list
		// returns true if success | false if failure
	    // newLabel and newPayload cannot be null
		// no duplicates in vertices list allowed (duplicate -> same label
		if(newLabel==null || newPayload==null) {
			return false;
		}
		Node<MyVertex<K,T>> node = this.vertices.getHeaderNode();
		while (node!=null) {
			MyVertex<K,T>  MyVertex=node.getPayload();
			if(newLabel.equals(MyVertex.getLabel())) {
				return false;
			}
			node= node.getNext();
		}
		MyVertex<K, T> newVertex=new MyVertex<K, T>(newLabel, newPayload);
		this.vertices.add(newVertex);
		return true;
		
	}

	/**
	 * @param startPointLabel
	 * @param endPointLabel
	 * @return
	 */
	public boolean addEdge(K startPointLabel, K endPointLabel) {
		// your code here
		// adding an edge means updating adjacency lists for vertices with
		// startPointLabel and endPointLabel accordingly
		// returns true if success | false if failure
		// startPointLabel and endPointLabel cannot be null
		// startPointLabel and endPointLabel cannot be equal
		// if either startPointLabel or endPointLabel is NOT present in vertices, no
		// add!
		// no duplicate edges allowed
		if(startPointLabel==null || endPointLabel==null) {
			return false;
		}
		if(startPointLabel.equals(endPointLabel)) {
			return false;
		}
		MyVertex<K, T> startVertex = null;
		MyVertex<K, T> endVertex   = null;
		Node<MyVertex<K,T>> node = this.vertices.getHeaderNode();
		while (node!=null) {
			MyVertex<K,T>  MyVertex=node.getPayload();
			if(startPointLabel.equals(MyVertex.getLabel())) {
				startVertex = MyVertex;
			}
			if(endPointLabel.equals(MyVertex.getLabel())) {
				endVertex = MyVertex;
			}
			node= node.getNext();
		}
	    if(startVertex==null || endVertex==null) {
	    	return false;
	    }
	    boolean f1 = startVertex.addEdge(endPointLabel);
	    boolean f2 = endVertex.addEdge(startPointLabel);
		return f1 && f2;
	}

	@Override
	public String toString() {
		if(this.vertices.size()==0) {
			return "Empty graph";
		}
		StringBuilder sb = new StringBuilder("");
		Node<MyVertex<K,T>> node = this.vertices.getHeaderNode();
		while (node!=null) {
			MyVertex<K,T>  MyVertex=node.getPayload();
			sb.append(MyVertex.toString());
			sb.append("\n");
			node= node.getNext();
		}
		return sb.toString();
	}
}
