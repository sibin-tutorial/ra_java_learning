package raj_learning.day3.collection;

import java.util.HashMap;

//HashMap
public class Example2 {

	public static void main(String []args) {
		
		//Creating an HashMap object
		//Here key is an Integer and value is an String
		HashMap<Integer,String> map = new HashMap<>();
		
		//Adding values to the hashmap
		//Using put method
		map.put(8, "Asif");
		map.put(59, "Shreshta");
		map.put(29, "Gowri");
		
		System.out.println(map);
		
		//Accessing an element
		String name = map.get(8);
		System.out.println(name);
		
		//Remove an element using remove method
		map.remove(8);
		
		System.out.println(map);
		
		System.out.println(" ");
		
		//Loop through hashmap key
		for(Integer in:map.keySet()) {
			System.out.println(in);
		}
		
		System.out.println(" ");
		
		//Loop through hashmap value
		for(String str: map.values()) {
			System.out.println(str);
		}
	}
}
