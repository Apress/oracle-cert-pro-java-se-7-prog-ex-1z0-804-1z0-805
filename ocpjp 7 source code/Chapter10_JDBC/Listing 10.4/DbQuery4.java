/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.sql.*;

class DbQuery4 {
	public static void main(String[] args) throws SQLException {
		try (Connection connection = DbConnector.connectToDb();
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("SELECT firstName, email FROM contact WHERE firstName=\"Michael\"")) {
			System.out.println("fName \temail");
			while (resultset.next()){
				System.out.println(resultset.getString("firstName") + "\t" 
+ resultset.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(-1); 
		}
	}
}
