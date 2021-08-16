package com.test.lab07;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D point3d5=new Point3D(0.0, 1.0, 3.0);
		Point3D point3d6=new Point3D(0.0, 1.0, 4.0);
		double s=point3d5.distanceTo(point3d6);
		double s2=point3d6.distanceTo(point3d5);
		
		System.out.println(s);
		System.out.println(s2);
		
		double a = Math.sqrt(Math.pow(0.0,2.0) + Math.pow(1.0, 2.0) + Math.pow(3.0, 2.0));
		double b = Math.sqrt(Math.pow(0.0, 2.0) + Math.pow(1.0, 2.0) + Math.pow(4.0, 2.0));
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(point3d5.distanceTo(new Point3D(0.0, 0.0, 0.0)));
		System.out.println(point3d6.distanceTo(new Point3D(0.0, 0.0, 0.0)));
		
		

	}

}
