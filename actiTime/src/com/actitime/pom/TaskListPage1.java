package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage1 {
	@FindBy (xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy (className="createNewProject") 
	private WebElement createNewProjectBtn;
	
	@FindBy (id="projectPopup_content")
	private WebElement proPopDisplay;
	
	@FindBy (className="projectNameField inputFieldWithPlaceholder")
	private WebElement projectNameTbx;
	
	@FindBy (xpath="//button[contains(text(),'Select Customer to Add Project")
	private WebElement selectCustBtnDisplay;
	
	
	@FindBy (id="projectPopup_projectDescriptionField")
	private WebElement proDescField;
	
	@FindBy (xpath="//span[text()='Create Project")
	private WebElement createProBtn;
	
	@FindBy (className="class=innerHtml")
	private WebElement displayText;
	
	WebDriver driver;
	
	public TaskListPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void getExcelData()
//	{
//		projectNameTbx.sendKeys("custname");
//		proDescField.sendKeys("descCust");	
//	}
	public void setUser(String nameBtn, String proDesBtn)
	{
		projectNameTbx.sendKeys(nameBtn);
		selectCustBtnDisplay.click();
		proDescField.sendKeys(proDesBtn);
		createProBtn.click();
	}
				
	}
	

