package com.actitime.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreationProject {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.className("createNewProject")).click();
	boolean	b=driver.findElement(By.id("projectPopup_content")).isDisplayed();
	if(b==true)
	{
	System.out.println("Project popup is displayed");
	}
	else
	{
	System.out.println("Project popup is not displayed");
	}
driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("QSP");
driver.findElement(By.xpath("//button[contains(text(),'Select Customer to Add Project')]")).click();
driver.findElement(By.xpath("//a[text()='Boston Chocolate']")).click();
driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("done");
driver.findElement(By.xpath("//span[text()='Create Project']")).click();
 String text = driver.findElement(By.className("class=innerHtml")).getText();
 System.out.println(text);
 driver.findElement(By.id("logoutLink"));
 driver.quit();


}
}
