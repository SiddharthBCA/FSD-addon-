package session7;

import java.util.*;


public class Collection {

	//Adding and accessing Element in a collection
	
	public static void main(String[] args) {
		//List Example
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("Python");
		list.add("Node");
		
		System.out.println("List:"+list);
		
		//Set Example
		
		Set<String> set = new HashSet<>();
		
		set.add("Hero XMR");
		set.add("RE");
		set.add("Jawa");
		
		System.out.println("Set: "+set);
		
		//map example
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"Sid");
		map.put(2,"Murugan");
		map.put(3,"ganesh");
		
		System.out.println("Map: "+map);
	}
}
