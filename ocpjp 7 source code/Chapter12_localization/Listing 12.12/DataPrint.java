/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.*;
import java.text.*;

// Class to demonstrate the use of DateFormat class to format the date and print it 
class DatePrint {
	public static void main(String[] args) {
		// the default constructor for the Date 
// sets the date/time for current date/time 
		Date today = new Date(); 
Locale [] locales = { Locale.CANADA, Locale.FRANCE, Locale.GERMANY, Locale.ITALY }; 
		for(Locale locale : locales) { 
			// DateFormat.FULL refers to the full details of the date 
DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale); 
System.out.println("Date in locale " + locale + " is: " + dateFormat.format(today));		
}
	}
}
