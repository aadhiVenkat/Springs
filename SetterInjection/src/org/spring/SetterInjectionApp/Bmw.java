package org.spring.SetterInjectionApp;

import java.util.List;

public class Bmw implements ICar 
{
	private int id;
	private String color;	
	private Engine engine;
	private List<String> wheels;
	
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
	public void drive() {
		System.out.println("BMW Car Details Below");
		System.out.println("----------------------------");
		System.out.println("BMW Id: "+id);
		System.out.println("BMW Color: "+color);
		System.out.println("BMW Engine Details: "+engine);
		System.out.println("BMW Wheel: "+wheels);
		System.out.println("----------------------------");
		System.out.println("Driving BMW Happily!!!!!!!");
		
	}

}
