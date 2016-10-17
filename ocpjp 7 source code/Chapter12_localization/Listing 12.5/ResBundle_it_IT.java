/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.*;

// Italian version
public class ResBundle_it_IT extends ListResourceBundle {
public Object[][] getContents() {
        		return contents;
    	}
    	static final Object[][] contents = {
    		{ "MovieName", "Che Bella Giornata" }, 
    		{ "GrossRevenue", (Long) 43000000L }, // in euros 
    		{ "Year", (Integer)2011 }   
    	};
}
