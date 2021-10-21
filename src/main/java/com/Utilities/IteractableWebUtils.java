package com.Utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class IteractableWebUtils {
	
	@BeforeMethod
	public static void setUp() {
		String browserName = PropertiesUtils.getProperty("driverName");

		switch (browserName.trim().toUpperCase()) {
		case "CHROME": {
			System.setProperty("webdriver.chrome.driver", PropertiesUtils.getProperty("chromePath"));
			DriverUtil.setDriver(new ChromeDriver());
			break;
		}
		case "FIREFOX": {
			System.setProperty("webdriver.gecko.driver", PropertiesUtils.getProperty("fireFoxPath"));
			DriverUtil.setDriver(new FirefoxDriver());
			break;
		}
		case "EDGE": {
			System.setProperty("webdriver.edge.driver", PropertiesUtils.getProperty("edgePath"));
			DriverUtil.setDriver(new EdgeDriver());
			break;
		}
		default: {
			System.out.println("No matching case found");
			AssertJUnit.fail();
		}

	}
		LoggerUtils.infomessage("Browser launch successfully");
    	DriverUtil.getDriver().manage().window().maximize();
	  DriverUtil.getDriver().get(PropertiesUtils.getProperty("url"));
	  

	}

	@AfterMethod
	public static void tearDown() {
		DriverUtil.getDriver().close();
		LoggerUtils.infomessage("Browser closed");
		

	}

	public static String getTitle() {

		return DriverUtil.getDriver().getTitle();
	}

	public static void clear(WebElement element) {

		element.clear();
		

	}

	public static String getCurrentUrl() {

		return DriverUtil.getDriver().getCurrentUrl();
		
	}

	public static String getPgeResourse() {
		return DriverUtil.getDriver().getPageSource();
	}

	public static String getWindowHandle() {
		String window = DriverUtil.getDriver().getWindowHandle();
		return window;
	}

	public static Set<String> WindowHandles() {
	
		return DriverUtil.getDriver().getWindowHandles();
	}

	/*
	 * public static void WindowHandles(WebElement element) { element.click();
	 * 
	 * Set<String> windowhandles = DriverUtil.getDriver().getWindowHandles();
	 * 
	 * Iterator<String> iterator = windowhandles.iterator(); String parentwindow =
	 * iterator.next();
	 * 
	 * String childwindow = iterator.next();
	 * 
	 * DriverUtil.getDriver().switchTo().window(childwindow);
	 * 
	 * }
	 */

	public static void navigateBack() {
		DriverUtil.getDriver().navigate().back();
	}

	public static void refresh() {
		DriverUtil.getDriver().navigate().refresh();
	}

	public static void navigateForward() {
		DriverUtil.getDriver().navigate().forward();

	}

	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static String getAttribute(WebElement element, String attributeName) {
		String value = element.getAttribute(attributeName);

		return value;

	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void getCssValue(WebElement element, String attributeName) {
		element.getCssValue(attributeName);
	}

	public static String getText(WebElement element) {
		return element.getText();
	}

	public static boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public static boolean isEnabled(WebElement element) {

		return element.isEnabled();

	}

	public static boolean isSelected(WebElement element) {
		return element.isSelected();

	}

	public static void SelectClass(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	
	}

	public static void ActionMoveToElement(WebElement element) {
		Actions action = new Actions(DriverUtil.getDriver());
		action.moveToElement(element).perform();

	}

	public static void DragandDrop(WebElement sourceElement, WebElement targetElement) {
		Actions action = new Actions(DriverUtil.getDriver());
		action.dragAndDrop(sourceElement, targetElement).perform();
	}

	public static void Allcheckboxes(WebElement... element) {
		for (WebElement checkboxes : element) {
			checkboxes.click();
		}
	}

	public static void checkboxes(String attributeName, String value, WebElement... element) {
		for (WebElement checkbox : element) {
			if (checkbox.getAttribute(attributeName).equalsIgnoreCase(value))
				checkbox.click();
		}
	}

	public static void AlertAccept() {
		DriverUtil.getDriver().switchTo().alert().accept();
	}

	public static void AlertDismiss() {
		DriverUtil.getDriver().switchTo().alert().dismiss();
	}

	public static void AlertSendKeys(String value) {
		DriverUtil.getDriver().switchTo().alert().sendKeys(value);
	}

	public static void AutoItFileUpload(WebElement element) {
		element.click();
		String filepath = "";
		try {
			Runtime.getRuntime().exec(filepath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String takeScrenshot() {

		TakesScreenshot screen = (TakesScreenshot) DriverUtil.getDriver();
		File file = screen.getScreenshotAs(OutputType.FILE);
		String path = "D:\\firstmaven\\ScreenShots\\Screenshot_" + timeStamp() + ".png";
		try {
			FileUtils.copyFile(file, new File(path));
		} catch (IOException e) {

			e.printStackTrace();
		}
		return path;
	}

	public static String timeStamp() {
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy_hhmmss");
		return format.format(d);
	}

	public static void AshotScreenShot() {
		AShot shot = new AShot();
		Screenshot s = shot.shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(DriverUtil.getDriver());
		try {
			ImageIO.write(s.getImage(), "png", new File("D:\\FrameWork\\screenshots\\ss.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
