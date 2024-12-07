package raj_learning.day1;

public class Example6 {
	public static void main(String [] args) {
		//The example below uses the weekday number to calculate the weekday name:
        
		int day = 3;
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day");
		}

	}

}
