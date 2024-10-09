package com.actitime.testscript;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CreateProject {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Project']")).click();
		driver.findElement(By.id("projectPopup_projectNameField")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("Nikhil");
		driver.findElement(By.id("ext-gen23")).click();
		driver.findElement(By.id("ext-gen118")).click();
		driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("Create Project");
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		driver.findElement(By.id("ext-gen108")).click();
		String text = driver.findElement(By.xpath("//div[@class=\"innerHtml\"]")).getText();
	//	Assert.assertEquals(text, "Project '"+Nikhil+"' has been created");
	}
}
