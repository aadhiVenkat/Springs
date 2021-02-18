package org.spring.SetterInjectionApp;

import java.util.List;

public class Audi implements ICar
{
	private int id;//Primitive type Injection//
	private String color; 	
	private Engine engine; //Class Type Injection//
	private List<String> wheels; //Collection Type Injection//
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public List<String> getWheels() {
		return wheels;
	}
	public void setWheels(List<String> wheels) {
		this.wheels = wheels;
	}
	@Override
	public void drive() 
	{
		System.out.println("\n\nAUDI Car Details Below");
		System.out.println("----------------------------");
		System.out.println("AUDI Id: "+id);
		System.out.println("AUDI Color: "+color);
		System.out.println("AUDI Engine Details: "+engine);
		System.out.println("AUDI Wheel: "+wheels);
		System.out.println("----------------------------");
		System.out.println("Driving AUDI Happily!!!!!!!");
	}

}
