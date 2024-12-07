package raj_learning.day2.interfacedemo;

/*
 * To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). 
 * The body of the interface method is provided by the "implement" class:
 */
public class SMSNotification implements Notification{

	@Override
	public void sendNotification() {
		System.out.println("Sending SMS...");
		
	}

}
