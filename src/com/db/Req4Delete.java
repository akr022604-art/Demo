package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Req4Delete {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Anu@123");
		String query="delete from student where id=? ";
		PreparedStatement ps=con.prepareStatement(query);
		System.out.println("enter the id:");
		int id=sc.nextInt();
		ps.setInt(1, id);
		int i=ps.executeUpdate();
		if(i!=0) {
			System.out.println("the data is delete");
		}
		else {
			System.out.println("data is not deleted");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
