package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Control {

	public static boolean insertValue () {
		try {
		Connection conn =Database.connect();
		String sql = "INSERT INTO numbers (date1,num1,num2,num3,num4,num5,star,star2) VALUES ('2023-06-12', 34, 23, 45, 11, 38, 6, 9)";
		PreparedStatement pST = conn.prepareStatement(sql);
		pST.execute();
		System.err.println("Values inserted");
		return true;
		
		} catch (Exception e) {
			System.err.println("Error inserting values" + e);
			
		}
	
		
		return false;
	}
}
