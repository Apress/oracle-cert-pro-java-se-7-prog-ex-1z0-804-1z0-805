/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// Logger class must be intantiated only once in the application; it is to ensure that the 
// whole of the application makes use of that same logger instance 
public class Logger {
	// declare the constructor private to prevent clients 
// from instantiating an object of this class directly 
	private Logger() {	}
	private static Logger myInstance; 	// by default, this field is initialized to null 
	// the static method to be used by clients to get the instance of the Logger class 
	public static Logger getInstance() {
		if(myInstance == null) {
			// this is the first time this method is called, and that’s why myInstance is null 
			myInstance = new Logger();
		}
		// return the same object reference any time and every time getInstance is called 
		return myInstance;
	}
	public void log(String s) {
		// a trivial implementation of log where we pass the string to be logged to console 
		System.err.println(s);
	}
}