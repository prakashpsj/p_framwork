package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Loginpom;
import com.Utility.BaseClass;
import com.Utility.Liabrary;



public class Test_TC_001 extends BaseClass{
	@Test
	public void verify_Testlogin_valid_credential() throws Exception {
		Loginpom login=PageFactory.initElements(driver,Loginpom.class );
		//Liabrary.custom_sendkeys(login.getEmail(), "pj@1234");
	//	Thread.sleep(5000);
		//Liabrary.custom_sendkeys(login.getPass(), "456789");
		//Thread.sleep(5000);

	//	Liabrary.custom_click(login.getLogin());
		Thread.sleep(5000);
		Liabrary.custom_sendkeys(login.getEmail(), excel.getStringData("Sheet1", 0, 0),"EmailID");
		Thread.sleep(5000);

		Liabrary.custom_sendkeys(login.getPass(), excel.getStringData("Sheet1", 0, 1),"Passward");
		Thread.sleep(5000);
	
			Liabrary.custom_click(login.getLogin(),"login");

	}
	

}
