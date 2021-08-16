package com.test.lab04;

/**
 * Measurable Interface implementation class
 * @author Jiyang Chen
 *
 */
public class Point3D extends Point2D implements Measurable {

	private double z;

	public Point3D() {
		super();
		this.z = 0.0;
	}
	
	/**
	 * @param initialX
	 * @param initialY
	 */
	public Point3D(double initialX, double initialY) {
		super(initialX, initialY);
		this.z = 0.0;
	}

	/**
	 * @param initialX
	 * @param initialY
	 * @param initialZ
	 */
	public Point3D(double initialX, double initialY, double initialZ) {
		super(initialX, initialY);
		this.z = initialZ;
	}
	
	public double getZ() {
		return z;
	}

	/**
	* Calculates and returns distance to the otherPoint in 3D space.
	*
	* @param	otherPoint	a reference to another Point1D object
	* @returns	double		distance to otherPoint in 3D space. Zero if otherPoint is null.
	*/
	public double distanceTo(Point1D otherPoint) {
		double a = getX() - otherPoint.getX();
		return Math.sqrt(Math.pow(a, 2.0));
	}

	/**
	* Calculates and returns distance to the otherPoint in 3D space.
	*
	* @param	otherPoint	a reference to another Point2D object
	* @returns	double		distance to otherPoint in 3D space. Zero if otherPoint is null.
	*/
	public double distanceTo(Point2D otherPoint) {
		double a = getX() - otherPoint.getX();
		double b = getY() - otherPoint.getY();
		return Math.sqrt(Math.pow(a, 2.0) +Math.pow(b, 2.0));
	}

	/**
	* Calculates and returns distance to the otherPoint in 3D space.
	*
	* @param	otherPoint	a reference to another Point3D object
	* @returns	double		distance to otherPoint in 3D space. Zero if otherPoint is null.
	*/
	public double distanceTo(Point3D otherPoint) {
		double a = getX() - otherPoint.getX();
		double b = getY() - otherPoint.getY();
		double c = getZ() - otherPoint.getZ();
		return Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0) + Math.pow(c, 2.0));
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
	public boolean equals(Point2D otherPoint) {
		if (otherPoint != null) {
			if (this.x == otherPoint.getX() && this.y == otherPoint.getY() && this.z == 0.0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	 
	
	public boolean equals(Point3D otherPoint) {
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
	public String toString() {
		return "(" + this.x + ", " + this.y + ", " + this.z +")";
	}

}
