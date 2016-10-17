/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.nio.file.*;

class PathExists {
	public static void main(String[] args) {
		Path path = Paths.get(args[0]);
		
		if(Files.exists(path, LinkOption.NOFOLLOW_LINKS)) 
		{
			System.out.println("The file/directory " + path.getFileName() + " exists");
			// check whether it is a file or a directory
			if(Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) { 
				System.out.println(path.getFileName() + " is a directory");
			} 
			else {
				System.out.println(path.getFileName() + " is a file");
			}
		}
		else { 
			System.out.println("The file/directory " + path.getFileName() + " does not exist");
		}
	}
}