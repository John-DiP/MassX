package phys;

/**
This class deals with vectors, which is a quantity that represents magnitude and direction.

Created 05/01/2025
**/

public class Vector {
	private double x; // represents a horizontal vector
	private double y; // represents a vertical vector
	private double z; // represents depth
	
	
	public Vector() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	/**
	This constructor is for 2D
	**/
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
		this.z = 0;
		
	}
	
	/**
	This constructor is for 3D
	**/
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getZ() {
		return z;
	}
	
	
	
}
