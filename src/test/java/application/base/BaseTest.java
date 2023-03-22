package application.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.driverfactory.DriverFactory;

import application.pages.HomePage;
import application.pages.LoginPage;
import application.pages.MyAddressBookPage;
import application.test.HomePageTest;

public class BaseTest {
	
	DriverFactory df;
	WebDriver driver;
	protected LoginPage loginPage;
	protected HomePage homePage;
	protected MyAddressBookPage myAddressBookPage;
	@BeforeTest
	public void setup() {
		df= new DriverFactory();
		driver = df.initDriver("edge");
		loginPage=new LoginPage(driver);
	}
	
	
	//@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
