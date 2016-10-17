/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.*;
import java.text.*;

// Use SimpleDateFormat for creating custom date and time formats as a "pattern string" 
class PatternStringExample {
	public static void main(String []args) {
		String pattern = "dd-MM-yy"; /* d for day, M for month, y for year */  
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
// the default Date constructor initializes to current date/time 
System.out.println(formatter.format(new Date()));
	}
}
