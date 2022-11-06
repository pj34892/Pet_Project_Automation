package com.petProjectAutomationTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoldenRetriver {
	private WebDriver driver = null;

	public GoldenRetriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement addToCart() {
		return driver.findElement(By.xpath("//div[@id='Catalog']//table//tbody//tr[2]//td[5]//a"));
	}
	
}
