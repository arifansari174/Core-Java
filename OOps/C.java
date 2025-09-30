package com.Multithreading;

public class C_join extends Thread {
	
	@Override
	public void run()
	{
		String n = Thread.currentThread().getName();
		for(int i=0;i<=3; i++)
		{
			System.out.println(n);
		}
	}

}