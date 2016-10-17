/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.sql.*;

// Utility class with method connectToDb() that will be used by other programs in this chapter 
public class DbConnector { 
	public static Connection connectToDb() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/";
		String database = "addressBook";
		String userName = "root"; 
		String password = "mysql123";
		return DriverManager.getConnection(url + database, userName, password);  
	}
}