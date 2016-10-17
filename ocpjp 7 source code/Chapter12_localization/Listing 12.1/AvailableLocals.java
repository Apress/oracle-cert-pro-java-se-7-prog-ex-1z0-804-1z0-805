/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.Locale;

class AvailableLocales {
	public static void main(String []args) {
		System.out.println("The default locale is: " + Locale.getDefault());
		Locale [] locales = Locale.getAvailableLocales();
		System.out.printf("No. of other available locales is: %d, and they are: %n",		locales.length);
		for(Locale locale : locales) {
			System.out.printf("Locale code: %s and it stands for %s %n", 
locale, locale.getDisplayName()); 
		}
	}
}
    