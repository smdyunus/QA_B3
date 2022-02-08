package Arrays;

public class SigleDArray {

	public static void main(String[] args) {
		
		int a[] = new int[6];  
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
			

		int b[] = {100,200,300,400,500};
		b[4]=900;
				
		System.out.println(b[1]);
		
		for (int i = 0; i < b.length; i++) {    //i=o; 1 < 5;
			System.out.println(b[i]);
		}
		//Print array with for loop	
		for (int i = 0; i < a.length; i++) {    //i=o; 1 < 5;
			System.out.println(a[i]);
		}
		
		String s[] = {"Bang","HYD","Chennai"};
		//Print array with for each loop
		for (String i : s) {
			System.out.println(i);	
		}

		
	}
}
