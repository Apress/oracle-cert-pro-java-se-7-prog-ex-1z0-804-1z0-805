/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.concurrent.*;

// A ThreadFactory implementation that sets the thread priority to max 
// for all the threads it creates 
class MaxPriorityThreadFactory implements ThreadFactory {
	private static long count = 0; 
	public Thread newThread(Runnable r) {
	     Thread temp = new Thread(r);
	     temp.setName("prioritythread" + count++); 
	     temp.setPriority(Thread.MAX_PRIORITY); 
	     return temp; 
	}
} 

