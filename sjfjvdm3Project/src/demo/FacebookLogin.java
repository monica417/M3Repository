package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.get("https://www.facebook.com/");
	   
	   driver.findElement(By.id("email")).sendKeys("8600377409");
	   driver.findElement(By.id("pass")).sendKeys("mona1590");
	   driver.findElement(By.name("login")).click();
	}

}
