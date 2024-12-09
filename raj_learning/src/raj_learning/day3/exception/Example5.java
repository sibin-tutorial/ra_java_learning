package raj_learning.day3.exception;

//throw keyword example
public class Example5 {
	
	public static void main(String []args) {
		
		int age = 7;
		
		if(age>18) {
			System.out.println("You are eligible for voting");
		}
		else {
			//throw keyword is used to throw Exception explicitly
			throw new RuntimeException("You are not eligible for voting");
		}
	}

}
