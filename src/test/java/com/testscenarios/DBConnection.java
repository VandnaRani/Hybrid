package com.testscenarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args)throws Exception {
		String databaseURL =  "jdbc:mysql://127.0.0.1:3306/vandna";
		String username = "vandna";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cnn = DriverManager.getConnection(databaseURL, username, password);
		System.out.println("Conneted Databases successfully");
		
		// Step:2: Write the sql query and stored into Statement
				String myquery = "select * from vandna.employee;";
				Statement stmt = cnn.createStatement();

				// Step:3: Run the sql query and store the results in ResultSet
				ResultSet rs = stmt.executeQuery(myquery);


	while (rs.next()) {
		String idemployee = rs.getString(1);
		String nameemployee = rs.getString(2);
		String emailemployee = rs.getString(3);
		String mobileemployee = rs.getString(4);
		String adressemployee = rs.getString(5);
		String cityemployee = rs.getString(6);
		System.out.println(idemployee + "\t" + nameemployee + "\t" + emailemployee  + "\t" + mobileemployee + "\t" + adressemployee +"\t" +cityemployee +"\t");
				
	}
	
	

// Step:4:Close the database connection
cnn.close();
System.out.println("DB Connection closed successfully");
}
}
