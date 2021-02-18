package org.spring.SetterInjectionApp;

public class Engine 
{
	private int engine_number;
	private int engine_power;
	private String type;
	
	public int getEngine_number() {
		return engine_number;
	}

	public void setEngine_number(int engine_number) {
		this.engine_number = engine_number;
	}

	public int getEngine_power() {
		return engine_power;
	}

	public void setEngine_power(int engine_power) {
		this.engine_power = engine_power;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString()
	{
		String Engine_Details="\nEngine Number:"+engine_number+"\n Engine Power:"+engine_power+"\n Engine Type:"+type; 
		return Engine_Details;
	}
}
