/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class AsyncThread extends Thread {
	public void run() {
		System.out.println("Starting the thread " + getName());
		for(int i = 0; i < 3; i++) {
			System.out.println("In thread " + getName() + "; iteration " + i);
			try {
				// sleep for sometime before the next iteration 
				Thread.sleep(10);
			}
			catch(InterruptedException ie) {
				// we’re not interrupting any threads 
				// – so safe to ignore this exeception 
				ie.printStackTrace();
			}	
		}
	}
	
	public static void main(String args[]) {
		AsyncThread asyncThread1 = new AsyncThread();
		AsyncThread asyncThread2 = new AsyncThread();
		// start both the threads around the same time 
		asyncThread1.start();
		asyncThread2.start();
	}
}
