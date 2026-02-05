package com.example.demo;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements  Engine{

	@Override
	public String getEngineType() {
		// TODO Auto-generated method stub
		return "Diesel";
	}

}
