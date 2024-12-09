package raj_learning.day3.exception;

public class Example2 {

	public static void main(String []args) {
		
		int [] integers = {9,11,2};
		
		try {
		int fourthElement = integers[4];
		}catch(ArithmeticException e) {
			System.out.println("Inside first cathc block: "+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside second catch block");
		}catch(Exception e) {
			System.out.println("Inside third catch block: "+ e.getMessage());
			System.out.println(e);
		}
	}
}
