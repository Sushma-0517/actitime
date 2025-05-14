package com.actitime.testscripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskListPage1;

public class createProjectMainMethod extends BaseClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./Data/Testcasesauto.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String un=wb.getSheet("createProject").getRow(1).getCell(3).getStringCellValue();
        //String pw=wb.getSheet("createProject").getRow(1).getCell(3).getStringCellValue();
		//		FileLib fileLibObj = new FileLib();
//		String custname = fileLibObj.getExcelData("createProject",1,3);
//		String descCust = fileLibObj.getExcelData("createProject",1,4);
		System.out.println(un);
		//System.out.println(pw);
		//System.out.println(descCust);
		
		
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
//		LoginPage l=new LoginPage(driver);
//		l.setLogin(un, pw);
//		Thread.sleep(2000);
//		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
//		e.settaskTab();
//		Thread.sleep(2000);
		TaskListPage1 t1=new TaskListPage1(driver);
		t1.setUser("HDFC", "Banking Project");
	}

}
