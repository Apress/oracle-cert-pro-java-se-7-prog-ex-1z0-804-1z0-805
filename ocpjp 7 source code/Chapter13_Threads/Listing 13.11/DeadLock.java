/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
public class DeadLock {
	public static void main(String args[]) throws InterruptedException {
		Counter c = new Counter();
		// create two threads and start them at the same time 	
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
		System.out.println("Waiting for threads to complete execution"); 
		t2.join(); 
		t2.join(); 
		System.out.println("Done."); 
	}
}