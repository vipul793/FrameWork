package com.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//h1")
	public WebElement pageTitleTxt;

	@FindBy(tagName = "strong")
	public WebElement titleTxt;

	@FindBy(css = "label[for='Email']")
	public WebElement emailLbl;

	@FindBy(id = "Email")
	public WebElement emailField;

	@FindBy(id = "Password")
	public WebElement passwordField;

	@FindBy(id = "RememberMe")
	public WebElement remeberMechbx;

	@FindBy(xpath = "//button[text()='Log in']")
	public WebElement LoginButton;

	@FindBy(xpath = "//img[@class='brand-image-xl logo-xl']")
	public WebElement logo;

	@FindBy(xpath = "(//i[@class='right fas fa-angle-left '])[1]")
	public WebElement CatlogDrop;

	@FindBy(xpath = "//p[text()=' Products']")
	public WebElement product;

	@FindBy(id = "SearchProductName")
	public WebElement productName;

	@FindBy(xpath = "//select[@id='SearchWarehouseId']")   ///element find
	public WebElement wareHouse;

	@FindBy(id = "SearchCategoryId")
	public WebElement Category;

	@FindBy(id = "SearchProductTypeId")
	public WebElement productType;

	@FindBy(xpath = "id('SearchIncludeSubCategories')")
	public WebElement searchCategoreyCheBx;

	@FindBy(xpath = "//select[@id='SearchPublishedId']")
	public WebElement published;

	@FindBy(xpath = "//select[@id='SearchManufacturerId']")
	public WebElement manufacturer;

	@FindBy(xpath = "//input[@id='GoDirectlyToSku']")
	public WebElement GoDirToProdSKU;

	@FindBy(name = "SearchVendorId")
	public WebElement vendor;

	@FindBy(xpath = "//button[@id='search-products']")
	public WebElement searchButton;

	@FindBy(xpath = "//div[@class='inputs']/label")
	public List<WebElement> labels;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	public WebElement addNew;

	@FindBy(xpath = "//button[@name='importexcel']")
	public WebElement Import;

	@FindBy(xpath = "(//button[@class='close'])[3]")
	public WebElement chooseFile;

	@FindBy(css = "button#delete-selected")
	public WebElement deleteSelected;

}
