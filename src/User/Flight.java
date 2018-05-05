package User;

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

public class Flight {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.katalon.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testFlight() throws Exception {
		selenium.open("https://www.phptravels.net/login");
		selenium.click("name=username");
		selenium.type("name=username", "user@phptravels.com");
		selenium.click("name=password");
		selenium.type("name=password", "demousr");
		selenium.click("//button[@type='submit']");
		selenium.type("name=password", "");
		selenium.click("name=password");
		selenium.type("name=password", "demouser");
		selenium.click("//button[@type='submit']");
		selenium.click("xpath=(//button[@type='button'])[2]");
		selenium.click("id=sidebar_left");
		selenium.click("//img[contains(@src,'https://www.phptravels.net/themes/default/assets/img/icons/flight.png')]");
		selenium.selectFrame("index=0");
		selenium.click("//span[@id='departure-link-2fe1072e-2e87-40ff-af12-94536079f3ec']/span/span/span[2]");
		selenium.click("id=airport");
		selenium.type("id=airport", "BWI");
		selenium.click("id=airport");
		selenium.type("id=airport", "MKE");
		assertEquals("Travelstart UAE - Search, Compare & Book Cheap Flights", selenium.getTitle());
		selenium.click("//button[@id='search-for-flights-button']/span");
		selenium.click("//h1");
		assertEquals("Search and Book Cheap Flights", selenium.getText("//h1/span"));
		selenium.click("//div[@id='no-results-err']/span[2]");
		selenium.click("//div[@id='no-results-err']/span[2]/span/span");
		selenium.click("//div[@id='no-results-err']/span[2]/span");
		assertEquals("No flights available!", selenium.getText("//div[@id='no-results-err']/span[2]/span/span"));
		selenium.selectFrame("relative=parent");
		selenium.click("xpath=(//a[contains(text(),'DVhbCERv')])[2]");
		selenium.click("xpath=(//a[contains(text(),'Logout')])[2]");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
