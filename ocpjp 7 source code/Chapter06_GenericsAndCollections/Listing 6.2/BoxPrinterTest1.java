/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

class BoxPrinterTest1 {
	public static void main(String []args) {
		BoxPrinter value1 = new BoxPrinter(new Integer(10)); 						System.out.println(value1);
		BoxPrinter value2 = new BoxPrinter("Hello world"); 	
		System.out.println(value2);	
	}
} 
