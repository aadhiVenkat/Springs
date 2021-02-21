package org.spring.autowiringStereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		FlipkartController fc=(FlipkartController) context.getBean(FlipkartController.class);
		fc.purchase();
	}

}
