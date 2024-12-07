package raj_learning.day2.inheritence;

//child or derived or subclass
//Here we inherited fields and methods from parent class Vehicle
public class Car extends Vehicle{

	public int numberOfWheel = 4;
	
	public static void main(String []args) {
		
		Car c = new Car();
		System.out.println(c.hasTyre);
		c.move();
		System.out.println(c.numberOfWheel);
	}
	
}
