package raj_learning.day2.interfacedemo;

public class Test {
	public static void main(String []args) {
		
		Notification notification = new SMSNotification();
		notification.sendNotification();
		
		Notification not = new EmailNotifiation();
		not.sendNotification();
	}

}
