package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomPackage.CheckOutPage;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;
@Listeners(genericLibrary.MyListerners.class)
public class TC_ByeProduct_003_Test  extends BaseTest{
  @Test
  public void byeProductFromCart() throws InterruptedException, EncryptedDocumentException, IOException {
		
	  WelcomePage wp = new WelcomePage(driver);
	   wp.getElectronicsLinks().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		ep.getSmartphoneAddToCart().click();
		wp.getShoppingCartLink().click();
		
		ShoppingCartPage sp=new ShoppingCartPage(driver);
		sp.getSmartPhoneCheckBox().click();
	
		
		sp.getTermsOfServicesCheckBox().click();
		sp.getCheckoutButton().click();
		
		
		CheckOutPage checkOut = new CheckOutPage(driver);
		checkOut.buyProduct();
		
		
  }
}
