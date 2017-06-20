package com.pingosoft.unicep.poo.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author pingosoft.com
 */
public class JdbcTest {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/petshop", "unicep", "unicep");

			System.out.println("Database connection successful!\n");

			// 2. Create a statement
			myStmt = myConn.createStatement();

			// 3. Execute SQL query
			myRs = myStmt.executeQuery("select * from dono");

			// 4. Process the result set
			while (myRs.next())
				System.out.println(myRs.getString("nome") + ", " + myRs.getString("sobrenome"));
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			if(myRs != null)
				myRs.close();

			if(myStmt != null)
				myStmt.close();

			if(myConn != null)
				myConn.close();
		}
	}

}