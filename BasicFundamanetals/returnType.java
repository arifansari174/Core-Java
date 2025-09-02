package com.basic.java;

public class returnType {
	public  static int sum(int a , int b)
	{
		int c=a+b;
		System.out.println("sumof a and b:"+c);
		return c;
	}
	
	public  static double sum1(double a , double b)
	{
		double c=a+b;
		System.out.println("sumof a and b:"+c);
		return c;
	}
	
	public  static  int printArray(int[] arr)
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		sum(1,2);
		System.out.println("------------");
		sum1(3,4);
		System.out.println("----------");
		int[] arr= {2,3,4,5};
		int result=printArray(arr);
		System.out.println(result);
		
		
		
	}

}
