package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/div/header/div[2]/div/a[1]") WebElement usericon;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/a[2]") WebElement createaccount;
	
	@FindBy(xpath="//input[@id='RegisterForm-FirstName']") WebElement fname;
	@FindBy(id="RegisterForm-LastName") WebElement lname;
	@FindBy(name="customer[email]") WebElement emailid;
	@FindBy(id="RegisterForm-password") WebElement pwd;
	@FindBy(xpath="//button[contains(text(),'Create')]") WebElement createbtn;
	
	@FindBy(xpath="/html/body/main/div/div/div[1]/div[1]/div[1]/div[2]/div[1]/a") WebElement logoutbtn;
	
	public Registrationpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void registration(String fn,String ln,String email,String pswd)
	{
		usericon.click();
		createaccount.click();
		
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		emailid.sendKeys(email);
		pwd.sendKeys(pswd);
		createbtn.click();
	}
	
	/*public void logOut()
	{
		logoutbtn.click();
	}*/
	
	public void demo()
	{
		usericon.click();
	}
	
	
	
	

}
