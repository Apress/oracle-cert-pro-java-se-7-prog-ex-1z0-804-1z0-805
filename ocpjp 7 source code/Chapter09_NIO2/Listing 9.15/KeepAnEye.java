/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.IOException;
import java.nio.file.*;

public class KeepAnEye {
	public static void main(String[] args) {
		Path path = Paths.get("..\\src");
		WatchService watchService = null;
		try {
			watchService = path.getFileSystem().newWatchService();
			path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//infinite loop
		for(;;){
			WatchKey key = null;
			try {
				key = watchService.take();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// iterate for each event
			for(WatchEvent<?> event:key.pollEvents()){
				switch(event.kind().name()){
				case "OVERFLOW":
					System.out.println("We lost some events");
					break;
				case "ENTRY_MODIFY":
System.out.println("File " + event.context() + " is changed!");
					break;
				}
			}
			//resetting the key is important to receive subsequent notifications
			key.reset();
		}
	}
}
