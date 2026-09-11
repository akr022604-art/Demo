package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ForLoopSqlExceution {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","Anu@123");
//		Statement st=con.createStatement();
//		System.out.println("platform established");
//		for(int i=0;i<10;i++) {
//			System.out.println("enter the name:");
//		   String name=sc.next();
//		   System.out.println("enter the contact:");
//		   String contact=sc.next();
//		   System.out.println("enter the email:");
//		   String mail=sc.next();
//		   System.out.println("enter the password:");
//		   String pass=sc.next();
//		   System.out.println("values given by user");
//		   String query="INSERT INTO STUDENT VALUES (0,"+name+","+contact+","+mail+","+pass+")";		 
//		   int j=st.executeUpdate(query);
//		   System.out.println(j);
//		   
//		}
//	} catch (ClassNotFoundException | SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	Scanner sc=new Scanner(System.in);
	//Scanner sc=new Scanner(System.in);
	//1st step of JDBC - Loading and Registering the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded");

		//2nd Step of JDBC - Establishing COnnection between Java and DB
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Anu@123");
		System.out.println("Con Established");

		//3rd step of JDBC - Creating a Platform	
		Statement st=con.createStatement();
		System.out.println("Platform created");

		//4th step of JDBC - Executing SQL queries
		for(int j=0;j<10;j++) {

			System.out.println("Enter the username");
			String username=sc.next();
			System.out.println("Enter the phone");
			String mobile=sc.next();
			System.out.println("Enter the email");
			String mail=sc.next();
			System.out.println("Enter the password");
			String password=sc.next();
			String query="INSERT INTO STUDENT VALUES (0,"+username+","+mobile+","+mail+","+password+")";
			int i=st.executeUpdate(query);
			System.out.println("No of Rows added:"+i);
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
