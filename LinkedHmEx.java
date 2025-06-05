package Tests;

import java.util.LinkedHashMap;



public class LinkedHmEx {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> ls = new LinkedHashMap<>();
		ls.put(100, "Century");
		ls.put(50, "Half Century");
		ls.put(10, "decade");
		
		System.out.println(ls);
		System.out.println(ls.get(100));
		
		
	}

}
