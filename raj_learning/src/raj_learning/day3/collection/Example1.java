package raj_learning.day3.collection;

import java.util.ArrayList;

//ArrayList
public class Example1 {

	
	public static void main(String []args) {
		
		
		/*
		 * Warpper classes
		 * int: Integer
		 * long: Long
		 * byte: Byte
		 * short: Short
		 * double: Double
		 * float: Float
		 * boolean: Boolean
		 * char: Character
		 */
		//Creating an arraylist
		
		ArrayList<Integer> integers = new ArrayList<>();
		
		
		//adding elements to array list using add method
		integers.add(3);
		integers.add(9);
		integers.add(11);
		System.out.println(integers);
		
		//Access element using get() method
		int aElement = integers.get(0);
		System.out.println(aElement);
		
		//change an element using set method
		integers.set(0,5);
		
		int aEl = integers.get(0);
		System.out.println(aEl);
		
		//Remove an element from arraylist
		integers.remove(1);
		
		System.out.println(integers);
		
		//size of an array list
		System.out.println(integers.size());
		System.out.println(" ");
		
		//loop through an arraylist
		for(int i=0;i<integers.size();i++) {
			System.out.println(integers.get(i));
		}
		
		System.out.println(" ");
		//Enhanced for loop
		for(Integer in:integers) {
			System.out.println(in);
		}
	}
}
