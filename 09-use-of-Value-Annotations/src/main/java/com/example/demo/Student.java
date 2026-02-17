package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("${student.name}")
	private String name;
	@Value("${student.age}")
	private int age;
	@Value("${student.course}")
	private String course;
	@Value("${student.fee}")
	private int fee;
	
	
	public void printDetails()
	{
		System.out.println(name+" "  +age+ " "+course+ " "+fee);
		
	}
	
	
	
	
	
	
	

}
