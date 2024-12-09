package raj_learning.day3.exception;

//finally keyword
public class Example3 {
	
	public static void main(String []args) {
		
		//Case 1
		try {
		int s = 3/0;
		System.out.println(s);
		}catch(Exception e) {
			System.out.println("Inside catch block");
		}finally {
			System.out.println("This block of code will always execute");
		}
		
		System.out.println(" ");
		//case 2
		int a = 6/3;
		try {
		System.out.println(a);
		}catch(Exception e) {
			System.out.println("Inside catch block");
		}finally {
			System.out.println("This block of code will always execute");
		}
	}

}
