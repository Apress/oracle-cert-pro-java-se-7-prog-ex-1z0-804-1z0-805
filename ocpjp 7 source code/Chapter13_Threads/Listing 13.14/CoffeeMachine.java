/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// The CoffeeMachine class runs as an independent thread. 
// Once the machine makes a coffee, it notifies the waiter to pick it up. 
// When the waiter asks the coffee machine to make a coffee again, 
// it starts all over again, and this process keeps goes on ... 
class CoffeeMachine extends Thread {
	static String coffeeMade = null;
	static final Object lock = new Object(); 
	private static int coffeeNumber = 1;
	void makeCoffee() {
		synchronized(CoffeeMachine.lock) {
			if(coffeeMade != null) {
				try {
					System.out.println("Coffee machine: Waiting for waiter notification to deliver the coffee"); 
					CoffeeMachine.lock.wait();
				}
				catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}
			coffeeMade = "Coffee No. " + coffeeNumber ++;
			System.out.println("Coffee machine says: Made " + coffeeMade); 
			// once coffee is ready, notify the waiter to pick it up 
			CoffeeMachine.lock.notifyAll(); 
			System.out.println("Coffee machine: Notifying waiter to pick the coffee "); 
		}
	}

	public void run() {
		while(true) {
			makeCoffee(); 
			try {
				System.out.println("Coffee machine: Making another coffee now");
				// simulate the time taken to make a coffee by calling sleep method 
				Thread.sleep(10000); 
			}
			catch(InterruptedException ie) {
				// its okay to ignore this exception 
				// since we're not using thread interrupt mechanism 
				ie.printStackTrace();
			}
		}
	}
}
