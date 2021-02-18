package org.spring.ConstructorInjectionApp;

public class Engine 
{
	private int engine_number;
	private int engine_power;
	private String type;
	public Engine(int engine_number, int engine_power, String type) 
	{
		this.engine_number = engine_number;
		this.engine_power = engine_power;
		this.type = type;
	}
	@Override
	public String toString()
	{
		String Engine_Details="\nEngine Number:"+engine_number+"\n Engine Power:"+engine_power+"\n Engine Type:"+type; 
		return Engine_Details;
	}
}
