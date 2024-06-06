package objectrepository;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CandidateHomePage

{
	public CandidateHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	

	@FindBy(xpath = "//span[@aria-label='caret-down']")
	private WebElement profileMenuButton;
	
	@FindBy(xpath = "//div[text()='Logout']")
	private WebElement logoutButton;
	@FindBy(xpath = "//div[text()='View profile']")
	private WebElement viewProfileButton;

	public WebElement getViewProfileButton() {
		return viewProfileButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getProfileMenuButton()
	{
		return profileMenuButton;
	}

}
