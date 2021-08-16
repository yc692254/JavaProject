package com.test.lab04;

public class Point2D extends Point1D {
	protected double y;
	
	public Point2D(){
		super(0.0);
		this.y = 0.0;
	}
	
	public Point2D(double initialX, double initialY){
		super(initialX);
		this.y = initialY;
	}
	
	public double getY(){
		return this.y;
	}

	@Override
	public boolean equals(Point1D otherPoint){
		if (otherPoint != null){
			if (this.x == otherPoint.getX() && this.y == 0.0){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public boolean equals(Point2D otherPoint){
		if (otherPoint != null){
			if (this.x == otherPoint.getX() && this.y == otherPoint.getY()){
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
		return "(" + this.x + ", " + this.y + ")";
	}
}