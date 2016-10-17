/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// A program that scans an integer from a given string 

import java.util.*;

class ScanInt3 {
public static void main(String [] args) {
		String integerStr = "100"; 
		System.out.println("The string to scan integer from it is: " + integerStr);
		Scanner consoleScanner = new Scanner(integerStr); 
		try { 
			System.out.println("The integer value scanned from string is: " + 
consoleScanner.nextInt()); 
		} catch(InputMismatchException ime) { 
			// nextInt() throws InputMismatchException in case anything other than an integer 
			// is provided in the string 
			System.out.println("Error: Cannot scan an integer from the given string");
		}
}
}
