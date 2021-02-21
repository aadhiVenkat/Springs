package org.spring.autowiringanotationsApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring_For_Annotation.xml");
		FlipkartController fc=(FlipkartController) context.getBean("fpc");
		fc.purchase();
	}

}
