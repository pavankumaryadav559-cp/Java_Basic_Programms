package com.notification_system_project;

public class SMSNotificationService implements NotificationService {

	@Override
	public void send(String message,String recipient) {
		System.out.println("Sending SMS to " + recipient + ": " +message);
	}
}
