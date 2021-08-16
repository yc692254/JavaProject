package com.test.lab02;

public class BoundVector extends Vector{
	private double startPointX;
	private double startPointY;
	
	public BoundVector() {
		super();
		this.startPointX = 0;
		this.startPointY = 0;
	}
	
	public BoundVector(double endPointx, double endPointY) {
		super(endPointx, endPointY);
		this.startPointX = 0;
		this.startPointY = 0;
	}
	
	public BoundVector(double startPointX, double startPointY,double endPointx, double endPointY) {
		super(endPointx, endPointY);
		this.startPointX = startPointX;
		this.startPointY = startPointY;
	}

	public double getStartPointX() {
		return startPointX;
	}

	public double getStartPointY() {
		return startPointY;
	}
	
	
	public double getEndPointx() {
		return endPointx;
	}
	
	public double getEndPointY() {
		return endPointY;
	}
	
	public double getLength() {
		double xLen = getEndPointx() - getStartPointX();
		double yLen = getEndPointY() - getStartPointY();
		return (double)Math.sqrt(xLen * xLen + yLen * yLen);
	}

	@Override
	public String toString() {
		return "BoundVector [startPointX=" + startPointX + ", startPointY=" + startPointY + ", endPointx=" + endPointx
				+ ", endPointY=" + endPointY + "]";
	}
	
	
	
	
	
	
	
	
	

}
