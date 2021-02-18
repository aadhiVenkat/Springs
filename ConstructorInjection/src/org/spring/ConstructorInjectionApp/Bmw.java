package org.spring.ConstructorInjectionApp;

import java.util.List;

public class Bmw implements ICar 
{
	private int id;
	private String color;	
	private Engine engine;
	private List<String> wheels;
	public Bmw(int id, String color, Engine engine, List<String> wheels) {
		this.id = id;
		this.color = color;
		this.engine = engine;
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
