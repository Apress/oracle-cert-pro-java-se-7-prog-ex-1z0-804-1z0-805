/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// This program demonstrates how we can search numbers of a specified length
public class Regex3 {
	public static void main(String[] args) {
		String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone, Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post office, , Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";
		Pattern pattern = Pattern.compile("\\D\\d{5}\\D");
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}