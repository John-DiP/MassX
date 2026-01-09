package phys;

public class Motion {
	
	/** G is gravity */
	
	public static final double G = 9.806;
	
	public static double displacement(double x1, double x2) {
		return x2 - x1;
	}
	
	public static double timeInterval(double t1, double t2) {
		return t2 - t1;
	}
	
	public static double averageVelocity(double displacement, double timeInterval) {
		return displacement / timeInterval;
	}
	
	public static double averageAcceleration(double averageVelocity, double timeInterval) {
		return averageVelocity / timeInterval;
	}
	
	
}
