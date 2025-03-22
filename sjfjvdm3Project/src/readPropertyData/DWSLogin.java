package readPropertyData;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSLogin implements IAutoConstant {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		FileLibrabry flib = new FileLibrabry();
		String url = flib.readDataFromProperety(Prop_Path, "url");
		String email = flib.readDataFromProperety(Prop_Path, "email");
		String pass = flib.readDataFromProperety(Prop_Path, "password");
		
		driver.get(url);
		
		//driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		/*FileInputStream fis = new FileInputStream("./testData/config.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String email = prop.getProperty("email");
		String pass = prop.getProperty("password");*/
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
	}

}
