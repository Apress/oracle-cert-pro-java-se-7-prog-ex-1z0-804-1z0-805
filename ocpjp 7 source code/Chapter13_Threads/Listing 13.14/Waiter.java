/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// The Waiter runs as an independent thread
// It interacts with the CoffeeMachine to wait for a coffee 
// and deliver the coffee once ready and request the coffee machine 
// for the next one, and this activity keeps going on for ever ...  
class Waiter extends Thread {
	public void getCoffee() {
		synchronized(CoffeeMachine.lock) {
			if(CoffeeMachine.coffeeMade == null) {
				try {
					// wait till the CoffeeMachine says (notifies) that 							// coffee is ready 
					System.out.println("Waiter: Will get orders till 							coffee machine notifies me "); 
					CoffeeMachine.lock.wait(); 
				}
				catch(InterruptedException ie) {
					// its okay to ignore this exception 
					// since we're not using thread interrupt mechanism 
					ie.printStackTrace();
				}
			}
			System.out.println("Waiter: Delivering " + CoffeeMachine.coffeeMade);
			CoffeeMachine.coffeeMade = null;
			// ask (notify) the coffee machine to prepare the next coffee 
			CoffeeMachine.lock.notifyAll(); 
			System.out.println("Waiter: Notifying coffee machine to make another one"); 
		}
	}
	
	public void run() {
		// keep going till the user presses ctrl-C and terminates the program  
		while(true) {
			getCoffee(); 
		}
	}
}
