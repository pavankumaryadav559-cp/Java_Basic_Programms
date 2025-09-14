package com.notification_system_project;

public class EmailNotificationService implements NotificationService {
   
	@Override
	public void send(String message,String recipient) {
		System.out.println("Sending email to " + recipient + ": " +message);
	}
	
}
