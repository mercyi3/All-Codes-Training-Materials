package com.example.sbpro;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer 
{
	public void compile()
	{
		System.out.println("Compile method in Laptop...");
	}
}
