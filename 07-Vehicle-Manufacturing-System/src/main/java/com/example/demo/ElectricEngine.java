package com.example.demo;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricEngine implements  Engine {

	@Override
	public String getEngineType() {
		// TODO Auto-generated method stub
		return "Electric";
	}

}
