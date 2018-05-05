package Supplier;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class LoginSuccessfuUnsuccessfu {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.katalon.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testLoginSuccessfuUnsuccessfu() throws Exception {
		selenium.open("https://www.phptravels.net/supplier");
		selenium.click("name=email");
		selenium.type("name=email", "supplier@phptravels.com");
		selenium.click("name=password");
		selenium.type("name=password", "demosupplier");
		selenium.click("//button[@type='submit']");
		assertEquals("Dashboard", selenium.getTitle());
		selenium.click("//div[@id='content']/div[2]/div");
		assertEquals("Recent Bookings", selenium.getText("//div[@id='content']/div[2]/div"));
		selenium.click("//span[4]");
		selenium.click("link=Log Out");
		selenium.click("name=email");
		selenium.type("name=email", "supplier@phptravels.com");
		selenium.click("name=password");
		selenium.type("name=password", "supplierdemo");
		selenium.click("//span");
		selenium.click("//div[2]/div");
		assertEquals("Invalid Login Credentials", selenium.getText("//div[2]/div"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
