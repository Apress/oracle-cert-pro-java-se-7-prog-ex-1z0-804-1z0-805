/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
public class ParseString2 {
	public static void main(String[] args) {
		String str = "c:\\work\\programs\\parser";
		String [] dirList = str.split("\\\\");
		for (int i=0; i<dirList.length; i++) {
			System.out.println(dirList[i]);
		}
	}
}
