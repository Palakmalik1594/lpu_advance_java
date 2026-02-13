package com.mockitopractice;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.mockitoprac.Calculator;
import com.mockitoprac.MathService;
import com.mockitoprac.UserDao;
import com.mockitoprac.UserService;
public class UserServiceTest {
	
	
@Test
	public void testGetTypeOfCustomer() {
		UserDao userdao=new UserDao();
		UserService userService=new UserService(userdao);
		String actualRes=userService.typeOfUser(1);
		assertEquals("regular user",actualRes);
	}
//for creating fake objet,take help of build in methods
@Test
public void testDoubleAddition() {
	//step 1: createfakeobject
	Calculator calmock=mock(Calculator.class);
	// step-2: what mock object should return
	
	//it is taking fake object
	when(calmock.add(5, 5)).thenReturn(20);
	
	//step-3: give the fake object reference
	MathService service=new MathService(calmock);
	int res=service.doubleAddition(5, 5);
	assertEquals(-1,res);
}

}
