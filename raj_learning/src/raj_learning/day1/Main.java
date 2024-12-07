package raj_learning.day1;

//Classes and Objects
public class Main {


	
	//static attribute
	static int aNumber = 134;
	
	// attribute or field
	int number = 9;
	String str = "India";
	
	//If you don't want the ability to override existing values, declare the attribute as final:
	final float pi = 3.14f;
	
	
	public static void main(String []args) {
		
		//Create an Object
		Main myObj = new Main();
		
		//You can access attributes by creating an object of the class, and by using the dot syntax (.):
		System.out.println(myObj.number);
		System.out.println(myObj.str);
		
		//You can create multiple objects of one class:
		Main myObj1 = new Main();// Second object of main class
		Main myOnj2 = new Main();//Third object of main class
		
		//You can access attributes by creating an object of the class, and by using the dot syntax (.):
		System.out.println(myObj1.number);
		System.out.println(myOnj2.str);
		
		//Modifying number attribute
		myObj.number = 11;
		System.out.println(myObj.number);
		System.out.println(myObj1.number);
		
		System.out.println(aNumber);
	}
}
