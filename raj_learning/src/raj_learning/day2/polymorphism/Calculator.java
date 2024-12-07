package raj_learning.day2.polymorphism;

//polymorphism example 1
public class Calculator {

	//This is called method overloading
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sum(float a, float b) {
		System.out.println(a+b);
	}
	
	public void sum(long a, long b) {
		System.out.println(a+b);
	}
	
	public static void main(String []args) {
		
		Calculator c = new Calculator();
		c.sum(3, 4);
		c.sum(4.5f, 5.6f);
		c.sum(1234567l, 123456789l);
	}
}
