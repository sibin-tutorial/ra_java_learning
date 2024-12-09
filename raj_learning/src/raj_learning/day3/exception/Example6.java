package raj_learning.day3.exception;


//Testing custom exception
public class Example6 {
	public static void main(String []args)  {
		int age = 11;
		
		try {
		if(age<18) {
			throw new InValidAgeException("You are not eligible for voting");
			
		}else {
			System.out.println("You are eligibile for voting");
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
