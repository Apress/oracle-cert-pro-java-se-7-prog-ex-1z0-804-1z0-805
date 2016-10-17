/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// A program that illustrates multi-catch blocks 

import java.util.*;

class ScanInt5 {
	public static void main(String [] args) {
		String integerStr = ""; 
		System.out.println("The string to scan integer from it is: " + integerStr);
		Scanner consoleScanner = new Scanner(integerStr); 
		try { 
System.out.println("The integer value scanned from string is: " +  	consoleScanner.nextInt()); 
		} catch(NoSuchElementException | IllegalStateException multie) { 
			System.out.println("Error: An error occured while attempting to scan the integer"); 
		}
	}
}