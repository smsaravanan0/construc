package org.cons;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import org.omg.CORBA.FieldNameHelper;

public class Gaming {

	public static void main(String[] args) {
		String name="everything";
		Map<Character, Integer> ne=new LinkedHashMap<>();
		 char[] f = name.toCharArray();
		for (char h : f) {
			if(ne.containsKey(h)) {
				int coun = ne.get(h);
			ne.put(h, coun+1);
			
		}else {
			ne.put(h, 1);
		}
		

		
	}System.out.println(ne);

	}
}