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
		selenium.open("https://www.phptravels.net/login");
		selenium.click("name=username");
		selenium.type("name=username", "user@phptravels.com");
		selenium.click("name=password");
		selenium.type("name=password", "demouser");
		selenium.click("//button[@type='submit']");
		assertEquals("My Account", selenium.getTitle());
		selenium.click("xpath=(//button[@type='button'])[2]");
		selenium.click("link=DVhbCERv");
		selenium.click("link=Logout");
		selenium.click("name=username");
		selenium.type("name=username", "user@phptravels.com");
		selenium.click("name=password");
		selenium.type("name=password", "usrdemo");
		selenium.click("//button[@type='submit']");
		selenium.click("//form[@id='loginfrm']/div/div[2]/div");
		assertEquals("Invalid Email or Password", selenium.getText("//form[@id='loginfrm']/div/div[2]/div"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
