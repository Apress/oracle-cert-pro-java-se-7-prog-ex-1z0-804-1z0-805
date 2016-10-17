/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class USPresident implements Serializable{
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
return "US President [name=" + name + ", period=" + period + ", term=" + term + "]";
	}
	public USPresident(String name, String period, String term) {
		this.name = name;
		this.period = period;
		this.term = term;
	}
	private String name;
	private String period;
	private transient String term;
}