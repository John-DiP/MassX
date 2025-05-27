/*
Created 05/01/2025
*/

import java.util.*;
public class PhysicsEngine {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Vector vector1 = new Vector();
		
		Vector vector2 = new Vector();
		
		System.out.println("Enter an X coordinate: ");
		
		double x = input.nextDouble();
		
		vector1.setVectorX(x);
		
		System.out.println("Enter an Y coordinate: ");
		
		double y = input.nextDouble();
		
		vector2.setVectorY(y);
		
		System.out.println("Horizontal vector is " + vector1.getVectorX(x));
		
		System.out.println("Vertical vector is " + vector2.getVectorY(y));
		
		input.close();
	}

}
