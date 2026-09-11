package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class demoparc {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the user email");
	String na=sc.nextLine();
	System.out.println("enter the user password");
	String password=sc.nextLine();
   String query="SELECT * FROM STUDENT where email="+na +" AND password="+password;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","Anu@123");
		Statement st=con.createStatement();
		System.out.println(query);
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String number=rs.getString("number");
			String email=rs.getString("email");
			System.out.println(id+" "+name+" "+number+" "+email);
			
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
