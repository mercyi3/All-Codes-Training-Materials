package com.example.sbpro;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

	public void compile()
	{
		System.out.println("Compile method in Desktop...");
	}
}
