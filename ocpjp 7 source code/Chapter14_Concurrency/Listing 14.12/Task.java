/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.concurrent.*;

// This Task class implements Runnable, so its a Thread object 
class Task implements Runnable {
	public void run() {
		System.out.println("Calling Task.run() "); 
	}
}
