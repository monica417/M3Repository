package pomPackage;

import java.io.IOException;

public class ValidLogin extends BaseTest{
	public static void main(String[] args) throws IOException {
		BaseTest bt=new BaseTest();
		bt.browserSetup();
		
		WelcomePage wb=new WelcomePage(driver);
		wb.getLoginButton().click();
		
		Flib flib=new Flib();
		String email=flib.readExcelData(Excel_path,VALIDLOGINCREDS, 1, 0);
		String password=flib.readExcelData(Excel_path, VALIDLOGINCREDS, 1, 1);
		
		LoginPage lp=new LoginPage(driver);
		lp.validLogin(email, password);
	}

}
