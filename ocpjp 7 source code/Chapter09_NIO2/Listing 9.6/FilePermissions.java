/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.nio.file.*;

class FilePermissions {
	public static void main(String[] args) {
		Path path = Paths.get(args[0]);
		System.out.printf( "Readable: %b, Writable: %b, Executable: %b ", 
				Files.isReadable(path), Files.isWritable(path), Files.isExecutable(path)); 
	}
}
