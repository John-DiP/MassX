/*
This class deals with vectors, which is a quantity that represents magnitude and direction.

Created 05/01/2025
*/

public class Vector {
	private double vectorX; // represents a horizontal vector
	private double vectorY; // represents a vertical vector
	
	public Vector() {
		this.vectorX = 0;
		this.vectorY = 0;
	}
	
	public Vector(double x, double y) {
		this.vectorX = x;
		this.vectorY = y;
	}
	
	public double add(Vector other) {
		double resultX = this.vectorX + other.vectorX;
		double resultY = this.vectorY + other.vectorY;
		
		
		return Math.sqrt(Math.pow(resultX,2) + Math.pow(resultY,2));
	}
	
	/*
	public double subtract(Vector other ) {
		
		return ;
	}
	*/
}
