package com.test.lab04;

public class Test3 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MySinglyLinkedList<Point3D> list=new MySinglyLinkedList<Point3D>();
		Point3D point3d1=new Point3D(0.0, 0.0, 0.0);
		Point3D point3d2=new Point3D(0.0, 1.0, 0.0);
		Point3D point3d3=new Point3D(0.0, 1.0, 1.0);
		Point3D point3d4=new Point3D(0.0, 1.0, 2.0);
		Point3D point3d5=new Point3D(0.0, 1.0, 3.0);
		Point3D point3d6=new Point3D(0.0, 1.0, 3.0);
		
		
		list.add(point3d1);	
		list.add(point3d2);
		list.add(point3d3);
		list.add(point3d4);
		list.add(point3d5);
		//list.listAll();
		System.out.println(point3d5.equals(point3d6));
		
		Point3D point=new Point3D();
		System.out.println(point.getX());
		System.out.println(point.getY());
		System.out.println(point.getZ());
		
		

	}
	
}
