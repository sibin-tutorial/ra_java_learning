package raj_learning.day2.abstraction;


public class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("meow");
	}

	public static void main(String []args) {
		//Animal animal = new Animal();//We cannot create an object of abstract class
        Animal animal = new Cat();
        animal.walk();
        animal.sound();
        
	}
}
