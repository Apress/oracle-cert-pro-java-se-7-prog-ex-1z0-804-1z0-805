/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.*;
import java.text.*;

public class FractionDigits {
	public static void main(String[] args) throws ParseException {
		String[] numbers = {"1.222", "0.12345F" };
		double [] doubles = {1.222, 0.12345F }; 
		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setMaximumFractionDigits(2);
		System.out.println("Using format method: "); 
		for(double val : doubles) { 
			System.out.println(numberFormat.format(val));
		}
		System.out.println("Using parse method: ");
		for(String number : numbers) {
			System.out.println(numberFormat.parse(number));
		}
	}
}