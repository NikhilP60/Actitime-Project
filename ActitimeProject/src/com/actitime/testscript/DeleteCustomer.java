package com.actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeleteCustomer {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Start typing name ...')]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Start typing name ...')]")).sendKeys("Tom");
		WebElement target = driver
				.findElement(By.xpath("//span[@class='highlightToken']/../..//div[@class='editButton available']"));
		Actions a = new Actions(driver);
		a.moveToElement(target).click().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='ACTIONS']")).click();
		driver.findElement(By.xpath("//div[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
        driver.findElement(By.xpath("//div[@class=\"toast\"]")).getText();
	}

}
