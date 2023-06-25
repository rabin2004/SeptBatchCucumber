package stepDefination;

import org.testng.Assert;

import basePkg.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesPkg.HomePage;
import pagesPkg.SearchResultPage;
import pagesPkg.CommonFunction;

public class SearchFunctionalityTest extends BaseClass{
	HomePage hp;
	SearchResultPage srp;
	CommonFunction cf;
	String product = "apple";
	String invalidProduct = "&%*&%*^%648658758758712344";
	
	@Given("Customer is in homepage")
	public void customer_is_in_homepage() {
//		initialization();
		hp = new HomePage();
		srp = new SearchResultPage();
		cf = new CommonFunction();
	}

	@When("customer enters valid product in search text field")
	public void customer_enters_valid_product_in_search_text_field() {
		hp.enterProductSearchTxtBox(product);
	}

	@And("click search button")
	public void click_search_button() {
	  hp.clickSearchBtn();
	}

	@Then("customer should be in product result page")
	public void customer_should_be_in_product_result_page() {
	    Assert.assertTrue(srp.validateSearchResultPageTitle(product));
	    Assert.assertTrue(srp.validateSearchResultPageURL(product));
	}

	@And("should see all available products")
	public void should_see_all_available_products() {
		Assert.assertTrue(srp.validateSearchResultHeader());
//		tearDown();
	}
	
	@When("hit Enter key")
	public void hit_enter_key() {
	    cf.hittingEnterKey();
	}
	
	@When("customer enters invalid product in search text field")
	public void customer_enters_invalid_product_in_search_text_field() {
		hp.enterProductSearchTxtBox(invalidProduct);
	}
	
	@Then("customer should be in invalid product result page")
	public void customer_should_be_in_invalid_product_result_page() {
		Assert.assertTrue(srp.validateSearchResultPageTitle(invalidProduct));
//	    Assert.assertTrue(srp.validateSearchResultPageURL(invalidProduct));
	}
	
	@And("should see product not available error message")
	public void should_see_product_not_available_error_message() {
		Assert.assertTrue(srp.validateNoSearchResultMsg());
//		tearDown();
	}
	
	@When("customer enters valid {string} in search text field")
	public void customer_enters_valid_in_search_text_field(String product) {
		hp.enterProductSearchTxtBox(product);
	}
	
	// old format for step definition | \"(.*)\" -> expression for data driven
//	@When("^customer enters valid \"(.*)\" in search text field$")
//	public void customer_enters_valid_in_search_text_field(String product) {
//		hp.enterProductSearchTxtBox(product);
//	}
	
	@Then("customer should be in {string} result page")
	public void customer_should_be_in_result_page(String product) {
		Assert.assertTrue(srp.validateSearchResultPageTitle(product));
		Assert.assertTrue(srp.validateSearchResultPageURL(product));
	}







}
