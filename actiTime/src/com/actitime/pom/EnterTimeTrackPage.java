package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(id="logoutLink")
	private WebElement logOut;
	
	@FindBy(id="//div[text()='TASKS']")
	private WebElement taskTab;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void setLogout()
	{
		logOut.click();
	}
	
	public void settaskTab()
	{
		taskTab.click();
	}
		
}
