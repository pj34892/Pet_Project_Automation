package commonFunctionality;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractBrowser {

	protected WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeClass
	public WebDriver getWebDriver(@Optional("chrome") String browserName) {

		switch (browserName.toLowerCase())
		{
		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
			 System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
			 driver = new ChromeDriver();
			 //made changes
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("no valid browser");
			break;
		}
		return driver;
	}
    
	public WebDriver getChromeWebDriver() {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;
	}
	
	public WebDriver getEdgeWebDriver() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		return driver;
}
	public void takeScreenshot() {
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	  File DestFile=new File("C:\\Users\\Pareshnitin.Jadhav\\eclipse-workspace\\springApps\\petProjectAutomation\\Screenshots\\PetOrder.jpg");
       try {
		FileUtils.copyFile(SrcFile, DestFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	public void sleep(long seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
