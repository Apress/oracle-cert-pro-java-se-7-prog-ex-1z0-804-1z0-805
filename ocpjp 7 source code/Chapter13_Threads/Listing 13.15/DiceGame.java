/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// class DiceGame just starts the game by starting player threads 
class DiceGame {
	public static void main(String []s) {
		Player player1 = new Player(Gamers.JANE);
		Player player2 = new Player(Gamers.JOE);
		// don’t forget to set who starts the game 
		Dice.setWhoStarts(Gamers.JOE); 
		player1.start();
		player2.start(); 
	}
}