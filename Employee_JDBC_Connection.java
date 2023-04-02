package com.sanket.databse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee_JDBC_Connection {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Done");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springboot", "root", "root");
		System.out.println("Connection Done");
		Statement st=con.createStatement();
		String sql="select * from employee";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
		}
	}

}
