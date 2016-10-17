/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.concurrent.Executor;
// This class implements Executor interface and should override execute(Runnable) method.
// We provide an overloaded execute method with an additional argument 'times' to create and 
// run the threads for given number of times  
class RepeatedExecutor implements Executor {
	public void execute(Runnable runnable) {
		new Thread(runnable).start(); 
	}
	public void execute(Runnable runnable, int times) {
		System.out.printf("Calling Task.run() thro' Executor.execute() for %d times %n", times);
		for(int i = 0; i < times; i++) {
			execute(runnable); 
		}
	}
}
