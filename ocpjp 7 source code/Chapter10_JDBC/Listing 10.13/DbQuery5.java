/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import javax.sql.rowset.*;
import java.sql.*;

// To illustrate how to use RowSet, RowSetProvider, and RowSetFactory  
class DbQuery5 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/addressBook";
		String userName = "root"; 
		String password = "mysql123";
		try {
			// first, create a factory object for rowset 
			RowSetFactory rowSetFactory = RowSetProvider.newFactory();
			// create a JDBC rowset from the factory 
			JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
			rowSet.setUrl(url);
			rowSet.setUsername(userName);                               
			rowSet.setPassword(password);                               
			rowSet.setCommand("SELECT * FROM contact");
			rowSet.execute(); 
			System.out.println("id \tfName \tlName \temail \t\tphoneNo");
			while (rowSet.next()){
				System.out.println(rowSet.getInt("id") + "\t" 
						+ rowSet.getString("firstName") + "\t" 
						+ rowSet.getString("lastName") + "\t" 
						+ rowSet.getString("email") + "\t" 
						+ rowSet.getString("phoneNo"));
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
