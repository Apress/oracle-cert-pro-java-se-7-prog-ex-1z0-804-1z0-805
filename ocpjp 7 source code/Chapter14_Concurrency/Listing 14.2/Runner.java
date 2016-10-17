/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.concurrent.CountDownLatch;
// this Runner class simulates a track runner in a 100-meter dash race. The runner waits till the
// count down timer gets to zero and then starts running  
class Runner extends Thread {
	private CountDownLatch timer; 
	public Runner(CountDownLatch cdl, String name) {
		timer = cdl;
		this.setName(name); 
		System.out.println(this.getName() + " ready and waiting for the count down to start");
		start(); 
	}

	public void run() {
		try {
			// wait for the timer count down to reach 0  
			timer.await();
		} catch (InterruptedException ie) {
			System.err.println("interrupted -- can't start running the race"); 
		}
		System.out.println(this.getName() + " started running"); 
	}
}
