/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program demonstrates the usage of arrays as list

import java.util.*; 

public class ArrayAsList {
	public static void main(String []args) {
		Double [] weeklyTemperature = {31.1, 30.0, 32.5, 34.9, 33.7, 27.8};
		List<Double> temperatures = Arrays.asList(weeklyTemperature);
		System.out.println("Maximum temperature recorded was: " + Collections.max(temperatures));
		System.out.println("Minimum recorded was: " + Collections.min(temperatures));
	}
}
