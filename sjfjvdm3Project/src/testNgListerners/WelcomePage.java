package testNgListerners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.implementation.bind.annotation.BindingPriority;

public class WelcomePage {
	
	//Declaration
	
	@FindBy(linkText = "Register") private WebElement registerLink;
	@FindBy(linkText = "Log in") private WebElement loginButton;
    @FindBy(xpath = "//span[text()='Shopping cart']") private WebElement shoppingCartLink;
    @FindBy(xpath = "//span[text()='Wishlist']") private WebElement whishlistLink;
    @FindBy(partialLinkText = "BOOKS") private WebElement booksLink;
    @FindBy(partialLinkText = "COMPUTERS") private WebElement computersLinks;
    @FindBy(partialLinkText = "ELECTRONICS") private WebElement electronicsLinks;
    
    public WelcomePage(WebDriver driver) {
    	
    	PageFactory.initElements(driver, this);
    }

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWhishlistLink() {
		return whishlistLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLinks() {
		return computersLinks;
	}

	public WebElement getElectronicsLinks() {
		return electronicsLinks;
	}

    
    
}
