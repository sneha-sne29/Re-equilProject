package testpkg;

import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.LinkValidation;

public class LinkValidationTest extends Basecls{
	
	@Test
	public void linkVerification() throws Exception
	{
		LinkValidation ob=new LinkValidation(driver);
		ob.link("https://www.reequil.com/pages/skin-hair-tips");
		
		Thread.sleep(3000);
		//driver.navigate().back();
	}

}
