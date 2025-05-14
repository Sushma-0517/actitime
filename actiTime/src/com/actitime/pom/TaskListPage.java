package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy (xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy (className="createNewCustomer") 
	private WebElement createNewCustomerBtn;
	
	@FindBy (id="customerLightBox_nameField")
	private WebElement customerNameTbx;
	
	@FindBy (id="customerLightBox_descriptionField")
	private WebElement customerDescTbx;
	
	@FindBy (className="x-btn-center")
	private WebElement companyDropdown;
	
	@FindBy (linkText="Our Company")
	private WebElement ourCompanyOption;
	
	@FindBy (id="customerLightBox_commitBtn")
	private WebElement createCustButton;
	
	@FindBy (className="innerHtml")
	private WebElement displayText;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
