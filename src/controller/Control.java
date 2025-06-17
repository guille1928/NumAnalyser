package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Control {

//public function for inserting numbers in the database
public static boolean insertNumbers2 (Date date1, int num1, int num2, int num3, int num4, int num5, int star, int star2) {
	
	try {
		Connection conn =Database.connect();
		String sql = "INSERT INTO numbers (date1,num1,num2,num3,num4,num5,star,star2) VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement pST = conn.prepareStatement(sql);
		pST.setDate(1, date1);
		pST.setInt(2, num1);
		pST.setInt(3, num2);
		pST.setInt(4, num3);
		pST.setInt(5, num4);
		pST.setInt(6, num5);
		pST.setInt(7, star);
		pST.setInt(8, star2);
		pST.execute();
		
		System.out.println("Values inserted");
		return true;
		
		} catch (Exception e) {
			System.out.println("Error inserting values" + e);
			
		}
	
	
return false;	
}


}

