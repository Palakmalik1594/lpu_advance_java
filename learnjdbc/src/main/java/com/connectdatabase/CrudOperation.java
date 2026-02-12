package com.connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperation {
	public static String creates(){
		String rs="Create table Employee(id int Primary key,name varchar(25),sal int,department varchar(30));";
		return rs;
	}
	public static String inserts() {
		String rs="insert into Employee values(1,'palak',24566,'software'),(2,'prisha',65356,'ai/ml')";
		return rs;
		
	}
	public static String updates() {
		String rs="update Employee set sal=23456 where id=2";
		return rs;
		
	}
	public static String deletes() {
		String rs="delete from Employee where id=2";
		return rs;
		
	}
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
				Connection connect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/college","postgres","root");
				
				Statement stmt=connect.createStatement();
				//String sql=CrudOperation.creates();
//				String sql1=CrudOperation.inserts();
//				stmt.execute(sql1);
//				String sql2=CrudOperation.updates();
//				stmt.execute(sql2);
				String sql3=CrudOperation.deletes();
				stmt.execute(sql3);
				//stmt.execute(sql);
				connect.close();
				
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	

}
