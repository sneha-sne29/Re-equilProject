package testpkg;

import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.Loginpage;
import utilitypkg.Excelutilities;

public class LoginTest  extends Basecls{
	
	@Test
	public void login()
	{
		Loginpage ob=new Loginpage(driver);
		
		String xl="C:\\Users\\HP\\Desktop\\ReequilLogin.xlsx";
		String sheet="Sheet1";
		
		int rowcount=Excelutilities.getRowCount(xl, sheet);
		for(int i=1;i<=rowcount;i++)
		{
			String email=Excelutilities.getValues(xl, sheet, i, 0);
			System.out.println("Email id -"+email);
			
			String pwd=Excelutilities.getValues(xl, sheet, i, 1);
			System.out.println("Password -"+pwd);
			
			ob.login(email, pwd);
			ob.buttonClick();
		}
		System.out.println("Login Sucessfull");
		//ob.logOut();
		driver.navigate().back();
	}

}
