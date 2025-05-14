package com.actitime.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

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
driver.findElement(By.className("createNewCustomer")).click();
boolean  b=driver.findElement(By.id("customerLightBox_content")).isDisplayed();
if(b==true)
{
	System.out.println("Popup is displayed");
}
else
{
System.out.println("popup is not displayed");
}
driver.findElement(By.id("customerLightBox_nameField")).sendKeys("ABCD");
driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("ABCD");
driver.findElement(By.className("x-btn-center")).click();
driver.findElement(By.linkText("Our Company")).click();
driver.findElement(By.id("customerLightBox_commitBtn")).click();
String text=driver.findElement(By.className("innerHtml")).getText();//INSPECT---GO TO SOURCE-----CLICK ON PAUSE----IN FIND TEXT BOX, WRITE CONTAINS FUNCTION----USING THE TEXT
System.out.println(text);
driver.findElement(By.id("logoutLink")).click();
driver.quit();

	}

}
