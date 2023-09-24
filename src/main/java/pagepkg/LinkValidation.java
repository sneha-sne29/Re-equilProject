package pagepkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;


public class LinkValidation {
	WebDriver driver;
	
	public LinkValidation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void link(String about)
	{
		String li=about;
		driver.get(li);
		validate(li);
	}
	private void validate(String li)
	{
		try {
			URL u=new URL(li);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("Success code..And the link is----"+li);
			}
			else
			{
				System.out.println("Broken link...And the link is----"+li);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error---"+ex.getMessage());
		}
	}
	

}
