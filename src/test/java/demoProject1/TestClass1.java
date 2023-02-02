package demoProject1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DeepakSakthivel\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void Test1()
	{
		driver.navigate().to("https://rahulshettyacademy.com/");
		System.out.println("Title 1 :" +driver.getTitle());
	}
	
	@Test
	public void Test2()
	{
		driver.navigate().to("https://www.path2usa.com/travel-companion/");
		System.out.println("Title 2 :" +driver.getTitle());
	}
	
	@Test
	public void Test3()
	{
		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
		System.out.println("Title 3 :" +driver.getTitle());
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
