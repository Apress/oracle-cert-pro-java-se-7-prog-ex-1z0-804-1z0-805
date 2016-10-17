/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.sql.*;
;

// To illustrate how to insert a row in a ResultSet and in the database 
class DbInsert { 
	public static void main(String[] args) throws SQLException {
		try (Connection connection = DbConnector.connectToDb();
Statement statement = connection.createStatement(
ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultSet = statement.executeQuery("SELECT * FROM contact")) {
		System.out.println("Before the insert");
		System.out.println("id \tfName \tlName \temail \t\tphoneNo");
		while (resultSet.next()){
			System.out.println(resultSet.getInt("id") + "\t" 
				+ resultSet.getString("firstName") + "\t" 
				+ resultSet.getString("lastName") + "\t" 
				+ resultSet.getString("email") + "\t" 
				+ resultSet.getString("phoneNo"));
		}
		resultSet.moveToInsertRow();
		resultSet.updateString("firstName", "John");
		resultSet.updateString("lastName", "K.");
		resultSet.updateString("email", "john@abc.com");
		resultSet.updateString("phoneNo", "+19753186420");
		resultSet.insertRow();
		System.out.println("After the insert");
		System.out.println("id \tfName \tlName \temail \t\tphoneNo");
		resultSet.beforeFirst();
		while (resultSet.next()){
			System.out.println(resultSet.getInt("id") + "\t" 
				+ resultSet.getString("firstName") + "\t" 
				+ resultSet.getString("lastName") + "\t" 
				+ resultSet.getString("email") + "\t" 
				+ resultSet.getString("phoneNo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

