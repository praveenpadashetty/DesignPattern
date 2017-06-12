package steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.pages.LaunchWebPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LaunchWebPageTest {
	
	 @FindBy(id="gh-la")
	    private WebElement linkEbay;

	@Given("^Launch the ebay application \"([^\"]*)\"$")
	public void launch_the_ebay_application(String url) {
		LaunchWebPage.launchApplication(url);
		}

	@Then("^Verify that page is launched$")
	public void verify_that_page_is_launched() {
		Assert.assertTrue("Page not displayed", LaunchWebPage.verifyLaunchApp());
	}

}
