/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// Counter is a thread class that has two methods – IncrementBallAfterRun and 
// IncrementRunAfterBall.
// For demonstrating deadlock, we call these two methods in the run method, 
// so that locking can be requested in opposite order in these two methods 
class Counter implements Runnable {
	// this method increments runs variable first and then increments the balls variable
	// since these variables are accessible from other threads, 
	// we need to acquire a lock before processing them 
	public void IncrementBallAfterRun() {
		// since we're updating runs variable first, lock the Runs.class reference first 
		synchronized(Runs.class) {
			// now acquire lock on Balls.class variable before updating balls variable 
            			synchronized(Balls.class) {
                  			Runs.runs++;
                        			Balls.balls++;
			}
		}
	}

	public void IncrementRunAfterBall() {
		// since we're updating balls variable first, lock the Balls.class reference first 
		synchronized(Balls.class) {
			// now acquire lock on Runs.class variable before updating runs variable  				synchronized(Runs.class) {
                  			Balls.balls++;
                        			Runs.runs++;
			}
		}
	

      	public void run() {
		// call these two methods which acquire locks in different order
		// depending on thread scheduling and the order of lock acquision, 
		// a deadlock may or may not arise 
		IncrementBallAfterRun();
		IncrementRunAfterBall();
	}
}