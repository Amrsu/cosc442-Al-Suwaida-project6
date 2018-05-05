package Admin;

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

public class AdminAddTour {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.katalon.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testAdminAddTour() throws Exception {
		selenium.open("https://www.phptravels.net/admin");
		selenium.click("name=email");
		selenium.type("name=email", "admin@phptravels.com");
		selenium.click("name=password");
		selenium.type("name=password", "demoadmin");
		selenium.click("//button[@type='submit']");
		assertEquals("Dashboard", selenium.getTitle());
		selenium.click("xpath=(//a[contains(text(),'Modules')])[2]");
		selenium.click("link=Add New");
		assertEquals("Add Tour", selenium.getTitle());
		selenium.click("name=tourname");
		selenium.type("name=tourname", "New Tour 3");
		selenium.selectFrame("index=0");
		selenium.click("//html");
		selenium.selectFrame("relative=parent");
		selenium.click("name=adultprice");
		selenium.type("name=adultprice", "100");
		selenium.click("id=add");
		selenium.click("xpath=(//a[contains(text(),'Modules')])[2]");
		selenium.click("//a[contains(text(),'Tours')]");
		assertEquals("Tours Management", selenium.getTitle());
		selenium.click("link=Log Out");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
