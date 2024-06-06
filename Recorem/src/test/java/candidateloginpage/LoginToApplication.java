package candidateloginpage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutility.BaseClass;

public class LoginToApplication extends BaseClass
{
	@Test
	public void TestScript()
	{
		hp.getProfileMenuButton().click();	
		String title = driver.getTitle();
		Assert.assertEquals(title,"Recorem App | Discover Talent in specialized gatherings", " the title is not correct");
		
		Reporter.log(title,true);
	}

}
