package com.petProjectAutomationTest.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DogCatalogPage {

	private WebDriver driver = null;

	public DogCatalogPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement bulldog() {
		return driver.findElement(By.xpath("//div[@id='Catalog']//table//tbody//tr[2]//td[1]//a"));
	}

	public WebElement poodle() {
		return driver.findElement(By.xpath("//div[@id='Catalog']//table//tbody//tr[3]//td[1]//a"));
	}

	public WebElement dalmation() {
		return driver.findElement(By.xpath("//div[@id='Catalog']//table//tbody//tr[4]//td[1]//a"));
	}

	public WebElement golden_Retriever() {
		return driver.findElement(By.xpath("//div[@id='Catalog']//table//tbody//tr[5]//td[1]//a"));
	}

	public WebElement labrador_Retriever() {
		return driver.findElement(By.xpath("//div[@id='Catalog']//table//tbody//tr[6]//td[1]//a"));
	}
	public WebElement chihuahua() {
		return driver.findElement(By.xpath("//div[@id='Catalog']//table//tbody//tr[7]//td[1]//a"));
	}
	

}
