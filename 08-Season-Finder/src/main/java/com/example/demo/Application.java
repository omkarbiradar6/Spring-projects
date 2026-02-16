package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		//AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(SeasonService.class);
		SeasonService ss = (SeasonService)context.getBean(SeasonService.class);
		
		System.out.println("enter a number"); 
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		System.out.println(ss.getSeason(n)); 
		
		
	}

}
