package raj_learning.day1;

/*
 * You can also create an object of a class and access it in another class. This is often used for better organization of classes (one class has all the attributes and methods,
 *  while the other class holds the main() method (code to be executed)).
 */
public class TestCollege {
	public static void main(String []args) {
		
		College clg = new College();
		System.out.println("College Name: "+clg.collegeName);
		System.out.println("Number of Students: "+clg.numberOfStudents);
		System.out.println("Number of college buses: "+clg.numberOfCollegeBuses);
		System.out.println("Number of class rooms"+ clg.numberOfClassRooms);
	}

}
