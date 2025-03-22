package testNgDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithDataProvider {
  @DataProvider(name="logincreds")
  public String[] [] dataProviderMethod() {
	  String [][] data= {
			  
			  {"admin123@gmail.com","manager123"},
			  {"a d m i n@gmail.com","test123"},
			  {"gfsgha@gmail.com","dhdsfbhf"}
	  };
	  return data;
  }
  
  @Test(dataProvider = "logincreds",dataProviderClass = testNgDataProvider.LoginWithDataProvider.class)
  public void invalidLogin(String email,String password) throws InterruptedException
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://demowebshop.tricentis.com/");
	 
	 driver.findElement(By.linkText("Log in")).click();
	 driver.findElement(By.id("Email")).sendKeys(email);
	 driver.findElement(By.id("Password")).sendKeys(password);
	 driver.findElement(By.xpath("//input[@value='Log in")).click();
	 Thread.sleep(1000);
  }
}
