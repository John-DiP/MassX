package phys;

public class Motion {
	
	public static double displacement(double x1, double x2) {
		return x2 - x1;
	}
	
	public static double averageVelocity(double displacement, double time) {
		return displacement / time;
	}
}
