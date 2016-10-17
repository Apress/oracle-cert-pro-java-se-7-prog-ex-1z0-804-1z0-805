/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.*;

// Get the currency details of the default locale (en_US locale) 
class CurrencyDetails {
	public static void main(String []args) {
		Locale locale = Locale.getDefault(); 
		Currency currencyInstance = Currency.getInstance(locale);
		System.out.println(" The currency code for locale " + locale
			+ " is: " + currencyInstance.getCurrencyCode()
			+ " \n The currency symbol is " + currencyInstance.getSymbol() 
			+ " \n The currency name is " + currencyInstance.getDisplayName()); 
	}
}