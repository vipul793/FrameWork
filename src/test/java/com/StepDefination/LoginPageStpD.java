package com.StepDefination;

import org.testng.annotations.Test;

import com.Utilities.DriverUtil;
import com.Utilities.IteractableWebUtils;
import com.Utilities.LoggerUtils;

import com.pageObject.LoginPage;

public class LoginPageStpD {

	@Test
	public void getLogin() {

		IteractableWebUtils.setUp();

		LoginPage logpage = new LoginPage(DriverUtil.getDriver());
		String title = IteractableWebUtils.getTitle();
		LoggerUtils.infomessage("Title = " + title);
		IteractableWebUtils.click(logpage.remeberMechbx);
		LoggerUtils.infomessage("Remember checkbox selected");
           
		IteractableWebUtils.click(logpage.LoginButton);
		LoggerUtils.infomessage("clicked on Login button");

		boolean status = IteractableWebUtils.isDisplayed(logpage.logo);
		LoggerUtils.infomessage("Logo displayed status= " + status);

		IteractableWebUtils.click(logpage.CatlogDrop);
		LoggerUtils.infomessage("clicked on catlog drop down");

		IteractableWebUtils.click(logpage.product);
		LoggerUtils.infomessage("clicked on product menu");

		IteractableWebUtils.click(logpage.productName);
		LoggerUtils.infomessage("clicked on product section");

		IteractableWebUtils.sendKeys(logpage.productName, "Digital Storm");
		LoggerUtils.infomessage("Digital Storm passed on product section");

		IteractableWebUtils.click(logpage.wareHouse);
		LoggerUtils.infomessage("clicked on warehouse section");

		IteractableWebUtils.SelectClass(logpage.wareHouse, "2");
		LoggerUtils.infomessage("selected value from warehouse drop down");

		IteractableWebUtils.click(logpage.Category);
		LoggerUtils.infomessage("clicked on category section");

		IteractableWebUtils.SelectClass(logpage.Category, "4");
		LoggerUtils.infomessage("selected value from category drop down");

		IteractableWebUtils.click(logpage.productType);
		LoggerUtils.infomessage("clicked on product type section");

		IteractableWebUtils.SelectClass(logpage.productType, "5");
		LoggerUtils.infomessage("selected value from product type drop down");

		IteractableWebUtils.click(logpage.searchCategoreyCheBx);
		LoggerUtils.infomessage("clicked on search category checkbox");

		IteractableWebUtils.click(logpage.published);
		LoggerUtils.infomessage("clicked on published section");

		IteractableWebUtils.SelectClass(logpage.published, "2");
		LoggerUtils.infomessage("selected value from published drop down");

		IteractableWebUtils.click(logpage.manufacturer);
		LoggerUtils.infomessage("clicked on manufacturer section");

		IteractableWebUtils.SelectClass(logpage.manufacturer, "1");
		LoggerUtils.infomessage("selected value from manufacturer drop down");

		IteractableWebUtils.sendKeys(logpage.GoDirToProdSKU, "Apple");
		LoggerUtils.infomessage("passing Apple over go Direct product SKU");

		IteractableWebUtils.click(logpage.vendor);
		LoggerUtils.infomessage("clicked on vendor section");

		IteractableWebUtils.SelectClass(logpage.vendor, "2");
		LoggerUtils.infomessage("selected value from vendor drop down");

		IteractableWebUtils.click(logpage.searchButton);
		LoggerUtils.infomessage("clicked on search button");

		IteractableWebUtils.takeScrenshot();

		IteractableWebUtils.click(logpage.addNew);
		LoggerUtils.infomessage("clicked on add new section");

		IteractableWebUtils.navigateBack();
		IteractableWebUtils.tearDown();

		IteractableWebUtils.click(logpage.Import);
		LoggerUtils.infomessage("clicked on import menu");

		IteractableWebUtils.click(logpage.chooseFile);
		LoggerUtils.infomessage("closed pop window");
		IteractableWebUtils.AshotScreenShot();

	}
}
