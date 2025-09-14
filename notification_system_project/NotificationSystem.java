package com.notification_system_project;

public class NotificationSystem {

	public static void main(String[] args) {
		 NotificationService emailService = new EmailNotificationService();
	        NotificationService pushService = new PushNotificationService();
	        NotificationService smsService = new SMSNotificationService();

	        emailService.send("Welcome to our service!", "user@example.com");
	        pushService.send("You have a new alert!", "userDeviceToken123");
	        smsService.send("Your OTP is 123456", "+1234567890");
	}

}
