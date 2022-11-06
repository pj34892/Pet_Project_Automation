package com.petProjectAutomationTest.TestNg;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.petProjectAutomationTest.pages.DogCatalogPage;
import com.petProjectAutomationTest.pages.GoldenRetriver;
import com.petProjectAutomationTest.pages.PaymentsPage;
import com.petProjectAutomationTest.pages.PetStoreHome;
import com.petProjectAutomationTest.pages.ShoppingCart;
import com.petProjectAutomationTest.pages.SignInPage;

import commonFunctionality.AbstractBrowser;

public class LoginTest extends AbstractBrowser {
	@Parameters({"username","password"})
	@Test
	public void LoginCheck(String username, String password) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Enter the URL
		driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
		sleep(3000);

		// initialize
		SignInPage plpf = new SignInPage(driver);
		plpf.username().sendKeys(username);
		plpf.password().clear();
		plpf.password().sendKeys(password);
		plpf.LoginButton().click();
		sleep(2000);
		PetStoreHome home = new PetStoreHome(driver);
		String actual = "Welcome Mukesh!";

		// Validation
		assertEquals(actual, home.WelcomeMessage().getText());

	}
	
		@Test
		  public void AddToCart() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			PetStoreHome home = new PetStoreHome(driver);
			DogCatalogPage dogs = new DogCatalogPage(driver);
			GoldenRetriver goldenRetriver = new GoldenRetriver(driver);
			ShoppingCart cart = new ShoppingCart(driver);
			PaymentsPage payment = new PaymentsPage(driver);
			home.DogsIcon().click();
			sleep(1000);
			dogs.golden_Retriever().click();
			sleep(1000);
			goldenRetriver.addToCart().click();
			sleep(1000);
			cart.proceedToCheckOut().click();
			sleep(1000);
			String expected ="Payment Details";
			assertEquals(expected, payment.getPaymentsHeader().getText());
			if(expected.equals(payment.getPaymentsHeader().getText()))
			{
				takeScreenshot();

			}
			  
		  }
	
}
