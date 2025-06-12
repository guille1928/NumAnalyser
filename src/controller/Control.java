package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Control {

	public static boolean insertValue (Date date1, int num1, int num2, int num3, int num4, int num5, int star, int star2) {
		
		Date date2 = date1;
		int num1User = num1;
		int num2User = num2;
		int num3User = num3;
		int num4User = num4;
		int num5User = num5;
		int starUser = star;
		int star2User = star2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Set the first number");
		num1User = scanner.nextInt();
		System.out.println("Set the second number");
		num2User = scanner.nextInt();
		System.out.println("Set the third number");
		num3User = scanner.nextInt();
		System.out.println("Set the fourth number");
		num4User = scanner.nextInt();
		System.out.println("Set the fifth number");
		num5User = scanner.nextInt();
		System.out.println("Set the first star");
		starUser = scanner.nextInt();
		System.out.println("Set the second star");
		star2User = scanner.nextInt();
		
		try {
		Connection conn =Database.connect();
		String sql = "INSERT INTO numbers (date1,num1,num2,num3,num4,num5,star,star2) VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement pST = conn.prepareStatement(sql);
		pST.setDate(1, date2);
		pST.setInt(2, num1User);
		pST.setInt(3, num1User);
		pST.setInt(4, num1User);
		pST.setInt(5, num1User);
		pST.setInt(6, num1User);
		pST.setInt(7, starUser);
		pST.setInt(8, star2User);
		pST.execute();
		
		System.out.println("Values inserted");
		return true;
		
		} catch (Exception e) {
			System.out.println("Error inserting values" + e);
			
		}
	
		
		return false;
	}



public static boolean insertValue2 () {
	
	String date2 ;
	int num1User ;
	int num2User ;
	int num3User ;
	int num4User ;
	int num5User ;
	int starUser ;
	int star2User ;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Set the date");
	date2= scanner.next().trim();
	System.out.println("Set the first number");
	num1User = scanner.nextInt();
	System.out.println("Set the second number");
	num2User = scanner.nextInt();
	System.out.println("Set the third number");
	num3User = scanner.nextInt();
	System.out.println("Set the fourth number");
	num4User = scanner.nextInt();
	System.out.println("Set the fifth number");
	num5User = scanner.nextInt();
	System.out.println("Set the first star");
	starUser = scanner.nextInt();
	System.out.println("Set the second star");
	star2User = scanner.nextInt();
	
	try {
	Connection conn =Database.connect();
	String sql = "INSERT INTO numbers (date1,num1,num2,num3,num4,num5,star,star2) VALUES (?,?,?,?,?,?,?,?)";
	PreparedStatement pST = conn.prepareStatement(sql);
	pST.setString(1, date2);
	pST.setInt(2, num1User);
	pST.setInt(3, num1User);
	pST.setInt(4, num1User);
	pST.setInt(5, num1User);
	pST.setInt(6, num1User);
	pST.setInt(7, starUser);
	pST.setInt(8, star2User);
	pST.execute();
	
	System.out.println("Values inserted");
	return true;
	
	} catch (Exception e) {
		System.out.println("Error inserting values" + e);
		
	}

	
	return false;
}
}

