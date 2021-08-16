package com.test.lab10;

/**
 * @author Jiyang Chen
 *
 * @param <K>
 * @param <T>
 */
public class MyVertex<K extends Comparable<K>,T> implements Comparable<MyVertex<K, T>>{
	
	private K label;
	private T payload;
	private MySinglyLinkedList<K> adjacencyList;
	private Integer degree;
	
	
	
	public MyVertex(K label, T payload) {
		this.label = label;
		this.payload = payload;
		this.adjacencyList = new MySinglyLinkedList<K>();
		this.degree = 0;
	}
	/**
	 * @return the label
	 */
	public K getLabel() {
		return this.label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(K label) {
		this.label = label;
	}
	/**
	 * @return the payload
	 */
	public T getPayload() {
		return this.payload;
	}
	/**
	 * @param payload the payload to set
	 */
	public void setPayload(T payload) {
		this.payload = payload;
	}
	/**
	 * @return the degree
	 */
	public Integer getDegree() {
		this.degree = this.adjacencyList.size();
		return degree;
	}
	
	public MySinglyLinkedList<K>  getAdjacencyList(){
		return this.adjacencyList;
	}
	
	public boolean addEdge(K otherLabel){
		// your code here 
		// adding an edge means “adding a vertex” with otherLabel to the adjacencyList
		// returns true if success | false if failure
		// otherLabel cannot be null
		// otherLabel cannot be the same as label
		// no duplicates in adjacency list allowed
		if(otherLabel==null) {
			return false;
		}
		Node<K> node = adjacencyList.getHeaderNode();
		while (node!=null) {
			if(otherLabel.equals(node.getPayload())) {
				return false;
			}
			node= node.getNext();
		}
		this.adjacencyList.add(otherLabel);
		return true;
		
	}
	
	@Override
	public String toString() {
		if(this.adjacencyList.size()==0) {
			return "[Vertex: "+label+" | adjacent vertices: none]";
		}
		StringBuilder sb = new StringBuilder("");
		Node<K> node = this.adjacencyList.getHeaderNode();
		while (node!=null) {
			sb.append(node.getPayload());
			sb.append("->");
			node= node.getNext();
			
		}
		String result = sb.length() >= 2?sb.substring(0, sb.length()-2).toString():sb.toString();
		return "[Vertex: " + label + " | adjacent vertices: "+result+"]";
	}
	@Override
	public int compareTo(MyVertex<K, T> o) {
		return this.label.compareTo(o.getLabel());
	}
}
