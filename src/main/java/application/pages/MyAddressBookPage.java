package application.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import application.constants.AppConstants;
import applications.utils.ElementUtil;

public class MyAddressBookPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	private By AddressBookHeader = By.xpath("//h2[text()='Address Book Entries']");
	
			
	public MyAddressBookPage(WebDriver driver){
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}
	
	
	public boolean AddressHeaderExist() {
		return eleUtil.waitForElementVisible(AddressBookHeader, AppConstants.DEFAULT_MEDIUM_TIME_OUT).isDisplayed();
	}
}
