package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService 
{

	 @Autowired
	VehicleFactory vehicleFactory;
	 
	
	public String createVehicle(String type, String engineType) {
		// TODO Auto-generated method stub
		return vehicleFactory.createVehicle(type, engineType).getDescription();
	}

}
