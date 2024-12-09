package raj_learning.day3.exception;


//Custom exception
public class InValidAgeException extends Exception{
	
	public InValidAgeException(String message) {
		super(message);//super keyword is used to invoke parent class constructor
	}

}
