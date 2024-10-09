package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.TaskListPage;

public class ProjectModule extends BaseClass {
	@Test
	public void createProject() throws InterruptedException, EncryptedDocumentException, IOException {
		TaskListPage t=new TaskListPage(driver);
		t.getTaskbtn().click();
		t.getAddnewbtn().click();
		t.getNewprjbtn().click();
		Thread.sleep(3000);
		t.getProjnamebtn().click();
		Thread.sleep(3000);
		t. getProjnamebtn().sendKeys("Nikhil");
		t. getCustbtn().click();
		Thread.sleep(3000);
		t.getDropdownbtn().click();
		t. getDiscbtn().sendKeys("create Project");
		t.getCreatebtn().click();
	}

}
