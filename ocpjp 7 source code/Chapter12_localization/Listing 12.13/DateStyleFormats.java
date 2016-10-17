/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.*;
import java.text.*;

// Demonstrates the use of constants in DateFormat that determines the display style 
class DateStyleFormats {
	public static void main(String []args) {
		Date now = new Date(); 
int [] dateStyleFormats = { DateFormat.SHORT, DateFormat.MEDIUM, DateFormat.LONG, DateFormat.FULL, DateFormat.DEFAULT};
		System.out.println("Today's date in different styles are: "); 

		// print today's date in all four formats plus 
// the default format in the default Locale 
		for(int dateStyleFormat : dateStyleFormats) {
			DateFormat dateFormat = DateFormat.getDateInstance(dateStyleFormat);
			System.out.println(dateFormat.format(now)); 
		}
	}
}
