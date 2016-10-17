/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.*;

class UnCheckedExceptionExample2 {
	public static void main(String []args) throws FileNotFoundException {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
System.out.println("Error: No arguments passed in the commandline!");
System.out.println("Pass the name of the file to open as commandline argument");
		}
	}
}
