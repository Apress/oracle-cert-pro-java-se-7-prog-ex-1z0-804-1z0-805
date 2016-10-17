/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.*;

class CheckedExceptionExample3 {
	public static void main(String []args) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
		} catch(FileNotFoundException fnfe) {
System.out.println("Error: There is no file that exists with name " + args[0]);
System.out.println("Pass a valid file name as commandline argument!");
		}
	}
}