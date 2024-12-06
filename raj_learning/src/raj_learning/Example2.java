package raj_learning;

//This class is used to learn variables
public class Example2 {

	public static void main(String[]args) {
		
		//Declaring a String variable with value 'India'
		//type variableName = value;
		String countryName = "India";
		
		//Print the country name on the console
		System.out.println(countryName);
		
		
		//To store number, we should use int variable
		int age = 19;
		
		//Print the age
		System.out.println(age);
		
		//You can also declare a variable without assigning the value, and assign the value later
		String name;
		name = "Aswathy";
		System.out.println(name);
		
		//if you assign a new value to an existing variable, it will overwrite the previous value:
		int number = 11;
		number = 20;
		System.out.println(number);
		
		//If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
		final float pi = 3.14f;
		System.out.println(pi);
		
		//Some variable declarations
		int myNumber = 34;
		boolean status = true;
		char albhabet = 'A';
		float f = 45.66f;
	
	}
}
