package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

	@FindBy(id = "login-with-password_email")
	private WebElement emailTextField;

	@FindBy(id = "login-with-password_password")
	private WebElement passWordTextField;
	@FindBy(xpath = "//span[text()='Keep me logged in']")
	private WebElement keepMeLoginCheckBox;

	@FindBy(xpath = "//button[text()='Login with password']")
	private WebElement loginWithPAsswordLinkbutton;

	@FindBy(xpath = "//button[text()='continue']")
	private WebElement continueButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPassWordTextField() {
		return passWordTextField;
	}

	public WebElement getKeepMeLoginCheckBox() {
		return keepMeLoginCheckBox;
	}

	public WebElement getLoginWithPAsswordLinkbutton() {
		return loginWithPAsswordLinkbutton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

}
