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
	
	public Vector(double vectorX, double vectorY) {
		this.vectorX = vectorX;
		this.vectorY = vectorY;
	}
	
	public double getVectorX() {
		return vectorX;
	}
	
	public double getVectorY() {
		return vectorY;
	}
	
	public double addVector(double vectorX, double vectorY) {
		double result = vectorX + vectorY;
		
		return result;
	}
	
	@Override
	public String toString() {
	    return "(" + vectorX + ", " + vectorY + ")";
	}
}
