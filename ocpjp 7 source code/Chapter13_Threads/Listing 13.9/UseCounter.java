/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This class implements Runnable interface 
// Its run method increments the counter three times 
class UseCounter implements Runnable {
	public void increment() { 
		// increments the counter and prints the value 
		// of the counter shared between threads
		Counter.count++;
		System.out.print(Counter.count + "  ");
	}
	public void run() {
		increment();
        		increment();
		increment(); 
	}
}