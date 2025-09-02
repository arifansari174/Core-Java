package com.basic.java;

public class MethodTopic {
	static void sum()
	{
		System.out.println("This is sum method");		
	}
	static void sub()
	{
		System.out.println("This is  subtract method");		
	}
	static void mul()
	{
		System.out.println("This  is multiply method");		
	}
	public static void main(String[] args) {
		sum();
		sub();
//		mul();
//		mul();
//		mul();
		for(int i=1; i<=3; i++)
		{
			mul();
		}
		
	}

}
