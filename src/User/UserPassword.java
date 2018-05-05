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

public class UserPassword {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.katalon.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testUserPassword() throws Exception {
		selenium.open("https://www.phptravels.net/login");
		selenium.click("name=username");
		selenium.type("name=username", "user@phptravels.com");
		selenium.click("name=password");
		selenium.type("name=password", "demouser");
		selenium.click("//button[@type='submit']");
		selenium.click("//button[@type='submit']");
		selenium.click("xpath=(//a[contains(text(),'DVhbCERv')])[2]");
		selenium.click("xpath=(//a[contains(text(),'Account')])[2]");
		selenium.click("//div[@id='body-section']/div/div[3]/div/div/ul/li[2]/a/span");
		selenium.click("//div[@id='body-section']/div/div/div/div");
		assertEquals("Hi, DVhbCERv IlqEZZxz", selenium.getText("//div[@id='body-section']/div/div/div/div/h3"));
		selenium.click("name=password");
		selenium.type("name=password", "demouser");
		selenium.click("name=confirmpassword");
		selenium.type("name=confirmpassword", "demouser");
		selenium.click("//form[@id='profilefrm']/div/div[3]/div[3]/button");
		selenium.click("//div[@id='profile']/div[2]/div[2]/div");
		selenium.click("xpath=(//a[contains(text(),'DVhbCERv')])[2]");
		selenium.click("xpath=(//a[contains(text(),'Logout')])[2]");
		selenium.click("name=username");
		selenium.type("name=username", "user@phptravels.com");
		selenium.click("name=password");
		selenium.type("name=password", "demouser");
		selenium.click("//button[@type='submit']");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
