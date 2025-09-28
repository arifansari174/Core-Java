package Multithreading;

public class A1 extends Thread {
	
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
		A1 t1=new A1();
		A1 t2=new A1();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		
		t1.start();
		t2.start();
		
		for(int j=1; j<=3; j++)
		{
			System.out.println("hiiiiii");
		}

	}
}