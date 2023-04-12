package com.sanket.databse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1..driver loaded..");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate_demo", "root", "root");
		
		System.out.println("2...connection done....");
		
		Statement st=con.createStatement();
		
		String sql="Select * from student";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		
		
	}
}
