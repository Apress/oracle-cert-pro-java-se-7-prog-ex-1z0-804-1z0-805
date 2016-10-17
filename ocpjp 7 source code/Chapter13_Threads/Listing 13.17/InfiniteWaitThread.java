/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This class has run method which waits for ever since there is no other thread to notify it 
class InfiniteWaitThread extends Thread {
	static boolean okayToRun = false; 
	synchronized public void run() {
		while(!okayToRun) {
			try {
				// note the call to wait without any timeout value 
				// so it waits forever for some thread to notify it 
				wait(); 
			}
			catch(InterruptedException ie) {
				// its okay to ignore this exception since we’re not 
				// interrupting exceptions in this code 
				ie.printStackTrace();
			}
		}
	}
}
