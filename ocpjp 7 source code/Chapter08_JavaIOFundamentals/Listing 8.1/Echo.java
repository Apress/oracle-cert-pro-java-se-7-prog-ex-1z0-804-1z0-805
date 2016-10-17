/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
 import java.io.Console;

// simple implementation of Echo command 
class Echo {
	public static void main(String []args) {
		// get the System console object 
		Console console = System.console();
		if(console == null) {
System.err.println("Cannot retrive console object - are you running your application from an IDE? Exiting the application ... ");
			System.exit(-1); // terminate the application 
		}
		// read a line and print it through printf  
		console.printf(console.readLine());
	}
 }