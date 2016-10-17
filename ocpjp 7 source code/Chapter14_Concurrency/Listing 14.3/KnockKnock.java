/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.concurrent.Exchanger;
// Co-ordinate the silly talk between Duke and CoffeeShop by instantitaing the Exchanger object
// and the CoffeeShop and Duke threads 
class KnockKnock {
		public static void main(String []args) {
			Exchanger<String> sillyTalk = new Exchanger<String>(); 
			new CoffeeShopThread(sillyTalk).start();
			new DukeThread(sillyTalk).start();
	}
}