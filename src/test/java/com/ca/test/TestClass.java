package com.ca.test;

import org.testng.annotations.Test;

import com.ca.Division;

public class TestClass {
	/*@Test
	public void test1(){
		Division div=new Division();
		div.divide(10, 0);
	}*/
	@Test
	public void test2(){
		Division div=new Division();
		System.out.println("hello");
		div.divide(10, 2);
	}
}
