/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program demonstrates the usage of arrays as list

import java.util.*; 

class ArrayAsList{
public static void main(String []args) {
    		Double [] temperatureArray = {31.1, 30.0, 32.5, 34.9, 33.7, 27.8};
System.out.println("The original array is:     " + Arrays.toString(temperatureArray));
List<Double> temperatureList = new ArrayList<Double>(Arrays.asList(temperatureArray));
    		temperatureList.add(32.3);
    		System.out.println("The new List with an added element is: " + temperatureList);
}
}