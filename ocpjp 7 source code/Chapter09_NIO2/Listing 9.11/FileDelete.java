/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.IOException;
import java.nio.file.*;

public class FileDelete {
	public static void main(String[] args) {
		if(args.length != 1){
		System.out.println("usage: FileDelete <source-path>");
			System.exit(1);
		}
		Path pathSource = Paths.get(args[0]);
		try {
			Files.delete(pathSource);
			System.out.println("File deleted successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
