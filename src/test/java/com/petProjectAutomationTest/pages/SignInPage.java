package com.petProjectAutomationTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

	private WebDriver driver = null;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement CartHeader() {
		return driver.findElement(By.xpath("//body//div[@id='Header']//div[@id='MenuContent']//a[1]"));

	}
	
	public WebElement loginHeader() {
		return driver.findElement(By.xpath("//a[text()='Sign In']"));
	}

	public WebElement HelpHeader() {
		return driver.findElement(By.xpath("//body//div[@id='Header']//div[@id='MenuContent']//a[3]"));

	}
	
	public WebElement username() {
		return driver.findElement(By.xpath("//body//div[@id='Content']//div[@id='Catalog']//input[@name='username']"));

	}
	
	public WebElement password() {
		return driver.findElement(By.xpath("//body//div[@id='Content']//div[@id='Catalog']//input[@name='password']"));

	}
	public WebElement LoginButton() {
		return driver.findElement(By.xpath("//body//div[@id='Content']//div[@id='Catalog']//input[@name='signon']"));

	}
}
