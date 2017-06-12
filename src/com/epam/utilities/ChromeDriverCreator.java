package com.epam.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverCreator extends WebDriverCreator{

	@Override
	public WebDriver factoryMethod() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("ignore-certifcate-errors");
		chromeOptions.addArguments("--disable-extensions");
		chromeOptions.addArguments("test-type");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		return driver;
	}

}
