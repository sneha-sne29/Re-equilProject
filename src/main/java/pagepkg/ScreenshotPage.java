package pagepkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenshotPage {
	WebDriver driver;
	
	@FindBy(xpath="//header/div[1]/a[1]/img[1]") WebElement logo;
	
	public ScreenshotPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void screenshot() throws IOException
	{
		File sc=logo.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc,new File("./ElementScrnShot/logoimg.png"));
	}
}
