package com.basic.java;

public class PostAndPreIncrement {
	public static void main(String[] args) {
		int x = 16;
		System.out.println(x++);     // (1)
		System.out.println(++x);     // (2)
		System.out.println(x);       // (3)
		System.out.println(x++);     // (4)
		System.out.println(++x + 4); // (5)
	}
}
