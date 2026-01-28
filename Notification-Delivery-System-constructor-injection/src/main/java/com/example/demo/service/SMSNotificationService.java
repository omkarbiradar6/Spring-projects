package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSNotificationService   implements NotificationService{
	@Override
	public void sendNotification(String message)
	{
		// TODO Auto-generated method stub
		
        System.out.println("SMS sent: " + message);

	}
}
