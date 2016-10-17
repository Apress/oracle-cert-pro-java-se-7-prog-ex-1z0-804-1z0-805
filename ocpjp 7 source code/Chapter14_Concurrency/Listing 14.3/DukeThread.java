/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.concurrent.Exchanger;

// The DukeThread class runs as an independent thread. It talks to the CoffeeShopThread that 
// also runs independently. The chat is achieved by exchanging messages through a common 
// Exchanger<String> object that synchronizes the chat between them.
// Note that the message printed are the "responses" received from CoffeeShopThread  
class DukeThread extends Thread {
	private Exchanger<String> sillyTalk;
	
	public DukeThread(Exchanger<String> args) {
		sillyTalk = args; 
	}
	public void run() {
		String reply = null; 
		try {
			// start the conversation with CoffeeShopThread 
			reply = sillyTalk.exchange("Knock knock!"); 
			// Now, print the response received from CoffeeShopThread 
			System.out.println("CoffeeShop: " + reply);
			
			// exchange another set of messages 
			reply = sillyTalk.exchange("Duke"); 
			// Now, print the response received from CoffeeShopThread 
			System.out.println("CoffeeShop: " + reply);

			// an exchange could happen only when both send and receive happens 
			// since this is the last sentence to speak, we close the chat by
			// ignoring the "dummy" reply 
			reply = sillyTalk.exchange("The one who was born in this coffee shop!");
			// talk over, so ignore the reply! 
		} catch(InterruptedException ie) {
			System.err.println("Got interrupted during my silly talk");
		}
	}
}
