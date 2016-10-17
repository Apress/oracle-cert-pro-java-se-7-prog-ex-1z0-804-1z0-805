/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.*;
class TransientSerialization {
	public static void main(String []args) {
USPresident usPresident = new USPresident("Barack Obama", "2009 to --", "56th term"); 
		System.out.println(usPresident);
		
		//Serialize the object
try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("USPresident.data"))){
			oos.writeObject(usPresident);
		}
		catch(FileNotFoundException fnfe) {
System.err.println("cannot create a file with the given file name ");
		} catch(IOException ioe) {
System.err.println("an I/O error occurred while processing the file");
		} // the ObjectOutputStream will auto-close, so don't have to worry about it 
		
		//De-serialize the object
try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("USPresident.data"))){
			Object obj = ois.readObject();
			if(obj != null && obj instanceof USPresident){
				USPresident presidentOfUS = (USPresident)obj;
				System.out.println(presidentOfUS);
			}
		}catch(FileNotFoundException fnfe) {
System.err.println("cannot create a file with the given file name ");
		} catch(IOException ioe) {
System.err.println("an I/O error occurred while processing the file");
		} catch(ClassNotFoundException cnfe) {
System.err.println("cannot recognize the class of the object - is the file corrupted?"); 
		}
	}
}
