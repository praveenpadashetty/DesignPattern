package steps;

import org.junit.Assert;

import com.epam.pages.SearchItemOnEbayPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchItemOnEbayTest {

	@When("^Search for the item \"([^\"]*)\"$")
	public void search_for_the_item(String searchItem)  {
		SearchItemOnEbayPage.searchForItem(searchItem);
	}

	@Then("^Select any item and add to cart$")
	public void select_any_item_and_add_to_cart()  {
		SearchItemOnEbayPage.selectItem();
	}

	@Then("^Verify add cart for the added item$")
	public void verify_add_cart_for_the_added_item() {
		Assert.assertEquals("1", SearchItemOnEbayPage.verifyCart());
	}
	
}
