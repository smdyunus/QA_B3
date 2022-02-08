package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class TestMap {
public static void main(String[] args) {
	
	//HashMap a = new HashMap();
	LinkedHashMap a = new LinkedHashMap();  
	a.put(1, "Yunus");
	a.put(2, 123);
	a.put(3, "Javeed");
	a.put(4, 890);
	a.put(5, 890);
	a.put(4, 100);
	a.put(1, "Sohile");

	

	
	System.out.println(a);
}
}
