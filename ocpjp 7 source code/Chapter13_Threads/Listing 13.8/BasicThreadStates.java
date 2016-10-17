/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class BasicThreadStates extends Thread {
	public static void main(String []s) throws Exception {
		Thread t = new Thread(new BasicThreadStates());
		System.out.println("Just after creating thread; \n" + 
				"	The thread state is: " + t.getState()); 
		t.start();
		System.out.println("Just after calling t.start(); \n" + 
				"	The thread state is: " + t.getState());
		t.join(); 
		System.out.println("Just after main calling t.join(); \n" + 
				"	The thread state is: " + t.getState());
	}
}