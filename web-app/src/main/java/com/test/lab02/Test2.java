package com.test.lab02;

import javax.vecmath.Tuple2d;
import javax.vecmath.Vector2d;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tuple2d d1=new Tuple2d(1,2) {};
		Tuple2d d2=new Tuple2d(3,4) {};
		Vector2d sd=new Vector2d();
		sd.add(d1);
		sd.add(d2);
		System.out.println(sd.length());
		
		BoundVector vector=new BoundVector(1, 2, 3, 4);
		System.out.println(vector.getLength());

	}

}
