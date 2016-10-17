/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.util.Vector;

// This program demonstrate the lack of type-safety in containers (based on Object type).
class OldContainerTest {
public static void main(String []args) {
Vector floatValues = new Vector();             
floatValues.add(10.0f);
floatValues.add(100.0);
for(int i = 0; i < floatValues.size(); i++) {
System.out.println(floatValues.get(i)); 
}
}
}    
