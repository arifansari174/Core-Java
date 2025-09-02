package com.basic.java;

import java.util.Arrays;

public class Method2 {
	//user define
//	static void sort(int[] arr)
//	{
//		for(int i=0;  i<arr.length;  i++)
//		{
//			for(int j=i+1; j<arr.length; j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//	}
	public static void main(String[] args) {
		int[] arr= {4,3,20,49,7};
		//user define method
//		sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		//pre-define mthod
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
