package com.epam.utilities;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Decorator implements WebDriver{
	
	protected WebDriver driver;
	
	public Decorator(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public void close() {
		System.out.println("Closing browser");
		driver.close();
	}

	@Override
	public WebElement findElement(By arg0) {
		System.out.println("Searching for locator :"+arg0);
		return driver.findElement(arg0);
	}

	@Override
	public List<WebElement> findElements(By arg0) {
		return driver.findElements(arg0);
	}

	@Override
	public void get(String arg0) {
		System.out.println("Launching application....");
		 driver.get(arg0);
	}

	@Override
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	@Override
	public String getPageSource() {
		return driver.getPageSource();
	}

	@Override
	public String getTitle() {
		return driver.getTitle();
	}

	@Override
	public String getWindowHandle() {
		return driver.getWindowHandle();
	}

	@Override
	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	@Override
	public Options manage() {
		return driver.manage();
	}

	@Override
	public Navigation navigate() {
		System.out.println("Navigating to url : "+driver.getCurrentUrl());
		return driver.navigate();
	}

	@Override
	public void quit() {
		System.out.println("Quiting browser!! Do garbage collection");
		driver.quit();
		driver = null;
	}

	@Override
	public TargetLocator switchTo() {
		return driver.switchTo();
	}

}
