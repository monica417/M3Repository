package TestNGPackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstandDependsOnMethods {
  @Test(dependsOnGroups = "register")
  public void login() {
	  Reporter.log("This is Login Method",true);
  }
  @Test(dependsOnGroups = "login")
  public void checkAccountBalance(){
	  Reporter.log("This is check account balance Method",true);
  }
  @Test
  public void register() {
	  Reporter.log("This is Register Method",true);
  }
  @Test(dependsOnGroups = {"logout","register"})
  public void logout() {
	  Reporter.log("This is Login Method",true);
  }
  @Test(dependsOnGroups = {"login","register"})
  public void moneyTransfer(){
	  Reporter.log("This is Login Method",true);
  }
}
