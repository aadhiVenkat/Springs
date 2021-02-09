package org.spring.springApp2;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

	public static void main(String[] args) throws IOException
	{
		//USING ApplicationContest Interface
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		//HELLOW WORLD OBJECT IS CREATED PREREQUISITES
		System.out.println("Spring Object");
		HelloWorld hw=(HelloWorld) context.getBean("hello1");
		hw.displayMessage();
		System.out.println(hw.hashCode());
		
		HelloWorld hw1=(HelloWorld) context.getBean("hello1");
		hw1.displayMessage();
		System.out.println(hw1.hashCode()+"\n");
		
		System.out.println("Java Object");
		HelloWorld hw2=new HelloWorld();
		hw2.displayMessage();
		System.out.println(hw2.hashCode());
		
		HelloWorld hw3=new HelloWorld();
		hw3.displayMessage();
		System.out.println(hw3.hashCode());
	}
}
