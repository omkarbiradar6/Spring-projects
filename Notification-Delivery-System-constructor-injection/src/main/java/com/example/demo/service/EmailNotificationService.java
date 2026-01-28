package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailNotificationService  implements NotificationService
{
	@Override
	public void sendNotification(String message)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Email sent: " + message);
	}
	
}
