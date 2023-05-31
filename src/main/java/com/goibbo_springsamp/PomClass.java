
package com.goibbo_springsamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	public WebDriver driver;

	@FindBy(xpath = "//button[@color='#2a76e3']")
	private WebElement assured;
	
	@FindBy(xpath = "//span[@class='sc-jxOSlx hDFeQG']")
	private WebElement billigaddress;
	
	@FindBy(id = "Pincode")
	private WebElement pincode;
	
	@FindBy(xpath = "//p[@class='sc-hknOHE dIaXaQ']")
	private WebElement selectstate;
	
	@FindBy(xpath = "//span[@class='sc-jxOSlx hDFeQG']")
	private WebElement biilingandsave;
	
	public WebElement getBiilingandsave() {
		return biilingandsave;
	}
	@FindBy(xpath = "padL20 padR20 font14")
	private WebElement addult1;
	
	@FindBy(xpath = "//span[@class='sc-jxOSlx hDFeQG']")
	private WebElement confirmandsave;
	
	@FindBy(xpath = "//div[@class='padR10']")
	private WebElement adulttitle1;
	
	
	@FindBy(name = "givenname")
	private WebElement firstandmiddle1;
	
	@FindBy(name = "lastname")
	private WebElement lastname1;
	
	@FindBy(xpath ="(//div[@class='dF'])[3]")
	private WebElement addult2;
	
	@FindBy(xpath = "//div[@class='padR10']")
	private WebElement adulttitle2;
	
	@FindBy(name = "givenname")
	private WebElement firstandmidname2;
	
	@FindBy(xpath ="lastname")
	private WebElement lastname2; 
	
	@FindBy(xpath = "(//div[@class='dF'])[4]")
	private WebElement addult3;
	
	@FindBy(xpath = "//div[@class='padR10']")
	private WebElement addulttitle3;
	
	@FindBy(name = "givenname")
	private WebElement firstandmidname3;
	
	@FindBy(xpath ="lastname")
	private WebElement lastname3; 
	@FindBy(xpath = "(//div[@class='dF'])[5]")
	private WebElement addult4;
	
	@FindBy(xpath = "//div[@class='padR10']")
	private WebElement addulttitle4;
	
	@FindBy(name = "givenname")
	private WebElement firstandmidname4;
	
	@FindBy(xpath ="lastname")
	private WebElement lastname4; 
	
	@FindBy(name = "email")
	private WebElement email;
	
	@FindBy(xpath = "//select[@class='common-elementsstyles__CustSelectTrvl-sc-ilw4bs-9 gKEKED']")
	private WebElement selectnation;
	
	@FindBy(name = "name")
	private WebElement mobilenumber;
	
	@FindBy(xpath = "//button[@class='dweb-commonstyles__FltBtn-sc-13fxsy5-12 bWfuav fb quicksand wid25 font16']")
	private WebElement proceedclick;

	public WebElement getAssured() {
		return assured;
	}

	public WebElement getBilligaddress() {
		return billigaddress;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getSelectstate() {
		return selectstate;
	}

	public WebElement getAddult1() {
		return addult1;
	}

	public WebElement getConfirmandsave() {
		return confirmandsave;
	}

	public WebElement getAdulttitle1() {
		return adulttitle1;
	}

	public WebElement getFirstandmiddle1() {
		return firstandmiddle1;
	}

	public WebElement getLastname1() {
		return lastname1;
	}

	public WebElement getAddult2() {
		return addult2;
	}

	public WebElement getAdulttitle2() {
		return adulttitle2;
	}

	public WebElement getFirstandmidname2() {
		return firstandmidname2;
	}

	public WebElement getLastname2() {
		return lastname2;
	}

	public WebElement getAddult3() {
		return addult3;
	}

	public WebElement getAddulttitle3() {
		return addulttitle3;
	}

	public WebElement getFirstandmidname3() {
		return firstandmidname3;
	}

	public WebElement getLastname3() {
		return lastname3;
	}

	public WebElement getAddult4() {
		return addult4;
	}

	public WebElement getAddulttitle4() {
		return addulttitle4;
	}

	public WebElement getFirstandmidname4() {
		return firstandmidname4;
	}

	public WebElement getLastname4() {
		return lastname4;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSelectnation() {
		return selectnation;
	}

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getProceedclick() {
		return proceedclick;
	}
	 public PomClass(WebDriver dri) {
		 driver=dri;
		 PageFactory.initElements(driver, this);
		
	 }
	
	
}
