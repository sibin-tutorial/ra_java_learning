package raj_learning.day2.interfacedemo;

public class EmailNotifiation implements Notification{

	@Override
	public void sendNotification() {
		System.out.println("Sending email...");
	}

}
