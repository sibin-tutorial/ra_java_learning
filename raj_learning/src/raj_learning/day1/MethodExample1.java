package raj_learning.day1;

public class MethodExample1 {
	
	/*
	 * return type: int
	 * parameters: a and b
	 * method name: sum
	 */
	public int sum(int a, int b) {
		
		int s = a + b;
		return s;
	}
	
	//Area of a circle
	/*
	 * return type double
	 * parameter radius
	 */
	public double areaOfACircle(double radius) {
		
		double area = 3.14 * radius * radius;
		return area;
	}

	public static void main(String []args) {
		MethodExample1 ex = new MethodExample1();
		
		int sum = ex.sum(4, 5);
		System.out.println(sum);
		
		double radius = 4.4;
		double area = ex.areaOfACircle(radius);
		System.out.println(area);
	}
}
