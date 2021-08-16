package com.test.lab04;

public class Point1D {
	protected double x;
	
	public Point1D(){
		this.x = 0.0;
	}
	
	public Point1D(double initialX){
		this.x = initialX;
	}
	
	public double getX(){
		return this.x;
	}
	
	public boolean equals(Point1D otherPoint){
		if (otherPoint != null){
			if (this.x == otherPoint.getX()){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	@Override
	public String toString(){
		return "(" + this.x + ")";
	}
}