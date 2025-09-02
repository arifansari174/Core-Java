package com.basic.java;

public class Widening {
	public static void main(String[] args) {
		int i=10;
		double d=i;
		System.out.println(d); // 10
		
		byte b=100;
		int x=b;
		System.out.println(x);//100 widening 
		
	}

}
