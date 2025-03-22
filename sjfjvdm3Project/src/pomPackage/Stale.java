package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement email = driver.findElement(By.id("Email"));
	//	email.sendKeys("chandelmonica323@gmail.com");
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		//email.se
		
		
		driver.findElement(By.id("Email")).sendKeys("chandelmonica323@gmail.com");
		Thread.sleep(1000);
		
		WebElement pass = driver.findElement(By.id("Password"));
		pass.sendKeys("mona1590");
		
	WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
	loginButton.click();
		
	}
	

}
