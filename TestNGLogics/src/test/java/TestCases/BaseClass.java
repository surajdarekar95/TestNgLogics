package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static void Initialization() {
		System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/git/TestNg/TestNGLogics/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
	}
	
	public void failed(String testMethodName){
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:/Users/lenovo/git/TestNg/TestNGLogics/ScreenShots/"+testMethodName+"_"+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
