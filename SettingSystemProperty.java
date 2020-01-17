package DeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SettingSystemProperty {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\software testing\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	//maximize window
	driver.manage().window().maximize();
	driver.get("https://makemytrip.com/");
	driver.findElement(By.className("makeFlex")).click();
	driver.findElement(By.id("username")).sendKeys("ak7206460345@gmail.com");
	driver.findElement(By.cssSelector(".modalLogin")).click();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("password")).sendKeys("kumar123@");
	try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector("button")).click();
	

	}

}

