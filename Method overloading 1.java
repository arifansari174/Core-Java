public class calculator{
	
	void sum (int a, int b)
	{
	    System.out.println(a+b);
	    
	}
	void sum(int a, int b , int c)
	{
	    System.out.println("sum of a and b and c:"+ (a+b+c));
	}
	public static void main(String[] args) {
		calculator c =new calculator();
		c.sum(10,20);
		c.sum(10,20,30);
		
	}
}