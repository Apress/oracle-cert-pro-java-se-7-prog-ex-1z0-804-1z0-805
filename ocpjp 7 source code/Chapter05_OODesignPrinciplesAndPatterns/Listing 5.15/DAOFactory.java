/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
public class DAOFactory {
	 public static CircleDAO getCircleDAO(String sourceType) {
		// This is a simple example, so we have listed only "RDBMS" as the only source type
		// In a real-world application, you can provide more source types  
		switch(sourceType){
		case "RDBMS":
			return new RDBMSDAO();
		}
		return null;
	}
}
