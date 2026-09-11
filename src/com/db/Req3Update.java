package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Req3Update {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Anu@123");
		String query="update  Student set number=? where id=?";
		PreparedStatement ps=con.prepareStatement(query);
		System.out.println("enter the id :");
		int id=sc.nextInt();
		System.out.println("enter the new contact number:");
		String contact=sc.next();
		
		ps.setString(1, contact);
		ps.setInt(2, id);
		int i=ps.executeUpdate();
		if(i!=0) {
			System.out.println("the data is updated");
		}
		else {
			System.out.println("data is not updated");
		}
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
