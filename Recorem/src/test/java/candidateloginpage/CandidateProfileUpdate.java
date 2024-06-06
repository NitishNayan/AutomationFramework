package candidateloginpage;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
@Listeners(ListenerUtility.class)
public class CandidateProfileUpdate extends BaseClass
{
	@Test
	public void Testscript()
	{
		hp.getProfileMenuButton().click();
		Assert.fail();
		
		
	}
	

}
