/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// the class Player abstracts a player playing the Dice game
// each player runs as a separate thread, so Player extends Thread class 
class Player extends Thread {
	private String currentPlayer = null;
	private String otherPlayer = null;
	
	public Player(String thisPlayer) {
		currentPlayer = thisPlayer;
		// we’ve only two players; we remember them in currentPlayer and otherPlayer 
		otherPlayer = thisPlayer.equals(Gamers.JOE) ? Gamers.JANE: Gamers.JOE;  
	}
	
	public void run() { 
		// each player rolls the dice 6 times in the game 
		for(int i = 0; i < 6; i++) { 
			// acquire the lock before proceeding 
			synchronized(Dice.class) {
				// if its not currentPlayer’s turn, then 
				// wait for otherPlayers’s notification 
				while(!Dice.getTurn().equals(currentPlayer)) {
					try {
						Dice.class.wait(1000); 
						System.out.println(currentPlayer + 
							" was waiting for " + otherPlayer);
					}
					catch(InterruptedException ie) {
						ie.printStackTrace(); 
					}
				}
				// its currentPlayer’s turn now; throw the dice 
				System.out.println(Dice.getTurn() + " throws " + Dice.roll());
				// set the turn to otherPlayer, and notify the otherPlayer
				Dice.setTurn(otherPlayer);
				Dice.class.notifyAll(); 
			}
		}
	}
}
