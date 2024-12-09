package raj_learning.day3.multithreading;

//How to create a thread
//1. By extending Thread class
public class Example1 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String []args) {
		
		Example1 ex = new Example1();
		ex.run();
	}
}
