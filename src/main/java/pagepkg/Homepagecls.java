package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepagecls {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/div/header/div[1]/a/img") WebElement logo;
	//@FindBy(xpath="//*[@id=\"shopify-section-template--16099466019002__7ad808b9-dfec-4625-bde9-7bd0c58365a8\"]/div/div/div[1]/div/strong") WebElement txt;
	@FindBy(xpath="/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/strong[1]") WebElement txt;
	
	public Homepagecls(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoVerification()
	{
		Boolean b=logo.isDisplayed();
		if(b)
		{
			System.out.println("Logo is present");
		}
		else
		{
			System.out.println("Logo is not present");
		}
	}
	
	public void textPrint()
	{
		String text=txt.getText();
		System.out.println("The main heading is : "+text);
	}
	
	public void contentVerification()
	{
		String sc=driver.getPageSource();
		if(sc.contains("Care Tips"))
		{
			System.out.println("Content verification passed");
		}
		else
		{
			System.out.println("Conetnt verification failed");
		}
		
	}

}
