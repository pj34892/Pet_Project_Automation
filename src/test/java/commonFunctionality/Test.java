package commonFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test{
@org.testng.annotations.Test
public void main() throws InterruptedException{
    
    System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
    WebDriver d = new ChromeDriver();
    d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    d.manage().window().maximize();
    
    Thread.sleep(1000);
    
    d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
    d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    d.findElement(By.xpath("//button[@type='submit']")).click();
    
    
    Thread.sleep(3000);
    
    d.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[1]")).click();
    Thread.sleep(1000);
    d.findElement(By.xpath("//header[@class='oxd-topbar']//li[5]")).click();
//    
  JavascriptExecutor js = (JavascriptExecutor) d;
      WebElement terms = d.findElement(By.xpath("//ul[@class='oxd-pagination__ul']//li[last()]"));
      js.executeScript("window.scrollBy(0,890)", "");
     // js.executeScript("arguments[0].scrollIntoView();",terms);
     // js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    Thread.sleep(1000);
//
    System.out.println("done");



   Boolean value = d.findElement(By.xpath("//button[@class='oxd-pagination-page-item oxd-pagination-page-item--previous-next']")).isDisplayed();        
    System.out.println(value);  
    Integer count=0;
      do {
          count+=d.findElements(By.xpath("//div[@class='oxd-table-card']")).size();
          Thread.sleep(1000);
      }while(d.findElement(By.xpath("//ul[@class='oxd-pagination__ul']//li[last()]")).isDisplayed());
      
      System.out.println(count);



   
//    List<WebElement> list = d.findElements(By.xpath("//div[@class='oxd-table-card']"));
//    System.out.println(list.size());
//    for(WebElement l : list) {
//        System.out.println(l.getText());
//    }
      
    d.close();
    

    
}
}
