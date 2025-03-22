package TestNGPackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderStandPriorityAttribute {
  @Test(priority = -4)
  public void login() {
	  Reporter.log("This is login method", true);
  }
  
  @Test(priority = -5)
  public void register() {
	  
	  Reporter.log("This is register method", true);
  }
  
  @Test(priority = -3)
public void checkAccountBalance() {
	  
	  Reporter.log("This is check money Method", true);
  }
  @Test(priority = -2)
public void moneyTransfer() {
	  
	  Reporter.log("This is Money Transfer method", true);
  }
  
  @Test(priority = -1)
public void logout() {
	  
	  Reporter.log("This is logout method", true);
  }
  
}
