package com.ca.test;

import org.testng.annotations.Test;

import com.ca.EvenNum;

public class EvenNumTest {
	@Test
	public void test1(){
		EvenNum ele=new EvenNum();
		boolean flag=ele.evenNum(7);
		if(flag){
			System.out.println("Even Num");
		}
		else{
			System.out.println("Odd Num");
		}
	}
	/*@Test
	public void test2(){
		EvenNum ele=new EvenNum();
		ele.evenNum(10);
	}*/
}
