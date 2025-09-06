public class Multiply {
	void mul(int x , int y)
	{
	  int z =x*y;
	  System.out.println("multiply of xand y:"+z);  
	}
	void mul(float a , float b)
	{
	    float c = a*b;
	  System.out.println("multiply of a and b:"+c);
	    
	}
	
	public static void main(String[] args) {
		Multiply  m= new Multiply();
		 m.mul(5,7);
		 m.mul(2.3f,3.4f);
		
	}
}