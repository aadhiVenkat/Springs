package org.spring.springApp2;

public class HelloWorld //JAVA BEAN CLASS
{

	public HelloWorld() 
	{
		System.out.println("Hello World Object Created");
	}
	private String Message="Hi Welcome to Spring Session";
	
	public void displayMessage()
	{
		System.out.println(Message);
	}
}
