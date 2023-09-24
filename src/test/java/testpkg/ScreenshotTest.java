package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.ScreenshotPage;

public class ScreenshotTest extends Basecls {
	
	@Test
	public void testScrnShot() throws IOException
	{
		ScreenshotPage obj=new ScreenshotPage(driver);
		obj.screenshot();
	}
	

}

