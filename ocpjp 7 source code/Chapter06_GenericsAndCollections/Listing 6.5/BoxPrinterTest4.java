/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
class BoxPrinterTest4 {
	public static void main(String []args) {
		BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(10)); 
		System.out.println(value1);
		Integer intValue1 = value1.getValue(); 
 
		BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world"); 
		System.out.println(value2);
		// OOPs! by mistake, we did put String in an Integer 
		Integer intValue2 = value2.getValue(); 
	}
}