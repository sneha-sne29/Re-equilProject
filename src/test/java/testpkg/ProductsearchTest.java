package testpkg;




import java.time.Duration;

import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.Productsearchpagecls;

public class ProductsearchTest extends Basecls{
	
	@Test
	public void seraching() throws Exception 
	{
		
		Productsearchpagecls obj=new Productsearchpagecls(driver);
		obj.search("sunscreen");
		obj.addToCart("3", "678621");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		//Thread.sleep(3000);	
		//driver.navigate().back();
		
	}
	

}
