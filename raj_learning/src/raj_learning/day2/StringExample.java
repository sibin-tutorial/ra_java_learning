package raj_learning.day2;

//Java String
//A String variable contains a collection of characters surrounded by double quotes:
public class StringExample {

	public static void main(String[]args) {
		
		//Declaring a string
		String name = "Rahul";
		System.out.println(name);
		
		//Find the length of string 'name' using length method
		int lengthOfName = name.length();
		System.out.println(lengthOfName);
		
		//Convert first letter of a sTRING TO LOWERCASE
		String lName = name.toLowerCase();
		System.out.println(lName);
		
		char secondPosition = name.charAt(2);
		System.out.println(secondPosition);// h
		
		String str1 = "tom";
		String str2 = "Tom";
		
		boolean checkEquality = str1.equals(str2);
		System.out.println(checkEquality); //false
		
		boolean checkEqualityIgnoreCase = str1.equalsIgnoreCase(str2);
		System.out.println(checkEqualityIgnoreCase); //true
		
		
	}
}
