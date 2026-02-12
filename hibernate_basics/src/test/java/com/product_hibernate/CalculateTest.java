package com.product_hibernate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.practice.Calculate;

public class CalculateTest {
	@Test
	public void divides() {
		Calculate c =new Calculate();
		int ac=c.divide(10, 0);
		assertEquals(0,ac);
	} 
	
	@Test
	public void divideTest() {
		Calculate c =new Calculate();
		int actual=c.divide(10, 2);
		assertEquals(5,actual);
	}

}
