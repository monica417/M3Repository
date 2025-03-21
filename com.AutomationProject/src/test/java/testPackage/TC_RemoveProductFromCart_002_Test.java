package testPackage;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;
@Listeners(genericLibrary.MyListerners.class)
public class TC_RemoveProductFromCart_002_Test extends BaseTest{
  @Test
  public void removeProductFromCart() {

		WelcomePage wp = new WelcomePage(driver);
	
		wp.getElectronicsLinks().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		ep.getSmartphoneAddToCart().click();
		
		wp.getShoppingCartLink().click();
		
		ShoppingCartPage sp=new ShoppingCartPage(driver);
		sp.getRemoveProductFromCart().click();
		sp.getUpdateAddToCart().click();
		
		SoftAssert sa = new SoftAssert();
		try {
		sa.assertEquals(sp.getSmartphoneCartProduct().isDisplayed(), false, "Product not fremoved from cart");
		}
		catch (Exception e) {
			Reporter.log("Product is removed from from cart",true);;
		}
		sa.assertAll();
  }
}
