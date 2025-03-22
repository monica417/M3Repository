package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	//Declaration
	
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//a[text()='Smartphone']") private WebElement smartphoneCartProduct;
	@FindBy(xpath = "//input[@name='removefromcart']") private WebElement removeProductfromAddToCart;
    @FindBy(xpath = "//input[@value='Update shopping cart']") private WebElement updateAddToCart;
	//initialization
	
	public ShoppingCartPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getSmartphoneCartProduct() {
		return smartphoneCartProduct;
	}

	public WebElement getRemoveProductfromAddToCart() {
		return removeProductfromAddToCart;
	}

	public WebElement getUpdateAddToCart() {
		return updateAddToCart;
	}
	
	

}
