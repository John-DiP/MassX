/*
Created 05/01/2025
*/

import java.util.*;
public class MainClass {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an X coordinate: ");
		
		double x = input.nextDouble();
		
		System.out.println("Enter an Y coordinate: ");
		
		double y = input.nextDouble();
		
		Vector vector = new Vector(x, y);
		
		System.out.println("Horizontal vector is " + vector.getVectorX());
		
		System.out.println("Vertical vector is " + vector.getVectorY());
		
		System.out.println("Added up, they are " + vector.addVector(x, y));
		
		input.close();
	}

}
