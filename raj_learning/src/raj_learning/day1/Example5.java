package raj_learning.day1;

public class Example5 {
	public static void main(String []args) {
		
		//Use the if statement to specify a block of Java code to be executed if a condition is true.
        //Program to check whether your age is greater than 18 or not
		
		int age = 18;
		if(age>=18) {
			System.out.println("You are eligible for voting");
		}
		
		
		//Test two variables
		int num1 = 9;
		int num2 = 7;
		if(num1>num2) {
			System.out.println(num1 + " is greater than "+ num2);
		}
		
		//Use the else statement to specify a block of code to be executed if the condition is false.
        int age1 = 17;
        if(age1>18) {
        	System.out.println("You are eligible for voting");
        }
        else {
        	System.out.println("You are not eligible for voting");
        }

        
        //Use the else if statement to specify a new condition if the first condition is false.
        //Program to find largest of three numbers
        int ab = 5;
        int bc = 10;
        int cd = 20;
        if(ab>bc && ab>cd) {
        	System.out.println(ab + " is the greatest number");
        }
        else if(bc>ab && bc>cd) {
        	System.out.println(bc + " is the greatest number");
        }
        else {
        	System.out.println(cd+ " is the greatest number");
        }

        //Ternary operator example
        int age2 = 17;
     
        
        String result = (age2>18)?"You are eligble for voting":"You are not eligible for voting";
        System.out.println(result);	
	
	}

}
