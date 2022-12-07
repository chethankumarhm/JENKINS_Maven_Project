package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Script_4 {
	public WebDriver driver;
	 
@Test
public void bmw() {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.bmw-motorrad.in/");
	driver.close();
	}
}
