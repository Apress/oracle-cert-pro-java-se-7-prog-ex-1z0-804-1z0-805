/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.*;

class UnCheckedExceptionExample3 {
	public static void main(String []args) throws FileNotFoundException {
		// if any argument is passed, it would be greater than or equal to one 
		if(args.length >= 1) { 
			FileInputStream fis = new FileInputStream(args[0]);
		} else {
System.out.println("Error: No arguments passed in the commandline!");
System.out.println("Pass the name of the file to open as commandline argument");
		}
	}
}
