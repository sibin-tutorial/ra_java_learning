package raj_learning.day2.polymorphism;

public class Dog extends Animal{
	
	@Override//override annotaion optional
	public void sleep() {
		System.out.println("Dog sleeping");
	}
	
	public static void main(String []args) {
		Dog dog = new Dog();
		dog.sleep();
		
		Animal animal = new Dog();
		animal.sleep();
		
		Animal animal1 = new Animal();
		animal1.sleep();
	}

}
