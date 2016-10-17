/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.sql.*;
class DbCreateTable {
	public static void main(String[] args) {
		try (Connection connection = DbConnector.connectToDb();
			Statement statement = connection.createStatement()){ 
// use CREATE TABLE SQL statement to create table familyGroup
int result = statement.executeUpdate("CREATE TABLE familyGroup (id int not null auto_increment, nickName varchar(30) not null, primary key(id));");
			System.out.println("Table created successfully");
			
		} 
		catch (SQLException sqle) {
			sqle.printStackTrace();
			System.exit(-1); 
		}
  	}
}
