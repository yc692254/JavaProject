package com.test.lab02;

public class Vector {
	
	protected double endPointx;
	protected double endPointY;
	
	public Vector() {
		this.endPointx = 0;
		this.endPointY = 0;
	}
	
	public Vector(double endPointx, double endPointY) {
		this.endPointx = endPointx;
		this.endPointY = endPointY;
	}
	
	public double getEndPointx() {
		return endPointx;
	}
	public double getEndPointY() {
		return endPointY;
	}
	
	public double getLength() {
		return Math.sqrt(Math.pow(endPointx, 2)+ Math.pow(endPointY, 2));
	}

	@Override
	public String toString() {
		return "Vector [endPointx=" + endPointx + ", endPointY=" + endPointY + "]";
	}

}
