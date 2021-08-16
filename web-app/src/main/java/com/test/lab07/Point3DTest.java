package com.test.lab07;

import java.lang.NullPointerException;

public class Point3DTest {
	public static void main(String [] args){
	
		Point3D a = new Point3D(0.0, 0.0, 0.0);
		Point3D b = new Point3D(0.0, -1.0, -1.0);
		Point3D c = new Point3D(0.0, 1.0, 1.0);
		Point3D d = new Point3D(0.0, 0.5, 0.5);
		Point3D e = new Point3D(0.0, 1.0, 3.0);
		Point3D f = null;
		
		try {
			System.out.println("Comparing points a and b.");
			System.out.println("Point " + a + " is [CLOSER -1]/[SAME DISTANCE 0]/[FARTHER 1] to/from the origin than point " + b + " : " + a.compareTo(b));
			System.out.println("Comparing points b and c.");
			System.out.println("Point " + b + " is [CLOSER -1]/[SAME DISTANCE 0]/[FARTHER 1] to/from the origin than point " + c + " : " + b.compareTo(c));
			System.out.println("Comparing points c and d.");
			System.out.println("Point " + c + " is [CLOSER -1]/[SAME DISTANCE 0]/[FARTHER 1] to/from the origin than point " + d + " : " + c.compareTo(d));
			System.out.println("Comparing points d and e.");
			System.out.println("Point " + d + " is [CLOSER -1]/[SAME DISTANCE 0]/[FARTHER 1] to/from the origin than point " + e + " : " + d.compareTo(e));
			System.out.println("Comparing points e and f.");
			System.out.println("Point " + e + " is [CLOSER -1]/[SAME DISTANCE 0]/[FARTHER 1] to/from the origin than point " + f + " : " + e.compareTo(f));
		} catch (NullPointerException npe) {
			System.out.println("Caught: " + npe); 
		}
	}
}