package com.goibbo_springsamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pomodel {
	public WebDriver driver;
	private PomClass pom2;
	public PomClass getpomclass() {
		if(pom2==null)
		{
			pom2=new PomClass(driver);
		}
		return pom2;
		
	}
	public Pomodel(WebDriver dri) {
		this.driver =dri;
		PageFactory.initElements(driver, this);
		
	}
}
