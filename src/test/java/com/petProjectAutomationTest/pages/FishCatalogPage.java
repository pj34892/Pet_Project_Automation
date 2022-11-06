package com.petProjectAutomationTest.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FishCatalogPage {

	private WebDriver driver = null;

	public FishCatalogPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement angleFish() {
		return driver.findElement(By.xpath("//div[@id='Catalog']//table//tbody//tr[2]//td[1]//a"));
	}

	public WebElement tiger_Shark() {
		return driver.findElement(By.xpath("//div[@id='Catalog']//table//tbody//tr[3]//td[1]//a"));
	}

	public WebElement koi() {
		return driver.findElement(By.xpath("//div[@id='Catalog']//table//tbody//tr[4]//td[1]//a"));
	}

	public WebElement goldfish() {
		return driver.findElement(By.xpath("//div[@id='Catalog']//table//tbody//tr[5]//td[1]//a"));
	}

	public WebElement AngleFish() {
		return driver.findElement(By.xpath("//div[@id='Catalog']//table//tbody//tr[2]//td[1]//a"));
	}
}
