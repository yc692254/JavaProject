package com.test.lab07;

/**
 * @author Jiyang Chen
 *
 */
public class Point3D extends Point2D implements Measurable ,Comparable<Point3D>{
	protected double z;
	
	public Point3D(){
		super(0.0, 0.0);
		this.z = 0.0;
	}
	
	public Point3D(double initialX, double initialY, double initialZ){
		super(initialX, initialY);
		this.z = initialZ;
	}
	
	public double getZ(){
		return this.z;
	}

	/**
	* Calculates and returns distance to the otherPoint in 3D space.
	*
	* @param	otherPoint	a reference to another Point1D object
	* @returns	double		distance to otherPoint in 3D space. Zero if otherPoint is null.
	*/	
	public double distanceTo(Point1D otherPoint){
		if (otherPoint != null){
			return Math.sqrt(Math.pow(this.x - otherPoint.getX(), 2.0) + Math.pow(this.y, 2.0) + Math.pow(this.z, 2.0));
		} else {
			return 0.0;
		}
	}

	/**
	* Calculates and returns distance to the otherPoint in 3D space.
	*
	* @param	otherPoint	a reference to another Point2D object
	* @returns	double		distance to otherPoint in 3D space. Zero if otherPoint is null.
	*/	
	public double distanceTo(Point2D otherPoint){
		if (otherPoint != null){
			return Math.sqrt(Math.pow(this.x - otherPoint.getX(), 2.0) + Math.pow(this.y - otherPoint.getY(), 2.0) + Math.pow(this.z, 2.0));			
		} else {
			return 0.0;
		}		
	}

	/**
	* Calculates and returns distance to the otherPoint in 3D space.
	*
	* @param	otherPoint	a reference to another Point3D object
	* @returns	double		distance to otherPoint in 3D space. Zero if otherPoint is null.
	*/	
	public double distanceTo(Point3D otherPoint){
		if (otherPoint != null){
			return Math.sqrt(Math.pow(this.x - otherPoint.getX(), 2.0) + Math.pow(this.y - otherPoint.getY(), 2.0) + Math.pow(this.z - otherPoint.getZ(), 2.0));			
		} else {
			return 0.0;
		}
	}
	

	@Override
	public boolean equals(Point1D otherPoint){
		if (otherPoint != null){
			if (this.x == otherPoint.getX() && this.y == 0.0 && this.z == 0.0){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	@Override
	public boolean equals(Point2D otherPoint){
		if (otherPoint != null){
			if (this.x == otherPoint.getX() && this.y == otherPoint.getY() && this.z == 0.0){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	
	public boolean equals(Point3D otherPoint){
		if (otherPoint != null){
			if (this.x == otherPoint.getX() && this.y == otherPoint.getY() && this.z == otherPoint.getZ()){
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
		return "(" + this.x + ", " + this.y + ", " + this.z +")";
	}

	@Override
	public int compareTo(Point3D other) throws NullPointerException{
		if(other==null) {
			throw new NullPointerException("The otherPoint Point3D object reference is null!");
		}
		Point3D origin =new Point3D(0.0, 0.0, 0.0);
		double a = distanceTo(origin);
		double b = other.distanceTo(origin);
		if(a > b) {
			return 1;
		}else if(a < b) {
			return -1;
		}else {
			return 0;
		}
	}

}