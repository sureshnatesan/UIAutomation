package application.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import application.base.BaseTest;

public class MyAddressBookTest extends BaseTest {

	/*@BeforeClass
	public void homePageSetup() {
		homePage = loginPage.doLogin("qatestertest@gmail.com", "Test@123");
	}*/
	
	@Test
	public void headercheck() {
		myAddressBookPage.AddressHeaderExist();
	}
	

}
