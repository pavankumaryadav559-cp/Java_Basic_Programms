package com.notification_system_project;

public class PushNotificationService implements NotificationService {

	@Override
	public void send(String message,String recipient) {
		System.out.println("Sending push notification to " + recipient + ": " + message);
	}
}
