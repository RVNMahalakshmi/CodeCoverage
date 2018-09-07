package com.ca;

public class Division {
	int result=0;
	public int divide(int a,int b){
		try{
			result=a/b;
			System.out.println("Normal flow");
		}catch(ArithmeticException exception){
			System.out.println("Arithmetic Exception occured");
		}
		catch(NullPointerException exception){
			System.out.println("NullPointerException occured");
		}
		finally{
			System.out.println("Finally Block");
		}
		return result;
	}
}
