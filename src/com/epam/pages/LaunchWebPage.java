package com.epam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.utilities.SingletonDriver;

public class LaunchWebPage {

	@FindBy(id = "gh-la")
	private static WebElement linkEbay;

	public static void launchApplication(String url)  {
		PageFactory.initElements(SingletonDriver.getDriver(), LaunchWebPage.class);
		SingletonDriver.getDriver().get(url);
	}

	public static boolean verifyLaunchApp()  {
		SingletonDriver.getInstance().waitToLoadPage(linkEbay);
		return linkEbay.isDisplayed();
	}
}
