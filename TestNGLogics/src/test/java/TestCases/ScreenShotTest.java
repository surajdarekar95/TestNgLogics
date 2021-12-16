package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenShotTest extends BaseClass{
	
	@BeforeMethod
	public void setUp() {
		Initialization();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void LoginTest() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void HomePageTest() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void ContactsPage() {
	Assert.assertEquals(false, true);
	}

}
