package com.polaris;

import java.util.HashMap;
import java.util.Map;

public class Cusors {
	public static void main(String[] args) {
		// Enumaration
		// Iteration
		// ListIteration

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("vamsi", 1);
		map.put("ashok", 2);
		map.put("Krishna", 3);
		map.put("Reddy", 4);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
}
