package com.Utilities;

import org.openqa.selenium.WebDriver;

public class DriverUtil {

	
	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver ldriver) {
		driver = ldriver;
	}
}
