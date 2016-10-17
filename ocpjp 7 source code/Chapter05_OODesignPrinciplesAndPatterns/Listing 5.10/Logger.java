/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
public class Logger {
	private Logger() {
		// private constructor
	}
	private static Logger myInstance;
	public static Logger getInstance() {
		if(myInstance == null) {
			synchronized (Logger.class) {
				if(myInstance == null) {
					myInstance = new Logger();
				}
			}
		}			
		return myInstance;
	}
	public void log(String s) {
		// log implementation
		System.err.println(s);
	}
}
