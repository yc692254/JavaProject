package com.test.lab04;

/**
 * Calculate the total distance for Point3D list
 * @author Jiyang Chen
 *
 */
public class DistanceCalculator {
	
	/**
	 * @param mySinglyLinkedList
	 */
	public static void distance(MySinglyLinkedList<Point3D> mySinglyLinkedList) {
		
		if(mySinglyLinkedList.size() ==0) {
			System.out.println("This list is empty");
			return;
		}
		System.out.println("Let's display all points...");
		double sum=0.0;
		int index = 0;
		Node<Point3D> node = mySinglyLinkedList.getHeaderNode();;
		while (node!=null) {
			Point3D currentPoint = node.getPayload();
			System.out.println("Element at Node " + index + ": " + currentPoint.toString());
			index++;
			node = node.getNext();
			if (node != null) {
				double ditance = currentPoint.distanceTo(node.getPayload());
				sum += ditance;
			}
		}
		
		System.out.println("Now, let's calculate total distance between them...");
		System.out.println("Total distance: "+sum);
		
	}
	
	public static void main(String[] args) {
		Point3D point3d1=new Point3D(0.0, 0.0, 0.0);
		Point3D point3d2=new Point3D(0.0, 1.0, 0.0);
		Point3D point3d3=new Point3D(0.0, 1.0, 1.0);
		Point3D point3d4=new Point3D(0.0, 1.0, 2.0);
		Point3D point3d5=new Point3D(0.0, 1.0, 3.0);
		Point3D point3d6=new Point3D(0.0, 1.0, 4.0);
		MySinglyLinkedList<Point3D> list=new MySinglyLinkedList<Point3D>();
		list.add(point3d1);	
		list.add(point3d2);
		list.add(point3d3);
		list.add(point3d4);
		list.add(point3d5);
		DistanceCalculator.distance(list);
		list.add(point3d6);
		DistanceCalculator.distance(list);
	}

}
