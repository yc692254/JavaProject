package com.test.lab04;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0.0;
		Point3D point3d1=new Point3D();
		Point3D point3d2=new Point3D(0.0, 1.0, 0.0);
		Point3D point3d3=new Point3D(0.0, 1.0, 1.0);
		Point3D point3d4=new Point3D(0.0, 1.0, 2.0);
		Point3D point3d5=new Point3D(0.0, 1.0, 3.0);
		
		double ditance1= point3d1.distanceTo(point3d2);
		double ditance2= point3d2.distanceTo(point3d3);
		double ditance3= point3d3.distanceTo(point3d4);
		double ditance4= point3d4.distanceTo(point3d5);
		sum+=ditance1+ditance2+ditance3+ditance4;
		System.out.println(ditance1);
		System.out.println(ditance2);
		System.out.println(ditance3);
		System.out.println(ditance4);
		System.out.println(sum);

	}

}
