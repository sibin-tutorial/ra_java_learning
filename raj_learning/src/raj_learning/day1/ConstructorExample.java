package raj_learning.day1;

public class ConstructorExample {

	int age;
	
	//Special method(default constructor)
	public ConstructorExample() {
		System.out.println("Constructor is called");
		age = 19;
	}
	
	//Parameterized constructor
	public ConstructorExample(int age1) {
		age = age1;
	}
	
	//You can have as many parameters as you want:
	//Here we have two parameters a and
	public ConstructorExample(int a, String str) {
		
		System.out.println("a= "+a);
		System.out.println("str= "+str);
	}
	
	public static void main(String []args) {
		ConstructorExample ex = new ConstructorExample();
	
		System.out.println(ex.age);
		
		ConstructorExample ex1 = new ConstructorExample(3);
		System.out.println(ex1.age);
		
		ConstructorExample ex2 = new ConstructorExample(3,"Rohit");
		
	}
}
