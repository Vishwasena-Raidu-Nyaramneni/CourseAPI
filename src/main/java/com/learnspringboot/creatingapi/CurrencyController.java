package com.learnspringboot.creatingapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController 
{
	@Autowired
	private CurrencyServiceConfiguration config;
	
	@RequestMapping("/currency")
	public CurrencyServiceConfiguration retrieveAllCourses()
	{	
		return config;
	}
	
	@RequestMapping("/check")
	public String retrieveMessage()
	{	
		return "Hello World";
	}
}
