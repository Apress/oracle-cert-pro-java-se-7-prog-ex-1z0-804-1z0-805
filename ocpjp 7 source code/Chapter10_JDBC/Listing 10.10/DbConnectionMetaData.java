/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
import java.sql.*;
// To illustrate how to obtain metadata from Collection object
// and examine the metadata for using it in a program
class DbConnectionMetaData {
        public static void main(String []args) throws SQLException {
                Connection connection = DbConnector.connectToDb();
                DatabaseMetaData metaData = connection.getMetaData();
System.out.println("Displaying some of the database metadata from the Connection object");
System.out.println("Database is: " + metaData.getDatabaseProductName() + " " + metaData.getDatabaseProductVersion());
System.out.println("Driver is: " + metaData.getDriverName() + metaData.getDriverVersion());
                System.out.println("The URL for this connection is: " + metaData.getURL());
                System.out.println("User name is: " + metaData.getUserName());
System.out.println("Maximum no. of rows you can insert is: " + metaData.getMaxRowSize());
        }
}