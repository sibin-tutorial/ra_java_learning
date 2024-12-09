package raj_learning.day3.multithreading;

//2. By implementing runnable interface
public class Example2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is running");
		
	}
	
	public static void main(String []args) {
		
		Example2 ex = new Example2();
		Thread th = new Thread(ex);
		th.run();
	}

}
