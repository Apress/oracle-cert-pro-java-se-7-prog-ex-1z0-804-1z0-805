/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
public class DataRace {
	public static void main(String args[]) {
		UseCounter c = new UseCounter();
   		Thread t1 = new Thread(c);
   		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
   		t1.start();
   		t2.start();
   		t3.start();
	}
}