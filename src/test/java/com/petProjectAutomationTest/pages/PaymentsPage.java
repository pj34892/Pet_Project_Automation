package com.petProjectAutomationTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentsPage {

	private WebDriver driver = null;

	public PaymentsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPaymentsHeader() {
		return driver.findElement(By.cssSelector("tbody tr:nth-child(1) th:nth-child(1)"));
	}

}
