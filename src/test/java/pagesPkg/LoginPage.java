package pagesPkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//h1[@class='a-spacing-small']") // driver.findElement(id="twotabsearchtextbox")
	WebElement siginPageHeader;
	@FindBy(name="email")
	WebElement usernameTxtField;
	@FindBy(id="continue")
	WebElement continueBtn;
	@FindBy(name="password")
	WebElement passwordTxtBox;
	@FindBy(id="signInSubmit")
	WebElement signInBtn;
	@FindBy(xpath="//div[@class='a-box-inner a-alert-container']")
	WebElement loginErrorMsgBox;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateSiginPageHeader() {
		return siginPageHeader.isDisplayed();
	}
	
	public void enterUsernameTxtField(String username) {
		usernameTxtField.sendKeys(username);
	}
	
	public void clickContinueBtn() {
		continueBtn.click();
	}
	
	public void enterPasswordTxtBox(String password) {
		passwordTxtBox.sendKeys(password);
	}
	
	public void clickSignInBtn() {
		signInBtn.click();
	}
	
	public boolean validateLoginErrorMsgBox() {
		return loginErrorMsgBox.isDisplayed();
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

}
