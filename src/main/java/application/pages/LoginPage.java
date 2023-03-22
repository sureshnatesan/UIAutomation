package application.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import applications.utils.ElementUtil;

public class LoginPage {

	private WebDriver driver;
	private ElementUtil eleutil;

	private By username = By.id("input-email");
	private By password = By.id("input-password");
	private By loginbutton = By.xpath("//input[@value='Login']");
	private By forgot_passowrd = By.linkText("Forgotten Password");
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		eleutil=new ElementUtil(driver);
	}
	
	
	public boolean isForgotPasswordExist() {
		return driver.findElement(forgot_passowrd).isDisplayed();
	}
	
	public HomePage doLogin(String fname, String fpassword) {
		driver.findElement(username).sendKeys(fname);
		driver.findElement(password).sendKeys(fpassword);
		driver.findElement(loginbutton).click();
		return new HomePage(driver);
	}
}
