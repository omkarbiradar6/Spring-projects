package com.example.demo;

public class Car implements Vehicle
{

	private Engine  engine;
	private int num_of_doors;
	
	
	
	public Car(Engine engine, int num_of_doors) {
		super();
		this.engine = engine;
		this.num_of_doors = num_of_doors;
	}



	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Car is having "+engine.getEngineType() +" having"+num_of_doors;
	}

}
