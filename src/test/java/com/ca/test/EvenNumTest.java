package com.ca.test;

import org.testng.annotations.Test;

import com.ca.EvenNum;

public class EvenNumTest {
	@Test
	public void test1(){
		EvenNum ele=new EvenNum();
		ele.evenNum(7);
	}
	/*@Test
	public void test2(){
		EvenNum ele=new EvenNum();
		ele.evenNum(10);
	}*/
}
