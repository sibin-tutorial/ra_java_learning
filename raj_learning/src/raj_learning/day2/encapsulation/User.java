package raj_learning.day2.encapsulation;

//Achihieving 100% encapsulation
public class User {
	
	//Make fileds or attributes as private
	private String name;
	private String email;// private modifier: restrict access level to same class
	
    //Getter method for String 'name'
	public String getName() {
		return name;
	}
	
	//Getter method for String 'email'
	public String getEmail() {
		return email;
	}
	
	//Setter method for 'name'
	public void setName(String name) {
		this.name = name;//THIS KEYWORD IS USED TO INVOKE CURRENT CLASS INSTANCE VARIABLE(ATTRIBUTE OR FIELD)
	}
	
	//Setter method for 'email'
	public void setEmail(String email) {
		this.email = email;
	}
}
