package testNGAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandAssetion {
  @Test
  public void validLoginTC() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demowebshop.tricentis.com/");
		 
		String expectedWelcomePage="Demo Web Shop";
		String expectedLoginPageTitle="Demo Web Shop. Login";
		Assert.assertEquals(driver.getTitle(),expectedWelcomePage,"WelCome Page Not Found!!!");
		//Assert.assertTrue(driver.getTitle().equals(expectedLoginPageTitle),"Login Page Is Not Found");
		 
		 driver.findElement(By.linkText("Log in")).click();
		// Assert.assertEquals(driver.getTitle(), expectedLoginPageTitle, "Login Page Is Not Found!!!");
		 Assert.assertTrue(driver.getTitle().equals(expectedLoginPageTitle),"Login Page Is Not Found");
		 driver.findElement(By.id("Email")).sendKeys("chandelmonica323@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("mona1590");
		 driver.findElement(By.xpath("//input[@value='Log in']")).click();
		 Thread.sleep(1000);
  }
}
