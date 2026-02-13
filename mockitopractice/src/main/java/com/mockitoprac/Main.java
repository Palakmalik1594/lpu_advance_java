package com.mockitoprac;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao userdao=new UserDao();
		userdao.insertUsers();
		//dao is how to insert,delete
		//when we have to put conditions like we should use service layer which as all the business logics in it
		//dao is simple crud operations

	}

}
