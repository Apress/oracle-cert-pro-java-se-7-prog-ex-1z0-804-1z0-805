/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.*;
import java.text.*;

// Using an example, illustrates the use of "pattern strings" for printing dates  
class CustomDatePatterns {
	public static void main(String []args) {
		// patterns from simple to complex ones
		String [] dateFormats = { 
			"dd-MM-yyyy", /* d is day (in month), M is month, y is year */ 
			"d '('E')' MMM, YYYY", /*E is name of the day (in week), Y is year*/  
			"w'th week of' YYYY", /* w is the week of the year */ 
			"EEEE, dd'th' MMMM, YYYY" /*E is day name in the week */  
		}; 
	    	Date today = new Date();
System.out.println("Default format for the date is " + DateFormat.getDateInstance().format(today));
		for(String dateFormat : dateFormats) {
System.out.printf("Date in pattern \"%s\" is %s %n", dateFormat, new SimpleDateFormat(dateFormat).format(today));
		}
	}
}