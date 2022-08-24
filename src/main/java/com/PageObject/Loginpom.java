package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {
	
	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@type=\"password\"]")
	private WebElement pass;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
		private WebElement login;

	public WebElement getEmail() {
		return email;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLogin() {
		return login;
	}

	

}
