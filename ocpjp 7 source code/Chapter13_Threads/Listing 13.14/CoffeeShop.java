/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This class instantiates two threads - CoffeeMachine and Waiter threads 
// and these two threads interact with each other through wait/notify 
// till you terminate the application explicitly by pressing Ctrl-C
class CoffeeShop {
	public static void main(String []s) {
		CoffeeMachine coffeeMachine = new CoffeeMachine(); 
		Waiter waiter = new Waiter();
		coffeeMachine.start();
		waiter.start();
	}
}