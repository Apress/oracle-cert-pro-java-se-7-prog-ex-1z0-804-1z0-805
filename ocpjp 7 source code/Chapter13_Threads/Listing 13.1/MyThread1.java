/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class MyThread1 extends Thread {
	public void run() {
		try {
        			sleep(1000);
     		} 
		catch (InterruptedException ex) { 
			ex.printStackTrace();
     			// ignore the InterruptedException - this is perhaps the one of the 
			// very few of the exceptions in Java which is acceptable to ignore 
     		}
		System.out.println("In run method; thread name is: " + getName());
	}
	public static void main(String args[])  {
		Thread myThread = new MyThread1();
        		myThread.start();
        		System.out.println("In main method; thread name is: " +Thread.currentThread().getName());
	}
}
