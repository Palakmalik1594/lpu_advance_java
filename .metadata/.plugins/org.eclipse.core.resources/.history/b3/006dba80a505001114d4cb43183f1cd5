package com.connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindStudentData {
	public static void main(String[] args) {
			
			try {
				Class.forName("org.postgresql.Driver");
					Connection connect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/college","postgres","root");
					
					Statement stmt=connect.createStatement();
					String sql="select * from student";
					
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()) {
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
					}
			}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		
	}
}
