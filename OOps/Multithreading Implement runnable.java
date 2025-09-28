package Multithreading;

public class B1 implements Runnable {
	@Override
	public void run()
	{
		String name= Thread.currentThread().getName();
		for(int i=0; i<3; i++)
		{
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		B1 r=new B1();
		
		
		
		Thread th1=new Thread(r);
		Thread th2=new Thread(r);
		
		th1.setName("Thread 1");
		th1.setName("Thread 2");
		
		th1.start();
		th2.start();
		
	}


}