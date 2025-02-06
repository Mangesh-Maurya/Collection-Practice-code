package collection.jtc.days;

import java.util.HashMap;
import java.util.*;

public class Day6 {
	public static void main(String[] args) {
		HashMap hm=new HashMap<>();
		hm.put("Sid", 101);
		hm.put("name","Som");
		hm.put(null, null);
		hm.put("Sid", 99999);
		hm.put(1192,"som");
		System.out.println(hm);
		System.out.println("*****LinkedHashMap****\n");
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("sid", 909);
		lhm.put(1111 ,9999 );
		System.out.println(lhm);
		System.out.println("TreeMap*********\n");
		TreeMap tm=new TreeMap();
		tm.put(110,"Hello");
		tm.put(999,"1991");
		tm.put(99,"181991"); 
		tm.put(88, 8383991);
		
		System.out.println(tm);
	}

}
