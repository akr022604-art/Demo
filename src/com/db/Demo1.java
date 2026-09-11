package com.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
public static void main(String[] args) {
	//step 1-loading and registring the jdbc
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver class loadded");
		
		//2nd step -establishing the connection b/w java and mysql		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Anu@123");
	   System.out.println("connection established");
	   
	   //3rd step-creating a platform in JRE to exceute sql queries
	   
	  Statement st= con.createStatement();//create and retrun the refence of statement object
	  System.out.println("platform created");
	  
	  //4t step execting the sql query
	  
	  String query="INSERT INTO Student values(0,'anuk','123412342','anuk@gmail.com')";
	  int i=st.executeUpdate(query);
	  System.out.println("number of rows inserted:"+i);
	  
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
