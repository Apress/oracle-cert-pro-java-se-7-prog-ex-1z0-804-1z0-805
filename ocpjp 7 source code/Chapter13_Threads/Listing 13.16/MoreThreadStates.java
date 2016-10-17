/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// The class creates two threads to show how to these threads will enter into 
// TIMED_WAITING and BLOCKED states 
class MoreThreadStates {
	public static void main(String []s) {
		Thread t1 = new SleepyThread(); 
		Thread t2 = new SleepyThread(); 
		t1.start();
		t2.start();
		System.out.println(t1.getName()+ ": I'm in state " + t1.getState()); 
		System.out.println(t2.getName()+ ": I'm in state " + t2.getState());
	}
} 