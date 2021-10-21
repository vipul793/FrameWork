package com.StepDefination;

import com.Utilities.DriverUtil;
import com.Utilities.IteractableWebUtils;
import com.pageObject.LoginPage;

public class LoginPageSD {
	
  	public static void main(String[] args) throws InterruptedException {
		IteractableWebUtils.setUp();
		LoginPage logpage = new LoginPage(DriverUtil.getDriver());
		String title = IteractableWebUtils.getTitle();
		System.out.println(title);
		
		

		IteractableWebUtils.click(logpage.remeberMechbx);
		IteractableWebUtils.click(logpage.LoginButton);
		boolean status = IteractableWebUtils.isDisplayed(logpage.logo);
		System.out.println(status);

		IteractableWebUtils.click(logpage.CatlogDrop);
		IteractableWebUtils.click(logpage.product);
		IteractableWebUtils.click(logpage.productName);

		IteractableWebUtils.sendKeys(logpage.productName, "Digital Storm");

		IteractableWebUtils.click(logpage.wareHouse);
		IteractableWebUtils.SelectClass(logpage.wareHouse, "2");
		IteractableWebUtils.click(logpage.Category);
		IteractableWebUtils.SelectClass(logpage.Category, "4");
		IteractableWebUtils.click(logpage.productType);
		IteractableWebUtils.SelectClass(logpage.productType, "5");
		IteractableWebUtils.click(logpage.searchCategoreyCheBx);
		IteractableWebUtils.click(logpage.published);
		IteractableWebUtils.SelectClass(logpage.published, "2");
		IteractableWebUtils.click(logpage.manufacturer);
		IteractableWebUtils.SelectClass(logpage.manufacturer, "1");
		IteractableWebUtils.sendKeys(logpage.GoDirToProdSKU, "Apple");
		IteractableWebUtils.click(logpage.vendor);
		IteractableWebUtils.SelectClass(logpage.vendor, "2");
		IteractableWebUtils.click(logpage.searchButton);
		IteractableWebUtils.takeScrenshot();

		IteractableWebUtils.click(logpage.addNew);
		IteractableWebUtils.navigateBack();

		IteractableWebUtils.click(logpage.Import);
		Thread.sleep(2000);
		IteractableWebUtils.click(logpage.chooseFile);
		IteractableWebUtils.AshotScreenShot();

	}
}
