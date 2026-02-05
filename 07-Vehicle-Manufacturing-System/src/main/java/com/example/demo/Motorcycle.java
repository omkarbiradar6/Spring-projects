
package com.example.demo;

public class Motorcycle implements Vehicle
{

	private  Engine engine;
	private boolean sidecar;
	
	public Motorcycle(Engine engine, boolean sidecar) {
		super();
		this.engine = engine;
		this.sidecar = sidecar;
	}


	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Motorcycle is "+engine.getEngineType()+"sidecar is "+sidecar;
	}

}
