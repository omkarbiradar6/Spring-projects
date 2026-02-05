
package com.example.demo;

public class Truck implements Vehicle
{

	private Engine engine;
	private int payload_capacity;
	
	


	public Truck(Engine engine, int payload_capacity)
	{
	
		this.engine = engine;
		this.payload_capacity = payload_capacity;
	}




	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Truck is having "+ engine.getEngineType() +"and "+payload_capacity;
	}

}
