package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.service.NotificationManager;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        NotificationManager manager =
                context.getBean(NotificationManager.class);

        manager.notifyUser("Hello Omkar 🚀");
    }
}
