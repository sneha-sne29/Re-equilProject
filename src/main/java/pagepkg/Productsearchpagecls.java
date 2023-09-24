package pagepkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Productsearchpagecls {
	
	WebDriver driver;
	
	@FindBy(name="q") WebElement searchbar;
	@FindBy(xpath="//body[1]/main[1]/section[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/span[1]") WebElement article;
	@FindBy(xpath="//body[1]/main[1]/section[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/span[1]") WebElement exprtsession;
	@FindBy(xpath="//body/main[@id='MainContent']/section[@id='shopify-section-template--16185589334202__main']/div[1]/div[2]/div[2]/ul[1]/li[4]") WebElement podcast;
	@FindBy(xpath="//body[1]/main[1]/section[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[1]") WebElement products;
	
	@FindBy(xpath="//*[@id=\"Filter-filter.p.m.my_fields.suited_for_description-1\"]") WebElement filter;
	@FindBy(xpath="//*[@id=\"CardLink--4537463341188\"]") WebElement pdt;
	
	
	@FindBy(xpath="//select[@id='Quantity-template--16185589301434__main']") WebElement num;
	
	@FindBy(name="PostalCode") WebElement pincode;
	@FindBy(xpath="//span[contains(text(),'check')]") WebElement checkbtn;
	@FindBy(name="add") WebElement cart;
	
	@FindBy(xpath="//header/div[2]/div[1]/a[2]/*[1]") WebElement carticon;
	//@FindBy(xpath="//*[@id=\"CartDrawer-Item-1\"]/div[2]/div[2]/div/div[1]/div[1]/quantity-input/button[1]") WebElement quantity;
	
	
	//@FindBy(xpath="//span[contains(text(),'Place Order')]") WebElement checkoutbtn;
	
	public Productsearchpagecls(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void search(String item)
	{
		searchbar.sendKeys(item,Keys.ENTER);
		article.click();
		exprtsession.click();
		podcast.click();
		products.click();
		
		filter.click();
		pdt.click();
			
	}
	
	public void addToCart(String itemnum,String pin)
	{
		
		Select prodnum=new Select(num);
		prodnum.selectByValue(itemnum);
		
		pincode.sendKeys(pin);
		checkbtn.click();

		cart.click();
		
	}
	
	/*public void cart()
	{
		carticon.click();
		//quantity.click();
		//checkoutbtn.click();
	}*/
	

	

}
