/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This Thread class just invokes sleep method after acquiring lock on its class object 
class SleepyThread extends Thread {
	public void run() {
		synchronized(SleepyThread.class) {
			try {
				Thread.sleep(1000); 
			}
			catch(InterruptedException ie) {
				// its okay to ignore this exception since we’re not 
				// interrupting exceptions in this code 
				ie.printStackTrace();
			}
		}
	}
}
