package raj_learning.day1;

public class Example8 {
public static void main(String []args) {
	
	//break
	//This example stops the loop when i is equal to 6:
	
	for(int i = 1;i<=10;i++) {
		if(i==6) {
			break;
		}
		System.out.println(i);
		
	}
	
	System.out.println(" ");
	
	//continue
	//This example skips the value of 4:
	for(int j = 1;j<=10;j++) {
		if(j ==4) {
			continue;
		}
		System.out.println(j);
	}
}
}
