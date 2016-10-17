/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class ThreadStateProblem extends Thread {
	public void run() {
		try {
			wait(1000);
		}
		catch(InterruptedException ie) {
			// its okay to ignore this exception since we’re not 
			// interrupting exceptions in this code 
			ie.printStackTrace(); 
		}
	}
	
	public static void main(String []s) {
		new ThreadStateProblem().start(); 
	}
} 
