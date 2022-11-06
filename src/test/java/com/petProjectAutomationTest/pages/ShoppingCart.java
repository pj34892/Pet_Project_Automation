package com.petProjectAutomationTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {
	private WebDriver driver = null;

	public ShoppingCart(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement proceedToCheckOut() {
		return driver.findElement(By.linkText("Proceed to Checkout"));
	}
}
