package com.mycom.Assignments.CollectionsFramework;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DbConnector {

	private static Connection connection;
	
	//opening connection with mysql database
	
		public static Connection createConnection() throws ClassNotFoundException,SQLException {
			String url,userid,password;
			
			url="jdbc:mysql://@localhost:3306/library?autoReconnect=true&useSSL=false";
			userid="root";
			password="ajayrao";
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection(url,userid,password);
			return connection;
		} 
		//closing connection 
		public static void closeConnection() throws SQLException{
			connection.close();
		}
}
