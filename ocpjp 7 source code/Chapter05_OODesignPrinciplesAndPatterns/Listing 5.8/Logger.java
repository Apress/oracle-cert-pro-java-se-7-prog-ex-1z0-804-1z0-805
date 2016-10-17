/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
public class Logger {
	private Logger() {
		// private constructor to prevent direct instantiation 
	}
	private static Logger myInstance;
	public static synchronized Logger getInstance() {
		if(myInstance == null)
			myInstance = new Logger();
		return myInstance;
	}
	public void log(String s){
		// log implementation
		System.err.println(s);
	}
}
