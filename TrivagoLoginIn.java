package DeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrivagoLoginIn {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\software testing\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	//maximize window
	driver.manage().window().maximize();
	driver.get("https://trivago.in/");
	driver.findElement(By.cssSelector("#js_navigation > div > div.pos-relative.has-popover > button > span")).click();
	driver.findElement(By.id("check_email")).sendKeys("ak7206460345@gmail.com");
	driver.findElement(By.id("login_email_submit")).click();
	try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("login_password")).sendKeys("kumar123@");
	try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("login_submit")).click();
	

	}

}

