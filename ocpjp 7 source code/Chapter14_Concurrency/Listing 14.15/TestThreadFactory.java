/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.concurrent.ThreadFactory;
class TestThreadFactory {
	public static void main(String []args) {
		ThreadFactory threadFactory = new MaxPriorityThreadFactory();
		Thread t1 = threadFactory.newThread(new ARunnable());
		System.out.println("The name of the thread is " + t1.getName()); 
		System.out.println("The priority of the thread is " + t1.getPriority()); 
		t1.start(); 
	}
}  