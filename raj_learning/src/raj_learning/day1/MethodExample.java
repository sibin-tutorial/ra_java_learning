package raj_learning.day1;


//Java method or function examples
public class MethodExample {
	
	//This is a non static method, you need to create an object of this class to call this method
	public void doAnotherStuff() {
		System.out.println("I am doing another stuff");
	}
	
	//Static method
	public static void doStuff() {

		System.out.println("I am doing stuff");
}
	
	
	// Create a method and add a parameter
	public void printStuff(String name) { //Here parameter is name
		System.out.println(name);
		
	}
	
	
	
	//Multiple parameterised method
	public void sum(int a, int b) {// Here we added two parameter a and b
		System.out.println(a+b);
		
	}
	
	public static void main(String []args) {
		
		//To call static method yo dont need to create the object of a class
		doStuff();
		
		MethodExample mx = new MethodExample();// class name, variable name, new keyword, constructor 
		mx.doAnotherStuff();
		mx.printStuff("Rahul");
		mx.sum(3, 5);
		
		
	}
	
}