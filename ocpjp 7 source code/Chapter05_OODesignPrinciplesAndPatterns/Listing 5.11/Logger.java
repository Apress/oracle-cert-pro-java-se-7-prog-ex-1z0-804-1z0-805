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
	public static class LoggerHolder {
		public static Logger logger = new Logger();
	}
	public static Logger getInstance() {
		return LoggerHolder.logger;
	}
	public void log(String s) {
		// log implementation
		System.err.println(s);
	}
}