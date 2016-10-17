/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.*;
import java.nio.file.*;
public class FileTreeWalkFind {
	public static void main(String[] args) {
		if(args.length != 2){
System.out.println("usage: FileTreeWalkFind <start-path> <pattern to search>");
			System.exit(-1);
		}
		Path startPath = Paths.get(args[0]);
		String pattern = args[1];
		try {
			Files.walkFileTree(startPath, new MyFileFindVisitor(pattern));
			System.out.println("File search completed!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
