package com.cars.test;

import org.junit.Test;

public class SmokeTest extends BaseTest
{
	
	public void searchCar()
	{
		System.out.println("I am now at searchcar method");
	}
	
	@Test
	public void buyCar()
	{
		System.out.println("I am now at buycar method");
	}
	
	@Test
	public void researchCar()
	{
		System.out.println("I am now at researchcar method");
		
	}
	
	@Test
	public void sellCar()
	{
		System.out.println("I am now at sell car method");
	}


}
