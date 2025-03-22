package pomPackage;

import java.io.IOException;

public class InvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest bt=new BaseTest();
		bt.browserSetup();
		
		WelcomePage wb=new WelcomePage(driver);
		wb.getLoginButton().click();
		
		Flib flib=new Flib();
		
		
		int rc = flib.lastRowCount(Excel_path, INVALIDLOGINCREDS);
		
		LoginPage lp=new LoginPage(driver);//create the object of LoginPage class
		
		for(int i=1;i<=rc;i++) {
			String email=flib.readExcelData(Excel_path,INVALIDLOGINCREDS, i, 0);
			String password=flib.readExcelData(Excel_path,INVALIDLOGINCREDS, i, 1);
			
			lp.invalidLogin(email, password);
		}
		
	}

}
