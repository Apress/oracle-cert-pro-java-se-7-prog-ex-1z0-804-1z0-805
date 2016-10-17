/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.IOException;
import java.nio.file.*;

// illustrates how to use File class to compare two paths 
class PathCompare2 {
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("Test");
		Path path2 = Paths.get("D:\\OCPJP7\\programs\\NIO2\\Test");

		System.out.println("Files.isSameFile(path1, path2) is: " 
				+ Files.isSameFile(path1, path2));
	}
}