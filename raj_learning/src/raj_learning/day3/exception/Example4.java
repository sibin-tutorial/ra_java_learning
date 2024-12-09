package raj_learning.day3.exception;

import java.net.InetAddress;

public class Example4 {
	
	public static void main(String []args) {
		
		//Check whether 'https://www.riet.net.in/' this website is Up or down
		
		try {
		InetAddress address = InetAddress.getByName("riet.net.in");
		boolean isUp = address.isReachable(2000);
		System.out.println(isUp);
		}catch(Exception e) {
			System.out.println("Inside catch block"+ e.getMessage());
		}
	}

}
