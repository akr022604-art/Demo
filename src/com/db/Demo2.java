package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the user name");
	String na=sc.nextLine();
	System.out.println("enter the user password");
	String password=sc.nextLine();
   String query="Select*from student where name="+na+" and password="+password;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Anu@123");
		Statement st=con.createStatement();
		
		//insert
		//String in="insert into student values(0,'tom','34456789','tom@gamil.com')";
		//String in2="insert into student values(0,'jerry','987655433','jerry@gamil.com')";
//		int i=st.executeUpdate(in);
//		int i1=st.executeUpdate(in2);
		
		//insert of multiple values at a time
//		String in="insert into student (id,name,number,email)values(0,'kiran','1235678','kiraan@gmial.com'),(0,'honey','18987762650','honey@gmial.com')";
//		int i=st.executeUpdate(in);
		
		
		//update
//		String up="update student set name='jon' where name='anuk'";
//		int i3=st.executeUpdate(up);
		
		//delete
//		
//		String del="delete from student where name='kiran'";
//		int i3=st.executeUpdate(del);
		
		//DQL query should be done by using executeQuery and ResultSet interface
		
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
