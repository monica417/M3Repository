package testNgListerners;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNgListerners.MyListerners.class)
public class ValidLogin extends BaseTest{
	@Test
	public void validLoginTestCase() throws IOException {
		//BaseTest bt=new BaseTest();
		//bt.browserSetup();
		
		WelcomePage wb=new WelcomePage(driver);
		wb.getLoginButton().click();
		
		Flib flib=new Flib();
		String email=flib.readExcelData(Excel_path,VALIDLOGINCREDS, 1, 3);
		String password=flib.readExcelData(Excel_path, VALIDLOGINCREDS, 1, 4);
		
		LoginPage lp=new LoginPage(driver);
		lp.validLogin(email, password);
	}

}
