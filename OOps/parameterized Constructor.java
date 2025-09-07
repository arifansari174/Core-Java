public class student{
	
	int id;
	String name;
	
	student(int i, String n)
	{
	    id =i;
	    name=n;
	    System.out.println("this is p.c.");
	}
	
	public static void main(String[] args) {
		student s1 =new student(101,"Arif");
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
	}
}