/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// A simple progam to accept an integer from user in normal case, 
// otherwise prints an error message

import java.util.*;

class ScanInt2 {
	public static void main(String [] args) {
		System.out.println("Type an integer in the console: ");
		Scanner consoleScanner = new Scanner(System.in); 
		try { 
	System.out.println("You typed the integer value: " + consoleScanner.nextInt()); 
		} catch(InputMismatchException ime) { 
			// nextInt() throws InputMismatchException in case anything other than an integer 
			// is typed in the console; so handle it 
System.out.println("Error: You typed some text that is not an integer value...");
		}
	}
}
