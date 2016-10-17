/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program shows the usage of binary search

import java.util.*; 

class BinarySearchTest {
	public static void  main(String []args) {
		String [] strArr = { "21", "22", "11", "12", "13" };
		System.out.println("The given strArr is: " + Arrays.toString(strArr));
		int index = Arrays.binarySearch(strArr, "22"); 
		System.out.println("The index value is: " + index);
	}
}