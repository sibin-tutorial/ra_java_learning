package raj_learning.day2.encapsulation;

public class Main {
	
	public static void main(String[]args) {
		User userObj = new User();
		userObj.setName("Athira");
		userObj.setEmail("athira@gmail.com");
		
		System.out.println("User name= "+userObj.getName());
		System.out.println("Email= "+userObj.getEmail());
	}

}
