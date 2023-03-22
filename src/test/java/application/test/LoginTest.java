package application.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import application.base.BaseTest;

public class LoginTest extends BaseTest{

	/*
	 * @Test
	
	public void logInPageTitle() {
		assertEquals(loginPage.getPageTitle(), "Account Login");
	}
	 */

	@Test
	public void doLoginTest() {
		loginPage.doLogin("qatestertest@gmail.com", "Test@123");
		
	}
	
}
