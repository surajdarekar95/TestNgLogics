package TestCases;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//To generate logs we need two things
//1.log4j dependancies
//2.log4j.propertoes file


public class Generatelogs {

	WebDriver driver;
	Logger log = Logger.getLogger(Generatelogs.class);

	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/lenovo/git/TestNg/TestNGLogics/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Luanching Chrome Browser");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		log.info("Opening facebook");
		driver.get("https://www.facebook.com/");
	}

	@Test(priority = 1)
	public void verifyLogo() {
		log.info("Executing Test 1");
		boolean b = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
		Assert.assertTrue(b);
		log.info("Logo Present = " + b);
	}

	@Test(priority = 2)
	public void Verifytitle() {
		log.info("Executing Test 2");

		String title = driver.getTitle();
		log.info("Page Title is = " + title);
		Assert.assertEquals("Facebook – log in or sign up", title, "Failed to verify");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("Browser Close");
	}
}
