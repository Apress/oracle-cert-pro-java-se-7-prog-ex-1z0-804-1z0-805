/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
// This program demonstrates the use of format specifiers in printf 
class FormattedTable {
	static void line() {
		System.out.println("-----------------------------------------------------------------");
	}
	static void printHeader() {
		System.out.printf("%-15s \t %s \t %s \t %s \n", 
			"Player", "Matches", "Goals", "Goals per match");

	}
	static void printRow(String player, int matches, int goals) {
		System.out.printf("%-15s \t %5d \t\t %d \t\t %.1f \n", 
			player, matches, goals, ((float)goals/(float)matches));
	}
	public static void main(String[] str) {
		FormattedTable.line();
		FormattedTable.printHeader(); 
		FormattedTable.line();
		FormattedTable.printRow("Demando", 100, 122);
		FormattedTable.printRow("Mushi", 80, 100);
		FormattedTable.printRow("Peale", 150, 180);
		FormattedTable.line();
	}
}