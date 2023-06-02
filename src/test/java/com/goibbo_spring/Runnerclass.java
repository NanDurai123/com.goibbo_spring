package com.goibbo_spring;

import org.testng.annotations.Test;

import com.goibbo_springsamp.Baseclass;
import com.goibbo_springsamp.PomClass;

public class Runnerclass extends Baseclass {
	PomClass pom = new PomClass(driver);

	
	@Test(priority=2)
	public void flightticket() {
		browserlaunch("chrome");
		pom= new PomClass(driver);
		System.out.println("Launch browser");
		}
	
	@Test(priority=3)
		private void urlmethod() {
			
		urlLaunch("https://www.goibibo.com/flight-review/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!602838584772!e!goibibo!c!&gad=1&gclid=Cj0KCQjwmtGjBhDhARIsAEqfDEdPVcck9d0iuGeDNTt8oOO8-mumxQPkhZkw6rrNel8Ll_c75wNzekEaAonFEALw_wcB&t=0dbf57e6cd50359699914edab34a641a05815feb");
		System.out.println("url launched");
		}
	@Test(priority=4)
		private void assured() {
			
			clickOnElement(pom.getAssured());
		}
	@Test(priority=5)
	private void biilingaddress() {
		
		System.out.println("wecome");

		inputValues(pom.getBilligaddress(), "chennai");
		inputValues(pom.getPincode(), "631205");
		dropDown(pom.getSelectstate(), "text", "tamilnadu");
		clickOnElement(pom.getBiilingandsave());
		
	}
	@Test(priority=6)
		private void adultdetail() {
			clickOnElement(pom.getAddult1());
			dropDown(pom.getAdulttitle1(), "index", "1");
			inputValues(pom.getFirstandmiddle1(), "lakshith");
			inputValues(pom.getLastname1(), "durai");
			clickOnElement(pom.getAddult2());
			dropDown(pom.getAdulttitle2(), "index","2");
			inputValues(pom.getFirstandmidname2(), "samrith");
			inputValues(pom.getLastname2(),"durai" );
			clickOnElement(pom.getAddulttitle3());
			dropDown(pom.getAddulttitle3(), "index","3");
			inputValues(pom.getFirstandmidname3(), "Nanadhini");
			inputValues(pom.getLastname3(),"durai" );
			clickOnElement(pom.getAddulttitle4());
			dropDown(pom.getAddulttitle4(), "index","3");
			inputValues(pom.getFirstandmidname4(), "Nanadhini");
			inputValues(pom.getLastname4(),"durai" );

		}
		
	
		@Test(priority=7)
		private void details() {
			inputValues(pom.getEmail(),"nandhu.natarajan1991@gmail.com");
			dropDown(pom.getSelectnation(),"index","0");
			inputValues(pom.getMobilenumber(),"6380274102" );
			
		}
		@Test(priority=8)
		private void proceed() {
			clickOnElement(pom.getProceedclick());

		}
				
	}






