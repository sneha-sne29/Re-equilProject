package testpkg;

import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.Registrationpage;

public class RegistrationTest extends Basecls {
	
	@Test
	public void register() throws Exception
	{
		Registrationpage obj=new Registrationpage(driver);
		obj.registration("Raji", "P", "rathnavally019@fnail.com", "rajivijayan123");
		
		Thread.sleep(3000);
		//obj.logOut();
		//Thread.sleep(3000);
		obj.demo();
		
		System.out.println("Registration successfull");
	}

}
