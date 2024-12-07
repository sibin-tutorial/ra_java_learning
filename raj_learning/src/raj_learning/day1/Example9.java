package raj_learning.day1;

public class Example9 {
	public static void main(String[]args) {
		//To declare an array, define the variable type with square brackets:
		String [] fruits;
		
		//Declaring array of integers
		int [] numbers = {1,2,3,4,5,6,70,8,9};
		
		//Access the first element of the array numbers
		int num1 = numbers[0];//1
		System.out.println(num1);
		
		
		//To change first element of an array to 11
		numbers[0] = 11;
		System.out.println(numbers[0]);
		
		//The length of numbers array using length property
		System.out.println(numbers.length);
	}

}
