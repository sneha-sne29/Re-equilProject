package testpkg;

import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.CheckoutPage;

public class CheckoutTest extends Basecls{
	
	@Test
	public void checkingOut() throws Exception
	{
		CheckoutPage obj=new CheckoutPage(driver);
		
		obj.addAddress("Raji", "P", "Kanjikode", "Palakkad", "678621", "9400727173");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		
	}

}
