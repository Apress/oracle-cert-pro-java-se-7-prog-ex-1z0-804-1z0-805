/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.*;

// Use a helper method loadResourceBundle to load a bundle given the bundle name and locale 
class CandidateLocales {
	public static void loadResourceBundle(String resourceBundleName, Locale locale) {
		// Pass an instance of TalkativeResourceBundleControl 
// to print candidate locales  
ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceBundleName, locale, new TalkativeResourceBundleControl());
		String rbLocaleName = resourceBundle.getLocale().toString();
		// if the resource bundle locale name is empty, 
// it means default property file 
		if(rbLocaleName.equals("")) {
System.out.println("Loaded the default property file with name: " + resourceBundleName); 
		} else {
System.out.println("Loaded the resource bundle for the locale: " + resourceBundleName + "." + rbLocaleName);
		}
	}

public static void main(String[] args) {
	// trace how ResourceBundle_it_IT_Rome.properties is resolved 
    		loadResourceBundle("ResourceBundle", new Locale("it", "IT", "Rome")); 
    	}
}