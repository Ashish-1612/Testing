package DeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestNGTestCasePriority {
	  
  
  WebDriver driver;			

  // Method 1: Open Brower say Firefox			
  @Test	(priority=1)	
  public void openBrowser() {	
	  System.setProperty("webdriver.chrome.driver","C:\\software testing\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
  }		

  // Method 2: Launch Google.com			
  @Test	(priority=2)
  public void launchGoogle() {				
      driver.get("http://www.google.co.in");						
  }		
  
  // Method 3: Perform a search using "Facebook"			
  @Test	(priority=3)
  public void peformSeachAndClick1stLink() {				
      driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
      
  }		

  // Method 4: Verify Google search page title.			
  @Test	(priority=4)
  public void FaceBookPageTitleVerification() throws Exception {				
      driver.findElement(By.xpath(".//*[@title='Search']")).submit();						
      Thread.sleep(3000);		
      Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);
  }
}
