package com.db;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;

	public class Req1 {
	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the email:");
		String email=sc.nextLine();
		System.out.println("enter the password :");
		String password=sc.nextLine();
		
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Anu@123");
			String query="select *from Student where email=?  and password=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,email);
			ps.setString(2,password);			
			ResultSet rs=ps.executeQuery();
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
