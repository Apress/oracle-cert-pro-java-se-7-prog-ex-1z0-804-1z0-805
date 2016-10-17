/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.Console;

// better to print thro' Console object - it handles "special characters" better 
class SpecialCharHandling {
	public static void main(String []args) {
		// string has three Scandinavian characters
String scandString = "å, ä, and ö"; 
		// try printing scandinavian characters directly with println 
		System.out.println("Printing scands directly with println: " + scandString); 
		// now, get the Console object and print scand characters thro' that 
		Console console = System.console();
console.printf("Printing scands thro' console's printf method: " + scandString);
	}
}