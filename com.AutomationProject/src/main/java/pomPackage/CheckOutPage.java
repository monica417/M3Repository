package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import genericLibrary.Flib;
import genericLibrary.SelectUtitiy;

public class CheckOutPage extends BaseTest{
	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement firstNameTextField;
	@FindBy(id="BillingNewAddress_LastName") 
	private WebElement lastNameTextField;
	@FindBy(id="BillingNewAddress_Email")
	private WebElement emailTextField;
	@FindBy(id="BillingNewAddress_Company")
	private WebElement companyNameTextField;
	@FindBy(xpath = "//select[@name='BillingNewAddress.CountryId']") 
	private WebElement countryDropDown;
	@FindBy(xpath = "//select[@name='BillingNewAddress.StateProvinceId']") 
	private WebElement stateDropDown;
	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTextField;
	@FindBy(id= "BillingNewAddress_Address1") 
	private WebElement addressTextField1;
	@FindBy(id= "BillingNewAddress_Address2") 
	private WebElement addressTextField2;
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement zipCodeTextField;
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneNumberTextField;
	@FindBy(id = "BillingNewAddress_FaxNumber") 
	private WebElement faxTextField;
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement continueButton;
	@FindBy(id ="billing-address-select") 
	private WebElement billingAdressOldDropdown;
	
	
	//shipping address
	
	@FindBy(xpath = "//input[@onclick='Shipping.save()']") private WebElement shippingAdressContinueButton;
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']") private WebElement ShippingMethodContinueMethod;
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']") private WebElement paymentMethodContinueMethod;
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']") private WebElement paymentInfoCotinueButton;
	@FindBy(xpath ="//input[@onclick='ConfirmOrder.save()']") private WebElement confirmOrderButton;
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")  private WebElement orderPrecessedText;
	
public CheckOutPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getCompanyNameTextField() {
		return companyNameTextField;
	}
	public WebElement getCountryDropDown() {
		//Select select=new Select(countryDropDown);
		//select.selectByVisibleText("India");
		return countryDropDown;
	}
	public WebElement getStateDropDown() {
		Select select=new Select(stateDropDown);
		select.selectByVisibleText("Other (Non US)");
		return stateDropDown;
	}
	public WebElement getCityTextField() {
		return cityTextField;
	}
	public WebElement getAddressTextField1() {
		return addressTextField1;
	}
	public WebElement getAddressTextField2() {
		return addressTextField2;
	}
	public WebElement getZipCodeTextField() {
		return zipCodeTextField;
	}
	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}
	public WebElement getFaxTextField() {
		return faxTextField;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getShippingAdressContinueButton() {
		return shippingAdressContinueButton;
	}

	public WebElement getShippingMethodContinueMethod() {
		return ShippingMethodContinueMethod;
	}

	public WebElement getPaymentMethodContinueMethod() {
		return paymentMethodContinueMethod;
	}

	public WebElement getPaymentInfoCotinueButton() {
		return paymentInfoCotinueButton;
	}

	public WebElement getConfirmOrderButton() {
		return confirmOrderButton;
	}

	public WebElement getOrderPrecessedText() {
		return orderPrecessedText;
	}
	
	
	
	public WebElement getBillingAdressOldDropdown() {
		return billingAdressOldDropdown;
	}

	//Operational Methods
	public void buyProduct() throws EncryptedDocumentException, IOException {
		
		SelectUtitiy su = new SelectUtitiy();
		try {
			
		if(billingAdressOldDropdown.isDisplayed()==true) {
		su.selectByVisibleTextMethod(billingAdressOldDropdown, "New Address");
		}
		
		}
		catch (Exception e) {
			su.selectByVisibleTextMethod(countryDropDown, "India");
		}
		
		su.selectByVisibleTextMethod(countryDropDown, "India");
		
		Flib flib=new Flib();
		int rn = flib.randomNumber();
		String city = flib.readExcelData(Excel_Path_Main, "buyproductdetails", 1, 0);
		String address1 = flib.readExcelData(Excel_Path_Main, "buyproductdetails", 1, 1);
		long pin = flib.readExcelData1(Excel_Path_Main, "buyproductdetails", 1, 2);
		long phone = flib.readExcelData1(Excel_Path_Main, "buyproductdetails", 1, 3);
		//String pin = flib.readExcelData(Excel_Path_Main, "buyproductdetails", 1, 2);
		// String phone = flib.readExcelData(Excel_Path_Main, "buyproductdetails", 1, 3);
		String phoneNo = phone+""+rn;
		cityTextField.sendKeys(city);
		addressTextField1.sendKeys(address1);
	    zipCodeTextField.sendKeys(String.valueOf(pin));
		phoneNumberTextField.sendKeys(String.valueOf(phoneNo));
		continueButton.click();
		
		shippingAdressContinueButton.click();
		ShippingMethodContinueMethod.click();
		paymentMethodContinueMethod.click();
		paymentInfoCotinueButton.click();
		//paymentInfoCotinueButton.click();
		confirmOrderButton.click();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(orderPrecessedText.isDisplayed(), true,"Order is not Placed");
	}

}
