package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	//Declaration
	
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']")
	private WebElement smartphoneCartProduct;
	@FindBy(xpath ="//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']/../..//input[@name='removefromcart']") private WebElement removeProductFromCart;
    @FindBy(name = "updatecart") private WebElement updateAddToCart;
    @FindBy(id="termsofservice") private WebElement termsOfServicesCheckBox;
    @FindBy(name = "continueshopping") private WebElement continueShopping;
    @FindBy(id = "checkout") private WebElement checkoutButton;
    @FindBy(xpath = "//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']/../..//input[@name='removefromcart']")
    private WebElement smartPhoneCheckBox;
	//initialization //h1[text()='Shopping cart']/../..
	
	public ShoppingCartPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSmartphoneCartProduct() {
		return smartphoneCartProduct;
	}

	public WebElement getRemoveProductFromCart() {
		return removeProductFromCart;
	}

	public WebElement getUpdateAddToCart() {
		return updateAddToCart;
	}

	public WebElement getTermsOfServicesCheckBox() {
		return termsOfServicesCheckBox;
	}

	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public WebElement getSmartPhoneCheckBox() {
		return smartPhoneCheckBox;
	}

	
}
