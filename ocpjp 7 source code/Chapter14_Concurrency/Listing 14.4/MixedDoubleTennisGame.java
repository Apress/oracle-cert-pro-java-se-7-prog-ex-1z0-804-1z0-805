/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.concurrent.*;

// The run() method in this thread should be called only when four players are ready to start the game 
class MixedDoubleTennisGame extends Thread {
	public void run() {
		System.out.println("All four players ready, game starts \n Love all..."); 
	}
}
