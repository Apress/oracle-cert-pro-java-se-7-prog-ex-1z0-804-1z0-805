/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.IOException;
import java.nio.file.*; 

// To illustrate important methods such as normalize(), toAbsolutePath(), and toReativePath() 
class PathInfo2 {
	public static void main(String[] args) throws IOException {
		//get a path object with relative path
		Path testFilePath = Paths.get(".\\Test");
		System.out.println("The file name is: " + testFilePath.getFileName());
		System.out.println("It's URI is: " + testFilePath.toUri());
		System.out.println("It's absolute path is: " + testFilePath.toAbsolutePath());
		System.out.println("It's normalized path is: " + testFilePath.normalize());

		// get another path object with normalized relative path
		Path testPathNormalized = Paths.get(testFilePath.normalize().toString());
		System.out.println("It's normalized absolute path is: " + testPathNormalized.toAbsolutePath());
		System.out.println("It's normalized real path is: " + 
testFilePath.toRealPath (LinkOption.NOFOLLOW_LINKS));
	}
}