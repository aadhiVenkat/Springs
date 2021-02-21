package org.spring.autowiringStereotypeAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Furniture 
{
	public void sofa()
	{
		System.out.println("Sofa made by Stanly");
	}
}
