package test;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new LinkedHashMap<>();
		m.put(10, "java");
		m.put(10, "c");
		m.put(20, "sql");
		m.put(30, "sql");
		m.put(40, "selenium");
		m.put(50, "python");
		
		System.out.println("m");
//size
		int size = m.size();
		System.out.println(size);
		
		//to get particular value
		String string = m.get(30);
		System.out.println(string);
		
		//to display the key only
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		//to display the value only
		Collection<String> values = m.values();
		System.out.println(values);
		
		boolean containsKey = m.containsKey(40);
		System.out.println(containsKey);
		
		//iterate
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		for(Entry<Integer, String> x:entrySet) {
			System.out.println(x);
			
			System.out.println("======");
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
		
		//isempty//contains//remove..clear
		
	}

}
