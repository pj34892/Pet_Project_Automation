package com.petProjectAutomationTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage {
 
	private WebDriver driver = null;

	public HeaderPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement fishHeader() {
		return driver.findElement(By.xpath("//body//div[@id='Header']//div[@id='QuickLinks']//a[1]"));
	}

	public WebElement DogsHeader() {
		return driver.findElement(By.xpath("//body//div[@id='Header']//div[@id='QuickLinks']//a[2]"));

	}

	public WebElement ReptilesHeader() {
		return driver.findElement(By.xpath("//body//div[@id='Header']//div[@id='QuickLinks']//a[3]"));

	}

	public WebElement CatsHeader() {
		return driver.findElement(By.xpath("//body//div[@id='Header']//div[@id='QuickLinks']//a[4]"));

	}

	public WebElement BirdsHeader() {
		return driver.findElement(By.xpath("//body//div[@id='Header']//div[@id='QuickLinks']//a[5]"));

	}

	
	public WebElement SearchInput() {
		return driver.findElement(By.xpath("//body//div[@id='SearchContent']//input[@name='keyword']"));

	}
	
	public WebElement SearchButton() {
		return driver.findElement(By.xpath("//body//div[@id='SearchContent']//input[@name='searchProducts']"));

	}
	
}
