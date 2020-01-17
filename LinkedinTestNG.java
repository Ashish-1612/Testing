package DeloitteDemoPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class LinkedinTestNG {
	WebDriver driver;

	// Method 1: Open
	@Test(priority = 1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void launchLinkedin() {
		driver.get("http://www.linkedin.com");
		driver.findElement(By.className("nav__button-secondary")).click();
	}

	@Test(priority = 3)
	public void enterLoginValues() throws Exception {
		driver.findElement(By.id("username")).sendKeys("ak7206460345@gmail.com");
		driver.findElement(By.id("password")).sendKeys("kumar123@");
		
		LinkedinTestNG.takeSnapShot(driver, "c://test.png");
		driver.findElement(By.className("btn__primary--large")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
	
}
