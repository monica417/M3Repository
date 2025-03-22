package testNgExecution2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YamahaMotors {
  @Test(groups = "Functional")
  public void launchYamahaMotors() {
	WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.yamaha-motor-india.com/");
		driver.close();
  }
}
