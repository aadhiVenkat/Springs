package org.spring.ConstructorInjectionApp;

import java.util.List;

public class Audi implements ICar
{
	private int id;//Primitive type Injection//
	private String color; 	
	private Engine engine; //Class Type Injection//
	private List<String> wheels; //Collection Type Injection//
	
	public Audi(int id, String color, Engine engine, List<String> wheels) {
		super();
		this.id = id;
		this.color = color;
		this.engine = engine;
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
