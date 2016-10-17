/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.sql.*;

// Program to illustrate how to query a database 
class DbQuery {
	public static void main(String[] args) {
		// Get connection, execute query, get the result set 
		// and print the entries from the result rest 
		try (Connection connection = DbConnector.connectToDb();
			Statement statement = connection.createStatement(); 
			ResultSet resultSet = statement.executeQuery("SELECT * FROM contact")){
			System.out.println("ID \tfName \tlName \temail \t\tphoneNo");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + "\t" 
				+ resultSet.getString("firstName") + "\t" 
				+ resultSet.getString("lastName") + "\t" 
				+ resultSet.getString("email") + "\t" 
				+ resultSet.getString("phoneNo"));
			}
		} 
		catch (SQLException sqle) {
			sqle.printStackTrace();
			System.exit(-1); 
		}
  	}
}