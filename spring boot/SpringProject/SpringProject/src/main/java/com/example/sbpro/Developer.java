package com.example.sbpro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer {
	
	@Autowired
	@Qualifier("desktop")
	private Computer comp;
	
	public void build()
	{
		System.out.println("SpringProject Developer is Working...");
		comp.compile();
	}

}
