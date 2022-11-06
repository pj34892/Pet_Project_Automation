package com.petProjectAutomationTest.TestNg;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.petProjectAutomationTest.pages.DogCatalogPage;
import com.petProjectAutomationTest.pages.GoldenRetriver;
import com.petProjectAutomationTest.pages.PaymentsPage;
import com.petProjectAutomationTest.pages.PetStoreHome;
import com.petProjectAutomationTest.pages.ShoppingCart;

import commonFunctionality.AbstractBrowser;

public class ChooseCart extends AbstractBrowser {
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
