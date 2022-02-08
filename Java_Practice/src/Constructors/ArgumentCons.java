package Constructors;

public class ArgumentCons {
	
		int a;
		//String name;
		
		public ArgumentCons(int a) {
			this.a=a;
			System.out.println("This is a Argument Cons");	
		}

		public static void main(String[] args) {
			
			ArgumentCons Obj = new ArgumentCons(10);
			System.out.println(Obj.a);
			
		}
		

}
