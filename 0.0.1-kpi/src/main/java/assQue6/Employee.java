package assQue6;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	
	public static String Show() {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		  hm.put(100, "Suresh"); 
		  hm.put(101, "Ramesh"); 
		  hm.put(102, "Ganesh");
		  hm.put(103, "Mahesh"); 
		  System.out.println(hm.get(102));
		  return hm.get(102);
	}	 
}
