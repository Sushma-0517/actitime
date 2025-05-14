package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;

public class ProjectModule extends BaseClass {
	@Test
	public void createProject() throws EncryptedDocumentException, IOException {
	
		FileLib fileLibObj = new FileLib();
		String custname = fileLibObj.getExcelData("createProject",1,3);
		
	}


}
