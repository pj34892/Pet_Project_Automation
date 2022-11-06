package com.petProjectAutomationTest.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreHome {

	
	public static void main(String[] args) {
		String [] data =new String[5];
		
		String [] data1 ={"","","","",""};
		String [] data2 =new String[]{"","","","",""};
		
				
	}
	private WebDriver driver = null;

	public PetStoreHome(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> categories() {
		return driver.findElements(By.xpath("//body//div[@id='SidebarContent']"));
	}

	public WebElement fishIcon() {
		return driver.findElement(By.xpath("(//body//div[@id='SidebarContent']//img)[1]"));
	}

	public WebElement DogsIcon() {
		return driver.findElement(By.xpath("(//body//div[@id='SidebarContent']//img)[2]"));
	}

	public WebElement CatsIcon() {
		return driver.findElement(By.xpath("(//body//div[@id='SidebarContent']//img)[3]"));
	}

	public WebElement ReptilesIcon() {
		return driver.findElement(By.xpath("(//body//div[@id='SidebarContent']//img)[4]"));
	}

	public WebElement BirdsIcon() {
		return driver.findElement(By.xpath("(//body//div[@id='SidebarContent']//img)[5]"));
	}

	public WebElement WelcomeMessage() {
		return driver.findElement(By.xpath("//body//div[@id='Welcome']//div[@id='WelcomeContent']"));
	}

	public WebElement CartHeader() {
		return driver.findElement(By.xpath("//body//div[@id='Header']//div[@id='MenuContent']//a[1]"));

	}

	public WebElement signOutHeader() {
		return driver.findElement(By.xpath("//body//div[@id='Header']//div[@id='MenuContent']//a[2]"));

	}

	public WebElement MyaccountHeader() {
		return driver.findElement(By.xpath("//body//div[@id='Header']//div[@id='MenuContent']//a[3]"));

	}

	public WebElement helpHeader() {
		return driver.findElement(By.xpath("//body//div[@id='Header']//div[@id='MenuContent']//a[4]"));

	}

}
