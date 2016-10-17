/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.*;
import java.util.*;

class ThrowsClause3 {
	// since this method does not handle FileNotFoundException, 
	// the method must declare this exception in the throws clause 
	public int readIntFromFile() throws FileNotFoundException {
		Scanner consoleScanner = new Scanner(new File("integer.txt")); 
		return consoleScanner.nextInt(); 
	}

	// since readIntFromFile() throws FileNotFoundException and main() does not handle 
	// it, the main() method declares this exception in its throws cause 
	public static void main(String []args) throws FileNotFoundException {
		System.out.println("Reading an integer from the file 'integer.txt': ");
System.out.println("You typed the integer value: " + new ThrowsClause3().readIntFromFile()); 
	}
}