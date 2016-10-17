/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.*;
import java.text.*;

// Ilustrates how to use NumberFormat class to get Currency instance  
class LocalizedCurrency {
	public static void main(String []args) {
		long tenMillion = 10000000L; // this is ten million 
		Locale [] locales = 
			{ Locale.CANADA, Locale.FRANCE, Locale.GERMANY, Locale.TAIWAN }; 
		// for each of the four locales, 
// print the currency amount as it looks in that locale 
		for(Locale locale : locales) { 
System.out.println("Ten million in " + locale.getDisplayName() + " is " + NumberFormat.getCurrencyInstance(locale).format(tenMillion));
		}
	}
}
