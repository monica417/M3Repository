package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	
	@FindBy(id="Email") private WebElement emailTB;
	@FindBy(id="Password") private WebElement passwordTB;
	@FindBy(xpath = "//input[@value='Log in']") private WebElement loginButton;
	@FindBy(id="RememberMe") private WebElement rememberMeCheckBox;
	@FindBy(linkText = "Forgot password?") private WebElement forgotPasswordLink;
	
	//Initialization
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//Utilization

	public WebElement getEmailTB() {
		return emailTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}
	
	
	public void validLogin(String email,String password) {
		emailTB.sendKeys(email);
		passwordTB.sendKeys(password);
		loginButton.click();
	}
	public void invalidLogin(String email,String password) {
		emailTB.sendKeys(email);
		passwordTB.sendKeys(password);
		loginButton.click();
		emailTB.clear();
		passwordTB.clear();
	}
	
	
	
	}


