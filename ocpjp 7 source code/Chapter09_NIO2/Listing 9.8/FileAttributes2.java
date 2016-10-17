/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

class FileAttributes2 {
	public static void main(String[] args) {
		Path path = Paths.get(args[0]);
		try {
BasicFileAttributes fileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
			System.out.println("File size: " + fileAttributes.size());
			System.out.println("isDirectory: " + fileAttributes.isDirectory());
System.out.println("isRegularFile: " + fileAttributes.isRegularFile());
System.out.println("isSymbolicLink: " + fileAttributes.isSymbolicLink());
System.out.println("File last accessed time: " + fileAttributes.lastAccessTime());
System.out.println("File last modified time: " + fileAttributes.lastModifiedTime());
System.out.println("File creation time: " + fileAttributes.creationTime());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
