package com.polaris;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("vamsi");
		list.add("vamsi");
		list.add("vamsi");
		System.out.println("List :: " + list);

		HashSet hash = new HashSet();
		hash.add("vamsi");
		hash.add("vamsi");
		hash.add("vamsi");
		System.out.println("HashSet :: " + hash);
		
		HashMap map = new HashMap();
		map.put("vamsi", "HYD");
		map.put("vamsi", 123);
		map.put("vamsiReddy", "Chennai");
		System.out.println("map :: "+map);
		
		
	}
}
