package org.spring.springApp;

public class HelloWorld //JAVA BEAN CLASS
{

	public HelloWorld() 
	{
		System.out.println("Hello World Object Created");
	}
	public String Message="Hi Welcome to Spring Session";
	
	public void displayMessage()
	{
		System.out.println(Message);
	}
}
