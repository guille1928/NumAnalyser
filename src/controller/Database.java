package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database {
	//create variables for connecting to Database
	private static final String url = "jdbc:mysql://localhost:3306/sorteo";
	private static final String user = "root";
	private static final String pass = "1234";

	
	
	public static Connection connect () {

	Connection connectNow = null;
	
	try {
		//lets try to connect to MySQL database called sorteo 
		connectNow = DriverManager.getConnection(url, user, pass);
		String sql = "USE sorteo";
		PreparedStatement prSt = connectNow.prepareStatement(sql);
		prSt.execute();
	
	} catch (Exception e) {
		System.out.println("Error connecting to database : " +e);
	}
		
	return connectNow;	
	}
}
