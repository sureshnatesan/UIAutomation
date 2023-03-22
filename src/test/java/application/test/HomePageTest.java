package application.test;


import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import application.base.BaseTest;
import application.constants.AppConstants;


public class HomePageTest extends BaseTest{
	@BeforeClass
	public void homePageSetup() {
		homePage = loginPage.doLogin("qatestertest@gmail.com", "Test@123");
	}

	@Test
	public void homePageTitleTest() {
		
		String actTitle = homePage.getHomePageTitle();
		Assert.assertEquals(actTitle, AppConstants.ACCOUNTS_PAGE_TITLE_VALUE);
	}

	@Test
	public void homePageURLTest() {
		String actURL = homePage.getHomePageURL();
		Assert.assertTrue(actURL.contains(AppConstants.ACCOUNTS_PAGE_URL_FRACTION_VALUE));
	}

	@Test
	public void isLogoutLinkExistTest() {
		Assert.assertTrue(homePage.isLogoutLinkExist());
	}

	@Test
	public void homePageHeadersTest() {
		
		List<String> actualhomePageHeadersList = homePage.getHomePageHeadersList();
		System.out.println("Acc Page Headers List: " + actualhomePageHeadersList);
		Assert.assertEquals(actualhomePageHeadersList.size(), 4);
	}


}
