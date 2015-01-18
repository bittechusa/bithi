package com.cars.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest 
{
	RemoteWebDriver dr;
	
	@Before
	public void start() throws Exception
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		//dr = new FirefoxDriver();
		dr = new RemoteWebDriver(new URL("http://192.168.1.28:4444/wd/hub"), cap.firefox());
		dr.get("http://www.cars.com");
	}
	
	@After
	public void close()
	{
		dr.quit();
	}

}
