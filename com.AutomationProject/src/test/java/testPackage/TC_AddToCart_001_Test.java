package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;
@Listeners(genericLibrary.MyListerners.class)
public class TC_AddToCart_001_Test extends BaseTest {
	
	@Test

	public void addToCartMethod() throws IOException {
		
		WelcomePage wp = new WelcomePage(driver);
	
		wp.getElectronicsLinks().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		ep.getSmartphoneAddToCart().click();
		
		wp.getShoppingCartLink().click();
		
		ShoppingCartPage sp=new ShoppingCartPage(driver);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(sp.getSmartphoneCartProduct().isDisplayed(), true, "Product is not added to Cart");
		
		//boolean result = sp.getSmartphoneCartProduct().isDisplayed();
		//System.out.println(result);
		
		/*if(sp.getSmartphoneCartProduct().isDisplayed()) {
			
			System.out.println("Product is added to cart");
		}
		else {
			System.out.println("Product is not added to cart");
		}*/
	}
	
	

}
