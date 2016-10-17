/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This class spawns a Task thread and explicitly calls start() method. 
// It also shows how to execute a Thread using Executor 
class ExecutorTest {
	public static void main(String []args) {
		Runnable runnable = new Task(); 
		System.out.println("Calling Task.run() by directly creating a Thread object");
		Thread thread = new Thread(runnable); 
		thread.start();
		RepeatedExecutor executor = new RepeatedExecutor();
		executor.execute(runnable, 3); 	
	}
}
