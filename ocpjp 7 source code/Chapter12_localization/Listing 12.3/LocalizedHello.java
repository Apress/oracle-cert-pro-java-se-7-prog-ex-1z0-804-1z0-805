/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.*;

public class LocalizedHello {
	public static void main(String args[]) {
		Locale currentLocale = Locale.getDefault(); 
		ResourceBundle resBundle = 
ResourceBundle.getBundle("ResourceBundle", currentLocale);
		System.out.printf(resBundle.getString("Greeting")); 
	}
}