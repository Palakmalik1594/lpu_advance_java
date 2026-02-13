package com.mockitoprac;


//in service layer we will write all the business logics,like dsa concepts also must be written here only,in service layer

public class UserService {
	
	UserDao dao;  //right now value is null
	//we will create a faake dao for testing 
	public UserService(UserDao dao){
		this.dao=dao;
	}
	public String typeOfUser(int id) {
		User user=dao.findById(id);
		if(user.getBalance()>0 && user.getBalance()<=1000) {
			return "new User";
			
		}else if(user.getBalance()>1000 && user.getBalance()<=2000) {
			return "regular user";
		}else {
			return "premium user";
		}
		
	}
	

}
//unit testing+fake object(this fake object is created with the help of mockito)