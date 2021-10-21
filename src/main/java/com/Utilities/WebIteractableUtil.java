package com.Utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebIteractableUtil {

	@BeforeMethod
	public static void setUp(String browserName) {

		switch (browserName.trim().toUpperCase()) {
		case "CHROME": {
			System.setProperty("webdriver.chrome.driver", "D:\\FrameWork\\Driver\\chromedriver.exe");
			DriverUtil.setDriver(new ChromeDriver());
		
			break;
		}
		case "FIREFOX": {
			System.setProperty("webdriver.gecko.driver", "D:\\FrameWork\\Driver\\geckodriver.exe");
			DriverUtil.setDriver(new FirefoxDriver());
			break;
		}
		case "EDGE": {
			System.setProperty("webdriver.edge.driver", "D:\\FrameWork\\Driver\\msedgedriver.exe");
			DriverUtil.setDriver(new EdgeDriver());
			break;
		}
		default: {
			System.out.println("No matching case found");
			AssertJUnit.fail();
		}

		}
		DriverUtil.getDriver().manage().window().maximize();
		DriverUtil.getDriver().get("https://www.facebook.com/");

	}

	@AfterMethod
	public static void tearDown() {
		DriverUtil.getDriver().close();
	}

	public static WebElement findElement(String locatorType, String locatorValue) {

		WebElement element = null;
		switch (locatorType.trim().toUpperCase()) {
		case "ID": {
			element = DriverUtil.getDriver().findElement(By.id(locatorValue));
			break;
		}
		case "CLASSNAME": {
			break;
		}
		case "LINKTEXT": {
			break;
		}
		case "PARTIALLINKTEXT": {
			break;
		}
		case "CSSSELECTOR": {
			break;
		}
		case "XPATH": {
			break;
		}
		case "NAME": {
			break;
		}
		case "TAGNAME": {
			break;
		}
		default: {
			System.out.println("No matching case found");
			AssertJUnit.fail();
		}

		}
		return element;
	}

	public static List<WebElement> findElements(String locatorType, String locatorValue) {

		List<WebElement> elements = null;
		switch (locatorType.trim().toUpperCase()) {
		case "ID": {
			elements = DriverUtil.getDriver().findElements(By.id(locatorValue));
			break;
		}
		case "CLASSNAME": {
			break;
		}
		case "LINKTEXT": {
			break;
		}
		case "PARTIALLINKTEXT": {
			break;
		}
		case "CSSSELECTOR": {
			break;
		}
		case "XPATH": {
			break;
		}
		case "NAME": {
			break;
		}
		case "TAGNAME": {
			break;
		}
		default: {
			System.out.println("No matching case found");
			AssertJUnit.fail();
		}

		}
		return elements;
	}

	public static String getTitle() {

		return DriverUtil.getDriver().getTitle();
	}

	public static void clear(String locatorType, String locatorValue) {

		findElement(locatorType, locatorValue).clear();

	}

	public static String getCurrentUrl() {
		return DriverUtil.getDriver().getCurrentUrl();
	}

	public static String getPgeResourse() {
		return DriverUtil.getDriver().getPageSource();
	}

	public static String getWindowHandle() {
		return DriverUtil.getDriver().getWindowHandle();
	}

	public static Set<String> WindowHandles() {
		return DriverUtil.getDriver().getWindowHandles();
	}

	public static void navigateBack() {
		DriverUtil.getDriver().navigate().back();
	}

	public static void navigateRefresh() {
		DriverUtil.getDriver().navigate().refresh();
	}

	public static void navigateForward() {
		DriverUtil.getDriver().navigate().forward();

	}

	public static void sendKeys(String locatorType, String locatorValue, String sendKeyValue) {
		findElement(locatorType, locatorType).sendKeys(sendKeyValue);
	}

	public static String getAttribute(String locatorType, String locatorValue, String attributename) {
		
		String value = findElement(locatorType, locatorValue).getAttribute(attributename);
		System.out.println(value);
		return value;

		/*WebElement v = DriverUtil.getDriver().findElement(By.name("email"));
		String value = v.getAttribute(attributename);
		System.out.println(value);
		return value;*/
	
	}

	public static void click(String locatorType, String locatorValue) {
		findElement(locatorType, locatorValue).click();
	}

	public static void getCssValue(String locatorType, String locatorValue, String CssPropertyname) {
		findElement(locatorType, locatorValue).getCssValue(CssPropertyname);
	}

	public static void getText(String locatorType, String locatorValue) {
		findElement(locatorType, locatorValue).getText();
	}

	public static boolean isDisplayed(String locatorType, String locatorValue) {
		return findElement(locatorType, locatorValue).isDisplayed();
	}

	public static boolean  isEnabled(String locatorType, String locatorValue) {
		
		 return findElement(locatorType, locatorValue).isEnabled();
		
	}

	public static boolean isSelected(String locatorType, String locatorValue) {
		return findElement(locatorType, locatorValue).isSelected();
	}
	public static void main(String[] args) {
		setUp("chrome");
		System.out.println(getCurrentUrl());
		findElement("name", "email");
		System.out.println(isEnabled("id", "email"));
		getAttribute("classname", "_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy", "href");



	}
}