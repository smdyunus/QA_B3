package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestSet {

	public static void main(String[] args) {
		//HashSet a = new HashSet();
		LinkedHashSet a = new LinkedHashSet();
		a.add("Yunus");
		a.add(123);
		a.add('D');
		a.add(null);
		a.add("Yunus");
		System.out.println(a);
	}
	
}
