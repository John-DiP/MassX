package phys.conversion;
/**
This class deals with Time conversions

Created 12/16/2025
**/

public class TimeConversion {
	
	private TimeConversion() {
		
	}
	
	/**
	 
	 convert minutes to seconds
	 
	 * @param minute
	 * @return 
	 
	 */
	
	public static double minutesToSeconds(double minutes) {
		return minutes * 60;
	}
	
	/**
	 
	 convert hours to seconds
	 
	 * @param hours
	 * @return 
	 
	 */
	
	public static int hoursToSeconds(int hours) {
		return hours * 3600;
	}
	
	/**
	 
	 convert days to seconds
	 
	 * @param days
	 * @return 
	 
	 */
	
	public static int daysToSeconds(int days) {
		return days * 86400;
	}
	
	/**
	 
	 convert years to days
	 
	 * @param years
	 * @return 
	 
	 */
	
	public static double yearsToDays(double years) {
		return years * 365.25;
	}
	
	/**
	 
	 convert years to seconds
	 
	 * @param years
	 * @return 
	 
	 */
	
	public static double yearsToSeconds(double years) {
		return years * 3.156e7;
	}
}
