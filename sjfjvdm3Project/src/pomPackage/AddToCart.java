package pomPackage;

import java.io.IOException;

public class AddToCart extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.browserSetup();
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginButton().click();
		
		Flib flib=new Flib();
		String email = flib.readExcelData(Excel_path, VALIDLOGINCREDS, 1, 0);
		String password = flib.readExcelData(Excel_path, VALIDLOGINCREDS, 1, 1);
		
		
		LoginPage lp=new LoginPage(driver);
		lp.validLogin(email, password);
		
		
		wp.getElectronicsLinks().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		ep.getSmartphoneAddToCart().click();
		
		wp.getShoppingCartLink().click();
		
		ShoppingCartPage sp=new ShoppingCartPage(driver);
		
		//boolean result = sp.getSmartphoneCartProduct().isDisplayed();
		//System.out.println(result);
		
		if(sp.getSmartphoneCartProduct().isDisplayed()) {
			
			System.out.println("Product is added to cart");
		}
		else {
			System.out.println("Product is not added to cart");
		}
	}

}
