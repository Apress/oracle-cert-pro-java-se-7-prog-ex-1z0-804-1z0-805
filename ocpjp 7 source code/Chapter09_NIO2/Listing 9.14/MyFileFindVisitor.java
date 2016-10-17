/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

class MyFileFindVisitor extends SimpleFileVisitor<Path> {
	private PathMatcher matcher;
	
	public MyFileFindVisitor(String pattern){
		try {
			matcher = FileSystems.getDefault().getPathMatcher(pattern);
		} catch(IllegalArgumentException iae) {
			System.err.println("Invalid pattern; did you forget to prefix \"glob:\"? (as in glob:*.java)"); 
			System.exit(-1);  
		}

	}
	public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes){
		find(path);
		return FileVisitResult.CONTINUE;	
	}
	private void find(Path path) {
		Path name = path.getFileName();
		if(matcher.matches(name))
			System.out.println("Matching file:" + path.getFileName());
	}
public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes){
		find(path);
		return FileVisitResult.CONTINUE;
	}
}
