package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/div/header/div[2]/div/a[1]") WebElement usericon;
	
	@FindBy(id="CustomerEmail") WebElement emailid;
	@FindBy(id="CustomerPassword") WebElement pwd;
	@FindBy(xpath="//*[@id=\"customer_login\"]/button") WebElement siginbtn;
	
	//@FindBy(xpath="/html/body/main/div/div/div[1]/div[1]/div[1]/div[2]/div[1]/a") WebElement logoutbtn;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String email,String pswd)
	{
		usericon.click();
		
		emailid.sendKeys(email);
		pwd.sendKeys(pswd);
	}
	
	public void buttonClick()
	{
		siginbtn.click();
	}
	
	/*public void logOut()
	{
		logoutbtn.click();
	}*/
	

}
