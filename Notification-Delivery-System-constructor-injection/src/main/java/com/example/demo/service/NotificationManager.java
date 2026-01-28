package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service

public class NotificationManager{

	
	
 
	private NotificationService notificationService;
	
	public NotificationManager(@Qualifier("emailService") NotificationService notificationService)
	{
		this.notificationService = notificationService;
	}
	
	public void notifyUser(String msg)
	{
		notificationService.sendNotification(msg);
	}
	

	
}
