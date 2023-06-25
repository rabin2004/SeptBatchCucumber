package stepDefination;

import org.testng.Assert;

import basePkg.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesPkg.HomePage;
import pagesPkg.LoginPage;

public class LoginFunctionalityTest extends BaseClass{
	// tidy gherkin - chrome plugin -> to get snippet for scenario
	
	static HomePage hp = new HomePage();
	static LoginPage lp = new LoginPage();
	
	@And("customer clicks account & list link")
	public void customer_clicks_account_list_link() {
	   hp.clickAccountListLink();
	}

	@And("is now in Sign in page")
	public void is_now_in_sign_in_page() {
	    Assert.assertTrue(lp.validateSiginPageHeader());
	}

	@When("customer enter invalid username")
	public void customer_enter_invalid_username() {
	   lp.enterUsernameTxtField("test@gmail.com");
	}

	@And("clicks continue button")
	public void clicks_continue_button() {
	    lp.clickContinueBtn();
	}

	@And("in enter invalid password")
	public void in_enter_invalid_password() {
	   lp.enterPasswordTxtBox("test12");
	}
	
	@And("clicks sign in button")
	public void clicks_sign_in_button() {
	    lp.clickSignInBtn();
	}

	@Then("sign in should be unsuccessful")
	public void sign_in_should_be_unsuccessful() {
	    Assert.assertEquals(lp.getLoginPageTitle(), "Amazon Sign-In");
	}

	@And("error message should be displayed")
	public void error_message_should_be_displayed() {
	    Assert.assertTrue(lp.validateLoginErrorMsgBox());
	}

	@When("customer enter invalid {string}")
	public void customer_enter_invalid_test_gmail_com(String username) {
		lp.enterUsernameTxtField(username);
	}
	@When("in enter invalid {string}")
	public void in_enter_invalid(String password) {
		lp.enterPasswordTxtBox(password);
	}
	@Then("customer should still be in {string} page")
	public void customer_should_still_be_in_page(String signInPageTitle) {
	    Assert.assertEquals(lp.getLoginPageTitle(),signInPageTitle);
	}




}
