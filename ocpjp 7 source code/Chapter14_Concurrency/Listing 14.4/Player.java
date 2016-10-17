/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.concurrent.*;
// This thread simulates arrival of a player. 
// Once a player arrives, he/she should wait for other players to arrive 
class Player extends Thread {
	CyclicBarrier waitPoint; 
	public Player(CyclicBarrier barrier, String name) { 
		this.setName(name);
waitPoint = barrier; 
		this.start(); 
		}
	public void run() {
		System.out.println("Player " + getName() + " is ready ");
		try { 
			waitPoint.await(); // await for all four players to arrive 
		} catch(BrokenBarrierException | InterruptedException exception) {
			System.out.println("An exception occurred while waiting... " + exception); 
		}
	}
}

