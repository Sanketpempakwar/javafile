package com.sanket.databse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Bajaj {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("connection successfully Done");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bajaj", "root", "root");
		System.out.println("Driver loaded Successfully");
		System.out.println("--------------------------------");
		Statement st = con.createStatement();
		String sql = "Select * from employee";
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
					+ " " + rs.getString(5) + " " + rs.getString(6) + "" + rs.getString(7) + "" + rs.getString(8));
		}

	}
}
