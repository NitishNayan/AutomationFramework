package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objectrepository.CandidateHomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fis;
	public WelcomePage wp;
	public LoginPage lp;
	public CandidateHomePage hp;
	
	@BeforeClass
	public void launchbrowser() throws IOException 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		fis = new FileUtility();
		String url = fis.getDataFromProperty("url");
		driver.get(url);
	}

	@BeforeMethod
	public void login() throws IOException 
	{

		wp = new WelcomePage(driver);
		wp.getLoginButton().click();
		lp = new LoginPage(driver);
		lp.getLoginWithPAsswordLinkbutton().click();
		String email = fis.getDataFromProperty("email");
		lp.getEmailTextField().sendKeys(email);
		String password = fis.getDataFromProperty("password");
		lp.getPassWordTextField().sendKeys(password);
		lp.getKeepMeLoginCheckBox().click();
		lp.getContinueButton().click();
		hp = new  CandidateHomePage(driver);
	}
	

	@AfterMethod
	public void logout() 
	{
		
	 
	Reporter.log("this is After test Method",true);
	hp.getLogoutButton().click();
	
	}
	

	@AfterClass
	public void closeBrowser() 
	{	Reporter.log("this is After class method",true);
		driver.quit();
		
	}
}
