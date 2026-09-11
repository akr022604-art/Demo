package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Req2Insert {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Anu@123");
		String query="Insert into student values (0,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		System.out.println("enter the username:");
		String name=sc.next();
		System.out.println("enter the contact:");
		String contact=sc.next();
		System.out.println("enter the email:");
		String email=sc.next();
		System.out.println("enter the password:");
		String password=sc.next();
		ps.setString(1, name);
		ps.setString(2, contact);
		ps.setString(3, email);
		ps.setString(4, password);
		
		int i=ps.executeUpdate();
		if(i!=0) {
			System.out.println("data is inserted");
		}
		else {
			System.out.println("data is not inserted");
		}
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
