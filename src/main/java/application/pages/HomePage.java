package application.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import application.constants.AppConstants;
import applications.utils.ElementUtil;

public class HomePage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}

	private By logoutLink = By.linkText("Logout");
	private By accsHeaders = By.cssSelector("div#content h2");
	private By search = By.name("search");
    private By addressBooklink = By.linkText("Address Book");
	
	
	
	public String getHomePageTitle() {
		String title = eleUtil.waitForTitleIsAndFetch(AppConstants.DEFAULT_SHORT_TIME_OUT, AppConstants.ACCOUNTS_PAGE_TITLE_VALUE);
		System.out.println("Acc page title : " + title);
		return title;
	}

	public String getHomePageURL() {
		String url = eleUtil.waitForURLContainsAndFetch(AppConstants.DEFAULT_SHORT_TIME_OUT, AppConstants.ACCOUNTS_PAGE_URL_FRACTION_VALUE);
		System.out.println("Acc page url : " + url);
		return url;
	}

	public boolean isLogoutLinkExist() {
		return eleUtil.waitForElementVisible(logoutLink, AppConstants.DEFAULT_MEDIUM_TIME_OUT).isDisplayed();
	}

	public boolean isSearchExist() {
		return eleUtil.waitForElementVisible(search, AppConstants.DEFAULT_MEDIUM_TIME_OUT).isDisplayed();
	}

	public List<String> getHomePageHeadersList() {
		List<WebElement> accHeadersList = eleUtil.waitForElementsVisible(accsHeaders, AppConstants.DEFAULT_MEDIUM_TIME_OUT);		
		List<String> accHeadersValList = new ArrayList<String>();
		for (WebElement e : accHeadersList) {
			String text = e.getText();
			accHeadersValList.add(text);
		}
		return accHeadersValList;
	}
	
	public boolean addressBookLinkExist() {
		return eleUtil.waitForElementVisible(addressBooklink, AppConstants.DEFAULT_MEDIUM_TIME_OUT).isDisplayed();
	}
	
	public MyAddressBookPage doClickAddressBookLink() {
		eleUtil.clickWhenReady( AppConstants.DEFAULT_MEDIUM_TIME_OUT, addressBooklink);
	    return new MyAddressBookPage(driver);
	}
}
