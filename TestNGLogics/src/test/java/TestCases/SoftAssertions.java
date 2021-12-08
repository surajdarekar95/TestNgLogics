package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	SoftAssert soft = new SoftAssert();

	@Test
	public void Login() {


//Hard assertion will terminate program If assertion gets failed rest of the lines will not get executed
//Soft assertion will not terminate program If assertion gets failed rest of the lines will still get executed
//To use soft assertion we need to creat the object of softAssertion

		System.out.println("open browser");

		Assert.assertEquals(true, true);				 // hard assertion

		System.out.println("Enter username");
		Assert.assertEquals(true, true);				 // hard assertion

		System.out.println("Enter Password");
		System.out.println("Click on sign in");
		System.out.println("open browser");
		soft.assertEquals(false, true,"Failed to open browser");			 // Soft assertion

		System.out.println("Validate homepage");
		soft.assertEquals(false, true,"Validation Failed"); 				// Soft assertion

		System.out.println("Go to deals page");
		System.out.println("Creat deal");
		soft.assertEquals(false, true,"Not able to creat deal");			 // Soft assertion

		System.out.println("Go to contacts");
		System.out.println("Creat contact");
		
		soft.assertAll();

	}
}
