/**
This class deals with Length conversions

Created 12/15/2025
**/

public final class LengthConversion {

	private LengthConversion() {
		
	}
	
	/**
	 
	 convert meters to centimeters
	 
	 * @param meter
	 * @return 
	 
	 */
	
	public static double meterToCentimeter(double meter) {
		return meter * 100;
	}
	
	/**
	 
	 convert meters to millimeters
	 
	 * @param meter
	 * @return 
	 
	 */
	
	public static double meterToMillimeter(double meter) {
		return meter * 1000;
	}
	
	/**
	 
	 convert meters to μm
	 
	 * @param meter
	 * @return 
	 
	 */
	
	public static double meterToMicrometer(double meter) {
		return meter * 1_000_000;
	}
	
	/**
	 
	 convert meters to nm
	 
	 * @param meter
	 * @return 
	 
	 */
	
	public static double meterToNanometer(double meter) {
		return meter * 1000000000;
	}
	
	/**
	 
	 convert kilometers to meter
	 
	 * @param kilometer
	 * @return 
	 
	 */
	
	public static double kilometerToMeter(double kilometer) {
		return kilometer * 1000;
	}
	
	/**
	 
	 convert kilometers to miles
	 
	 * @param kilometer
	 * @return 
	 
	 */
	
	public static double kilometerToMiles(double kilometer) {
		return kilometer * 0.6214;
	}
	
	/**
	 
	 convert meters to feet
	 
	 * @param meter
	 * @return 
	 
	 */
	
	public static double meterToFeet(double meter) {
		return meter * 3.281;
	}
	
	/**
	 
	 convert meters to inches
	 
	 * @param meter
	 * @return 
	 
	 */
	
	public static double meterToInches(double meter) {
		return meter * 39.37;
	}
	
	/**
	 
	 convert centimeters to inches
	 
	 * @param centimeter
	 * @return 
	 
	 */
	
	public static double centimeterToInches(double centimeter) {
		return centimeter * 0.3937;
	}
	
	/**
	 
	 convert inches to centimeter
	 
	 * @param inches
	 * @return 
	 
	 */
	
	public static double inchesToCentimeter(double inches) {
		return inches * 2.540;
	}
	
	/**
	 
	 convert feet to centimeter
	 
	 * @param feet
	 * @return 
	 
	 */
	
	public static double feetToCentimeter(double feet) {
		return feet * 30.48;
	}
	
	/**
	 
	 convert yard to centimeter
	 
	 * @param yard
	 * @return 
	 
	 */
	
	public static double yardToCentimeter(double yard) {
		return yard * 91.44;
	}
	
	/**
	 
	 convert miles to feet
	 
	 * @param miles
	 * @return 
	 
	 */
	
	public static double milesToFeet(double miles) {
		return miles * 5280;
	}
	
	/**
	 
	 convert miles to feet
	 
	 * @param miles
	 * @return 
	 
	 */
	
	public static double milesToKilometers(double miles) {
		return miles * 1.609;
	}
	
	
}
