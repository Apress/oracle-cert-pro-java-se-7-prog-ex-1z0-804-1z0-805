/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.sql.*;

// To illustrate how to delete a row in a ResultSet and in the database 
class DbDelete { 
	public static void main(String[] args) throws SQLException {
		try (Connection connection = DbConnector.connectToDb();
Statement statement =
connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
ResultSet.CONCUR_UPDATABLE);
			ResultSet resultSet1 = 
statement.executeQuery
("SELECT * FROM contact WHERE firstName=\"John\"")) { 
		if(resultSet1.next()){
			// delete the first row 
			resultSet1.deleteRow();
		}
		resultSet1.close();
				
		// now fetch again from the database 
		try (ResultSet resultSet2 = 
statement.executeQuery("SELECT * FROM contact")) { 
			System.out.println("After the deletion");
			System.out.println("id \tfName \tlName \temail \t\tphoneNo");
			while (resultSet2.next()){
				System.out.println(resultSet2.getInt("id") + "\t" 
					+ resultSet2.getString("firstName") + "\t" 
					+ resultSet2.getString("lastName") + "\t" 
					+ resultSet2.getString("email") + "\t" 
					+ resultSet2.getString("phoneNo"));
			}
		}
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(-1); 
		}
	}
}