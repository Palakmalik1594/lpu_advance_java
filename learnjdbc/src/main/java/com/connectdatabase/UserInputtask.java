package com.connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserInputtask {
	
	public static void main(String[] args) {
		try {
			Connection connect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/college","postgres","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
