package com.actitime.testscript;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.TaskListPage;

public class DeleteCustomerModule extends BaseClass {
	@Test
	public void deleteCustomer() throws InterruptedException {
		//HomePage h= new HomePage(driver);
		//h.setTask();
	TaskListPage t=new TaskListPage(driver);
	t.getTaskbtn().click();
	t.getStartbtn().click();Thread.sleep(1000);
	t.getSendkeysbtn().sendKeys("Nikhil");
	WebElement target =t.getEditbtn();
	Actions a = new Actions(driver);
	a.moveToElement(target).click().perform();
	Thread.sleep(5000);
	t.getActionbtn().click();
	t.getDeletebtn().click();
	t.getDeletepermanentlybtn().click();
//	t.
//	assert.assertEquals(null, null);
	}
}
