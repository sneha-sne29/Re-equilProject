package testpkg;


import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.Homepagecls;

public class HomepageTest extends Basecls {
	
	@Test
	public void homeTest()
	{
		Homepagecls obj=new Homepagecls(driver);
		obj.logoVerification();
		obj.textPrint();
		obj.contentVerification();
	}
	
	

}
