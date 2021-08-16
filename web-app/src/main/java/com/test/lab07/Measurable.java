package com.test.lab07;

/**
* 
* An interface for point to point distance measurements
* 
* @author	Jacek Dzikowski
* @version	1.00.00
*/

public interface Measurable {
	/**
	* Calculates and returns distance to the otherPoint in 3D space.
	*
	* @param	otherPoint	a reference to another Point1D object
	* @returns	double		distance to otherPoint in 3D space. Zero if otherPoint is null.
	*/
	public double distanceTo(Point1D otherPoint);

	/**
	* Calculates and returns distance to the otherPoint in 3D space.
	*
	* @param	otherPoint	a reference to another Point2D object
	* @returns	double		distance to otherPoint in 3D space. Zero if otherPoint is null.
	*/
	public double distanceTo(Point2D otherPoint);

	/**
	* Calculates and returns distance to the otherPoint in 3D space.
	*
	* @param	otherPoint	a reference to another Point3D object
	* @returns	double		distance to otherPoint in 3D space. Zero if otherPoint is null.
	*/
	public double distanceTo(Point3D otherPoint);
}