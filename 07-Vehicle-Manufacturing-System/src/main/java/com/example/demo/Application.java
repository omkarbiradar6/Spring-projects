package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import confg.AppConfig;

//@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac= new AnnotationConfigApplicationContext(AppConfig.class);
		VehicleService vs = (VehicleService) acac.getBean(VehicleService.class);
		System.out.println(vs.createVehicle("car", "electric"));
//		vs.createVehicle("truck", "disel");
//		vs.createVehicle("motorcycle", "electric");
	}

}
