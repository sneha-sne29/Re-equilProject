package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[4]/div/header/div[2]/div/a[2]") WebElement carticon;
	@FindBy(xpath="//button[@id='CartDrawer-Checkout']") WebElement checkoutbtn;
	@FindBy(xpath="//header/div[2]/div[1]/a[1]/*[1]") WebElement usericon;
	@FindBy(xpath="//a[contains(text(),'View addresses (1)')]") WebElement viewaddr;
	
	
	@FindBy(name="email") WebElement contactemail;
	@FindBy(xpath="//*[@id=\"Select0\"]") WebElement country;
	@FindBy(name="firstName") WebElement fname;
	@FindBy(name="lastName") WebElement lname;
	@FindBy(name="address1") WebElement addr;
	@FindBy(xpath="//input[@id='TextField5']") WebElement city;
	@FindBy(xpath="//*[@id=\"Select2\"]") WebElement state;
	@FindBy(name="postalCode") WebElement pincode;
	@FindBy(name="phone") WebElement phone;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[2]/div/button") WebElement continuentn;
	
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addAddress(String fn,String ln,String ad,String cty,String pin,String phn)
	{		
		
		contactemail.clear();
		contactemail.click();
		
		Select con=new Select(country);
		con.selectByValue("0");
		
		fname.clear();
		fname.sendKeys(fn);
		
		lname.clear();
		lname.sendKeys(ln);
		
		addr.clear();
		addr.sendKeys(ad);
		
		city.clear();
		city.sendKeys(cty);
		
		Select st=new Select(state);
		st.selectByVisibleText("Kerala");
		
		pincode.clear();
		pincode.sendKeys(pin);
		
		phone.clear();
		phone.sendKeys(phn);
		
		continuentn.click();
	}

}
