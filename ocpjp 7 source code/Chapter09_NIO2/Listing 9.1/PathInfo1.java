/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
 import java.nio.file.*;

// Class to illustrate how to use Path interface and its methods 
public class PathInfo1 {
	public static void main(String[] args) {
		// create a Path object by calling static method get() in Paths class 
		Path testFilePath = Paths.get("D:\\test\\testfile.txt");
		
		// retrieve basic information about path		
		System.out.println("Printing file information: ");
		System.out.println("\t file name: " + testFilePath.getFileName());
		System.out.println("\t root of the path: " + testFilePath.getRoot());
		System.out.println("\t parent of the target: " + testFilePath.getParent());
		
		// print path elements
		System.out.println("Printing elements of the path: ");
		for(Path element : testFilePath) {
			System.out.println("\t path element: " + element);  
		}
	}
 } 
