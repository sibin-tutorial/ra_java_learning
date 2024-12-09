package raj_learning.day3.exception;


//Exception handling with try catch
public class Example1 {

	
	public static void main(String []args) {
		
		
		int a = 4;
		int b = 0;
		
		try {
		int result = a/b;
		
		}catch(ArithmeticException e) {
			System.out.println("Inside first catch block "+e.getMessage());
		}catch(Exception e) {
			System.out.println("Inside second catch block "+ e.getMessage());
			System.out.println(e);
		}
	}
}
