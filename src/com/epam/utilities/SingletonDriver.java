package com.epam.utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SingletonDriver {

	private static final Logger logger = Logger.getLogger(SingletonDriver.class);
	private static WebDriver webDriver;

	private static SingletonDriver driver = new SingletonDriver();

	private SingletonDriver(){
		
	}
	
	public static SingletonDriver getInstance() {
		if (driver == null) {
			driver = new SingletonDriver();
		}
		return driver;
	}

	public static WebDriver getDriver() {
		webDriver = new Decorator(webDriver);
		return webDriver;
	}

	public WebDriver createDriver(final String browserType) {
		switch (browserType.toUpperCase()) {
		case "FIREFOX":
			System.out.println("creating firefox driver....");
			webDriver = new FirefoxDriverCreator().factoryMethod();
			break;
		case "CHROME":
			System.out.println("creating Chrome driver....");
			webDriver = new ChromeDriverCreator().factoryMethod();
			
			break;
		default:
			logger.info("Invalid browser type");
		}
		return webDriver;

	}

	public void waitToLoadPage(final WebElement element) {
		WebDriverWait wait = new WebDriverWait(webDriver, 90);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public WebDriver getWebDriver(String browserType) {
		if (webDriver == null) {
			createDriver(browserType);
		}
		return webDriver;
	}

}
