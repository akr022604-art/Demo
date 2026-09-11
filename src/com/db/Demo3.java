package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo3 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Anu@123");
		PreparedStatement ps=con.prepareStatement("Insert into Student values(0,?,?,?,?)");
		
		
		System.out.println("enter the username:");
		String name=sc.nextLine();
		System.out.println("enter the phone number:");
		String phone=sc.nextLine();
		System.out.println("enter the email:");
		String email=sc.nextLine();
		System.out.println("enter the password :");
		String password=sc.nextLine();
		ps.setString(1,name);
		ps.setString(2,phone);
		ps.setString(3,email);
		ps.setString(4,password);
		int i=ps.executeUpdate();
		System.out.println(i);
		
		String query="Select*from Student";
		ResultSet rs=ps.executeQuery(query);
		while(rs.next()) {
			int id=rs.getInt("id");
			String na=rs.getString("name");
			String num=rs.getString("number");
			String mail=rs.getString("email");
			String pass=rs.getString("password");
			System.out.println(id+" "+na+" "+num+" "+mail+" "+pass);
		}
		} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  
}
}
