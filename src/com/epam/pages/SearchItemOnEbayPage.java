package com.epam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.utilities.SingletonDriver;

public class SearchItemOnEbayPage {
	@FindBy(id="gh-ac")
	 private static WebElement textBoxSearch;
	@FindBy(id="gh-btn")
	 private static  WebElement buttonSearch;
	
	@FindBy(xpath="//ul[@id='ListViewInner']/li[1]/h3")
	 private static WebElement selectItem;
	@FindBy(id="isCartBtn_btn")
	private static WebElement buttonAddCart;
	@FindBy(id="gh-cart-n")
	private  static WebElement textCount;
	@FindBy(xpath="//a[starts-with(@id,'rmlnk')]")
	private static WebElement linkRemove;
	
	
	public static void searchForItem(String searchItem)  {
		PageFactory.initElements(SingletonDriver.getDriver(), SearchItemOnEbayPage.class);
		SingletonDriver.getInstance().waitToLoadPage(textBoxSearch);
		textBoxSearch.sendKeys(searchItem);
		buttonSearch.click();
	}

	public static void selectItem()  {
		SingletonDriver.getInstance().waitToLoadPage(selectItem);
		selectItem.click();
		SingletonDriver.getInstance().waitToLoadPage(buttonAddCart);
		buttonAddCart.click();
	}

	public static String verifyCart() {
		SingletonDriver.getInstance().waitToLoadPage(textCount);
		String count = textCount.getText();
		SingletonDriver.getInstance().waitToLoadPage(linkRemove);
		linkRemove.click();
		return count;
	}
}
