package Constructors;

public class DefaultCons {
	
	int a;
	String name;
	
	/*
	public DefaultCons() 
	{
	}
	*/
	
	public DefaultCons() 
	{
		System.out.println("This is no Argument Cons");
	}

	
	public static void main(String[] args) {
		
		DefaultCons ObjRef  = new DefaultCons(); // Object creation
		System.out.println(ObjRef.a);
		System.out.println(ObjRef.name);
	}

}
