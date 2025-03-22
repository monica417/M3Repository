package testNgDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert {
  @Test
  public void validLoginTC() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demowebshop.tricentis.com/");
		 
		String expectedWelcomePage="Demo Web Shop";
		String expectedLoginPageTitle="Demo Web Shop. Login";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), expectedWelcomePage, "Welcome Page Is Not Found");
		//Assert.assertTrue(driver.getTitle().equals(expectedLoginPageTitle),"Login Page Is Not Found");
		 
		 driver.findElement(By.linkText("Log in")).click();
		 sa.assertEquals(driver.getTitle(), expectedLoginPageTitle, "Log In Page Is Not Found") ;
		// Assert.assertEquals(driver.getTitle(), expectedLoginPageTitle, "Login Page Is Not Found!!!");
		 //Assert.assertTrue(driver.getTitle().equals(expectedLoginPageTitle),"Login Page Is Not Found");
		 driver.findElement(By.id("Email")).sendKeys("chandelmonica323@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("mona1590");
		 driver.findElement(By.xpath("//input[@value='Log in']")).click();
		 Thread.sleep(1000);
		 sa.assertAll();
}
}
