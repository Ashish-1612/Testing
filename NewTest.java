package DeloitteDemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	public String baseUrl="https://google.com/";
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\software testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		driver.get(baseUrl);
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
		
  }
}
