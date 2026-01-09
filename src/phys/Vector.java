package phys;

/**
This class deals with Euclidean Vectors, which is a quantity that represents magnitude and direction.

Created 05/01/2025
**/

public class Vector {
	private double x; // represents a horizontal vector
	private double y; // represents a vertical vector
	
	public Vector() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	This constructor is for 2D
	**/
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double magnitude() {
		return Math.sqrt(x * x + y * y);
	}
	
	public Vector addition(Vector other) {
		return new Vector(this.x + other.x, this.y + other.y);
	}
	
	public Vector subtraction(Vector other) {
		return new Vector(this.x - other.x, this.y - other.y);
	}
	
	public double dotProduct(Vector other) {
		return this.x * other.x + this.y * other.y;
	}
	
	
	
}
