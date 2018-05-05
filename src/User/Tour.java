package com.example.tests;

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

public class Tour {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.katalon.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testTour() throws Exception {
		selenium.open(https://www.phptravels.net/login);
		selenium.click(name=username);
		selenium.type(name=username, user@phptravels.com);
		selenium.click(name=password);
		selenium.type(name=password, demouser);
		selenium.click(//button[@type='submit']);
		assertEquals(My Account, selenium.getTitle());
		selenium.click(//img[contains(@src,'https://www.phptravels.net/themes/default/assets/img/icons/tour.png')]);
		assertEquals(Tours Listings, selenium.getTitle());
		selenium.click(//div[@id='body-section']/div[5]/div[3]/div/table/tbody/tr[4]/td/div[2]/div/div[6]/a/button);
		assertEquals(Old and New Delhi City Tour, selenium.getTitle());
		selenium.chooseOkOnNextConfirmation();
		selenium.click(//div[2]/div[2]/span);
		assertTrue(selenium.getConfirmation().matches(^Do you want to add it to wishlist [\\s\\S]$));
		selenium.click(xpath=(//a[contains(text(),'DVhbCERv')])[2]);
		selenium.click(xpath=(//a[contains(text(),'Account')])[2]);
		selenium.click(xpath=(//a[contains(text(),'DVhbCERv')])[2]);
		assertEquals(My Account, selenium.getTitle());
		selenium.click(//div[@id='body-section']/div/div[3]/div/div/ul/li[3]/a/span);
		assertEquals(Old and New Delhi City Tour, selenium.getText(//div[@id='wish7']/div/a/b));
		selenium.click(link=Preview);
		selenium.selectWindow(win_ser_1);
		assertEquals(Old and New Delhi City Tour, selenium.getTitle());
		selenium.click(xpath=(//a[contains(text(),'DVhbCERv')])[2]);
		selenium.click(xpath=(//a[contains(text(),'Logout')])[2]);
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
