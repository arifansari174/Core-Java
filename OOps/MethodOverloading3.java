public class Display {
	void student(String name, int age)
	{
	   System.out.println("name:"+name+": age:"+age); 
	   
	}
	void student(int age, String name)
	{
	   System.out.println("age:"+age+": name:"+name); 
	   
	}
	public static void main(String[] args) {
		 Display s=new Display();
		 s.student("arif",18);
		 s.student(18,"ansari");
		
	}
}