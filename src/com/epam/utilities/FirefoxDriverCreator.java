package com.epam.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxDriverCreator extends WebDriverCreator{

	@Override
	public WebDriver factoryMethod() {
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver(capabilities);
		return driver;
	}

}
