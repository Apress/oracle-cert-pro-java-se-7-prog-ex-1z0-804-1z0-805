/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.concurrent.*;

// this class simulates the start of a running race by counting down from 5. It holds
// three runner threads to be ready to start in the start line of the race and once the count down
// reaches zero, all the three runners start running... 

class RunningRaceStarter {
	public static void main(String []args) throws InterruptedException {
		CountDownLatch counter = new CountDownLatch(5); 
		// count from 5 to 0 and then start the race 
		
		// instantiate three runner threads 
		new Runner(counter, "Carl");
		new Runner(counter, "Joe");
		new Runner(counter, "Jack");
		 	
		System.out.println("Starting the countdown ");
		long countVal = counter.getCount(); 
		while(countVal > 0) {
			Thread.sleep(1000); // 1000 milliseconds = 1 second
			System.out.println(countVal); 
			if(countVal == 1) {
				// once counter.countDown(); in the next statement is called, 
				// Count down will reach zero; so shout "Start" 
				System.out.println("Start");
			}
			counter.countDown(); // count down by 1 for each second 
			countVal = counter.getCount(); 
 		}
	}
}
